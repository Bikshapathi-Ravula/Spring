package com.ctel.HpfsApRedis.service;

import java.util.Calendar;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TimeZone;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.ctel.HpfsApRedis.configuration.ApiResponse;
import com.ctel.HpfsApRedis.configuration.ReddicacheDao;
import com.ctel.HpfsApRedis.entity.GOAP_SH_REGISTER;
import com.ctel.HpfsApRedis.entity.Model;
import com.ctel.HpfsApRedis.repositary.Repositary;

@SuppressWarnings("serial")
@Service
public class ServiceImplementation extends Exception {
	private static final org.slf4j.Logger logs = LoggerFactory.getLogger(Service.class);
	String msg;

	// Constructor with message parameter
	public ServiceImplementation(String msg) {
		super(msg);
		this.msg = msg;
	}

	ServiceImplementation() {

	}

	@Autowired
	private Repositary jpaRepositary;

	@Autowired
	private ReddicacheDao dao;

//	@Transactional(timeout = 1000000000)
//	public ApiResponse<?> getAllEntryFromReddis() {
//		ApiResponse<?> response = new ApiResponse<>();
//
//		try {
//			Map<String, Object> all = dao.findAll();
//			System.out.println("CACHE DATA FETCHING SIZE " + all.size());
//			if (all.size() > 0) {
//				response.setMessage("FOUND");
//				response.setSize(all.size() + "");
//all
//			} else {
//				throw new ServiceImplementation("Not Found");
//			}
//		} catch (Exception e) {
//			response.setMessage(e.getMessage());
//		}
//
//		return response;
//	}

	public ApiResponse<Map<String, GOAP_SH_REGISTER>> getNewStatusShCode() {
		long start = System.currentTimeMillis();
		logs.info("Enter into Target Db to Collect Data");
		List<GOAP_SH_REGISTER> re = jpaRepositary.getData();
		logs.info("Data Collected size = " + re.size() + " processed Time " + (System.currentTimeMillis() - start)
				+ " millis");

		logs.info("Enter into Reddis Cache Data Source to Store collected data");
		long redisstart = System.currentTimeMillis();
		ApiResponse<Map<String, GOAP_SH_REGISTER>> total = dao.save(re);

		logs.info("   processed Time on Reddis is  " + (System.currentTimeMillis() - redisstart) + " millis");
//		logs.info("Bulk Data processing to CouchDb");
		// repoo.bulkInsertion(re);
		// System.out.println("processing couch db insertion: " +
		// (System.currentTimeMillis() - start));
		return total;
	}

	public ApiResponse<GOAP_SH_REGISTER> geDataFromRedisByKey(String key) {
		ApiResponse<GOAP_SH_REGISTER> response = new ApiResponse<>();
		try {
			Optional<GOAP_SH_REGISTER> optionalData = Optional.ofNullable(dao.get(key));

			if (optionalData.isPresent()) {
				GOAP_SH_REGISTER data = optionalData.get();
				response.setMessage("FOUND");
				response.setData(data);
				response.setSize(List.of(data).size() + ""); 
			} else {
				response.setMessage("Not Found");
			}
		} catch (Exception e) {
			logs.error("Error retrieving data from Redis: {}", e.getMessage(), key);
			response.setMessage("Error: " + e.getMessage());
		}
		return response;
	}

	public ApiResponse<?> updateBottle(GOAP_SH_REGISTER entry) {
//		List<?> ICdCiD = jpaRepositary.getIcDcIdByByShcode(entry.getShCode());
		Calendar calendar = Calendar.getInstance();
		calendar.setTimeZone(TimeZone.getTimeZone("UTC"));
		calendar.setTimeInMillis(calendar.getTimeInMillis());
		entry.setStatus("15");
		entry.setUpdatedOn(calendar.getTime());

		entry.setUpdatedBy("Redis");
		return dao.update(/* ICdCiD, */ entry);
	}

	/*
	 * @Transactional public String updateBottleSellStatusToTargetDb(TTS_SH_REGISTER
	 * tts_SH_REGISTER) { String msg = ""; com.ctel.redisExasamp.doc.TTS_SH_REGISTER
	 * register = new com.ctel.redisExasamp.doc.TTS_SH_REGISTER();
	 * BeanUtils.copyProperties(tts_SH_REGISTER, register);
	 * 
	 * System.out.println("Register details: " + register.toString());
	 * 
	 * try { System.out.println("Updating SH_CODE: " + register.getShCode());
	 * repo.updateBotleSellStatusByShcode(register.getShCode());
	 * 
	 * }
	 * 
	 * catch (DataAccessException e) { String status =
	 * repo.checkStatusOfShcode(register.getShCode()); System.out.println(status +
	 * "+++++++++++++++++++++++++++++++++++++++"); if ("15".equals(status)) { msg =
	 * "Updated"; } else { msg = "Status not updated correctly"; } //
	 * System.err.println("Data access error: " + e.getMessage()); // msg =
	 * "Data access error: " + e.getMessage(); } catch (Exception e) {
	 * System.err.println("General error: " + e.getMessage()); msg =
	 * "General error: " + e.getMessage(); e.printStackTrace(); }
	 * 
	 * return msg; }
	 */

	public ApiResponse<?> bottleBreakage(GOAP_SH_REGISTER goap_SH_REGISTER) {
		goap_SH_REGISTER.setStatus("46");
		return dao.bottleBreakage(goap_SH_REGISTER);

	}
}
