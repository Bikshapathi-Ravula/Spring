package com.ctel.HpfsApRedis.configuration;

import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.slf4j.LoggerFactory;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import com.ctel.HpfsApRedis.entity.GOAP_SH_REGISTER;

import jakarta.annotation.Resource;

@Service
public class ReddicacheDao {

	private static final org.slf4j.Logger logs = LoggerFactory.getLogger(ReddicacheDao.class);
	public static String SHIPMENT_HASH_KEY = "GOAP_SH_REGISTER";
	@Resource(name = "redis") // 'redisTemplate' is defined as a Bean in RedisConfig.java
	private HashOperations<String, String, GOAP_SH_REGISTER> hashOperations;

	@Resource(name = "redis")
	private RedisTemplate<String, GOAP_SH_REGISTER> template;
	int oldcount = 0;
	int newCount = 0;

//insert data to Redis Cache
	public ApiResponse<Map<String, GOAP_SH_REGISTER>> save(List<GOAP_SH_REGISTER> entity) {
		ApiResponse<Map<String, GOAP_SH_REGISTER>> res = new ApiResponse<>();

		logs.info("ENTERED INTO  Redis Cache to " + "SAVE()" + entity.size());
		Map<String, GOAP_SH_REGISTER> mapp = new HashMap<>();

//		final int SH_CODE_INDEX = 0;
//		final int PRODUCT_CODE_INDEX = 1;
//		final int SUPPLIER_CODE_INDEX = 2;
//		final int BATCH_NUMBER_INDEX = 3;
//		final int LOT_NUMBER_INDEX = 4;
//		final int CE_NUMBER_INDEX = 5;
//		final int MFG_DATE_INDEX = 6;
//		final int DISPOSAL_DATE_INDEX = 7;
//		final int MRP_INDEX = 8;
//		final int EXPIRY_DATE_INDEX = 9;
//		final int MFG_LOC_ID_INDEX = 10;
//		final int DEPOT_LOC_ID_INDEX = 11;
//		final int VENDOR_REG_NO_INDEX = 12;
//		final int CURRENT_LOC_ID_INDEX = 13;
//		final int CASE_BARCODE_INDEX = 14;
//		final int PACK_TYPE_INDEX = 15;
//		final int PRODUCT_NAME_INDEX = 16;
//		final int PREVIOUS_CASE_BARCODE_INDEX = 17;
//		final int STATUS_INDEX = 18;
//		final int STATUS_TEXT_INDEX = 19;
//		final int ALLOCATION_ID_INDEX = 20;
//		final int CREATED_BY_INDEX = 21;
//		final int CREATED_ON_INDEX = 22;
//		final int UPDATED_BY_INDEX = 23;
//		final int UPDATED_ON_INDEX = 24;
//		final int MFG_NAME_INDEX = 25;
//		final int DEPOT_NAME_INDEX = 26;
//		final int VENDOR_LOC_ID_INDEX = 27;
//		final int VENDOR_LOC_NAME_INDEX = 28;
//		final int SOLD_ON_INDEX = 29;
//		final int SPOOL_BARCODE_INDEX = 30;
//		final int PURPOSE_INDEX = 31;
//		final int INTENDED_STATE_INDEX = 32;
//		final int VERIFICATION_ID_INDEX = 33;
//		final int BRAND_NUMBER_INDEX = 34;
//		final int IMPORT_PERMIT_ID_INDEX = 35;
//		final int SIZE_CODE_INDEX = 36;
//		final int DC_ID_INDEX = 37;
//		final int CHALLAN_INDENT_ID_INDEX = 38;
//		final int GRN_ID_INDEX = 39;
//		int t = 0;
//		for (int i = 0; i <= entity.size() - 1; i++) {
//			Object[] object = (Object[]) entity.get(i);
//			GOAP_SH_REGISTER model = new GOAP_SH_REGISTER();

//			try {
//				model.setShCode((String) object[SH_CODE_INDEX]);
//				model.setProductCode((String) object[PRODUCT_CODE_INDEX]);
//				model.setSupplierCode((String) object[SUPPLIER_CODE_INDEX]);
//				model.setBatchNumber((String) object[BATCH_NUMBER_INDEX]);
//				model.setLotNumber((String) object[LOT_NUMBER_INDEX]);
//				model.setCeNumber((String) object[CE_NUMBER_INDEX]);
//				model.setMfgDate((Date) object[MFG_DATE_INDEX]);
//				model.setDisposalDate((Date) object[DISPOSAL_DATE_INDEX]);
//				model.setMrp(new BigDecimal((Double) object[MRP_INDEX]));
//				model.setExpiryDate((Date) object[EXPIRY_DATE_INDEX]);
//				model.setMfgLocId((String) object[MFG_LOC_ID_INDEX]);
//				model.setDepotLocId((String) object[DEPOT_LOC_ID_INDEX]);
//				model.setVendorRegNo((String) object[VENDOR_REG_NO_INDEX]);
//				model.setCurrentLocId((String) object[CURRENT_LOC_ID_INDEX]);
//				model.setCaseBarcode((String) object[CASE_BARCODE_INDEX]);
//				model.setPackType((String) object[PACK_TYPE_INDEX]);
//				model.setProductName((String) object[PRODUCT_NAME_INDEX]);
//				model.setPreviousCaseBarcode((String) object[PREVIOUS_CASE_BARCODE_INDEX]);
//				model.setStatus((String) object[STATUS_INDEX]);
//				model.setStatusText((String) object[STATUS_TEXT_INDEX]);
//				model.setAllocationId((String) object[ALLOCATION_ID_INDEX]);
//				model.setCreatedBy((String) object[CREATED_BY_INDEX]);
//				model.setCreatedOn((Date) object[CREATED_ON_INDEX]);
//				model.setUpdatedBy((String) object[UPDATED_BY_INDEX]);
//				model.setUpdatedOn((Date) object[UPDATED_ON_INDEX]);
//				model.setMfgName((String) object[MFG_NAME_INDEX]);
//				model.setDepotName((String) object[DEPOT_NAME_INDEX]);
//				model.setVendorLocId((String) object[VENDOR_LOC_ID_INDEX]);
//				model.setVendorLocName((String) object[VENDOR_LOC_NAME_INDEX]);
//				model.setSoldOn((Date) object[SOLD_ON_INDEX]);
//				model.setSpoolBarcode((String) object[SPOOL_BARCODE_INDEX]);
//				model.setPurpose((String) object[PURPOSE_INDEX]);
//				model.setIntendedState((String) object[INTENDED_STATE_INDEX]);
//				model.setVerificationId((String) object[VERIFICATION_ID_INDEX]);
//				model.setBrandNumber((String) object[BRAND_NUMBER_INDEX]);
//				model.setImportPermitId((String) object[IMPORT_PERMIT_ID_INDEX]);
//				model.setSizeCode((String) object[SIZE_CODE_INDEX]);
//				model.setDcId((String) object[DC_ID_INDEX]);
//				model.setChallanIndentId((String) object[CHALLAN_INDENT_ID_INDEX]);
//				model.setGrnId((String) object[GRN_ID_INDEX]);
		entity.forEach(records -> {

			if (get(records.getShCode()) == null) {
				hashOperations.put(records.getShCode(), records.getShCode(), records);
				mapp.put(records.getShCode(), records);
				newCount += 1;
				logs.info("New Record Inserted into Redis " + records.getShCode());
			} else {
				oldcount += 1;
				logs.info("Already Records Existed in Redis Against " + records.getShCode());
				mapp.put(records.getShCode(), records);
			}

		});
		System.out.println("old" + oldcount + "\t" + "new" + newCount);

		oldcount = 0;
		newCount = 0;
		res.setData(mapp);
		res.setMessage("Inserted Into Redis");
		res.setSize(mapp.size() + "");
		return res;
	}

//Retreiving from Redis Cache
//	@org.springframework.transaction.annotation.Transactional(timeout = 1000000000)
//
//	public Map<String, Object> findAll() {
//		Map<String, Object> allData = new HashMap<>();
//		HashOperations<String, Object, Object> hashOperations = template.opsForHash();
//		Set<String> keys = template.keys("*"); // Get all keys in the Redis database
//		hashOperations.
//
//		// Iterate over each key and retrieve its hash entries
//		if (keys != null) {
//			for (String key : keys) {
//				Map<Object, Object> entries = hashOperations.entries(key);
//				allData.put(key, entries); // Store the entries under the key name
//			}
//		}
//
//		return allData;
//	}

// finding data from Redis by key is Shcode  
	public GOAP_SH_REGISTER get(String model/* , List<?> list */) {
//		System.out.println(hashOperations + "connection");
//		System.out.println("*" + model.substring(model.lastIndexOf("_") + 1) + "LAST");
//		Object[] ob = (Object[]) list.get(0);
		return hashOperations.get(model, model);

	}

	public ApiResponse<?> update(/* List<?> list, */ GOAP_SH_REGISTER entry) {
		String msg = "";
		ApiResponse<GOAP_SH_REGISTER> apiResponse = new ApiResponse<>();
		try {
			if (entry == null || entry.getStatus().isEmpty()) {
				throw new IllegalArgumentException("Key and status must not be null or empty");
			} else {
////				Object[] ob = (Object[]) list.get(0);
////
////				String Hashkey = (String) ob[1] + "_" + (String) ob[0] + "_" + entry.getShCode();
//				DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE MMM dd HH:mm:ss z yyyy");
//
//				// Parse the original date and time
//				LocalDateTime localDateTime = LocalDateTime.parse(entry.getUpdatedOn().toString(), formatter);
//
//				// Convert LocalDateTime to ZonedDateTime for IST timezone
//				ZoneId zoneId = ZoneId.of("Asia/Kolkata");
//				ZonedDateTime zonedDateTime = localDateTime.atZone(zoneId);
//
//				// Add 3 days
//				ZonedDateTime newDateTime = zonedDateTime.plusDays(3);
//				entry.setExpiryDate(Date.from(newDateTime.toInstant()));
//				// Format the ZonedDateTime back to String
//				hashOperations.put(entry.getShCode(), entry.getShCode(), entry);
				msg = "Updated";
				if (msg.equals("Updated")) {
					template.expire(entry.getShCode(), 3, TimeUnit.DAYS);
					logs.info("Bottel Updated And expired on " + 3 + " Days");
					apiResponse.setStatus(msg);
					LocalDateTime dateTime = LocalDateTime.now();
					apiResponse
							.setMessage("Key " + entry.getShCode() + " expires  on "
									+ LocalDateTime.of(dateTime.getYear(), dateTime.getMonth(),
											dateTime.getDayOfMonth() + 3, dateTime.getHour(), dateTime.getMinute())
									+ "Redis");
					apiResponse.setData(get(entry.getShCode()));
					apiResponse.setSize(List.of(apiResponse).size() + "");
				}
			}
		} catch (IllegalArgumentException e) {
			apiResponse.setStatus(e.getMessage());
			logs.error("Something Went Wrong On Update Bottel On Redis msg is " + e.getMessage());
		} catch (Exception e) {
			apiResponse.setMessage(e.getMessage());
			logs.error("Something Went Wrong On Update Bottel On Redis msg is" + e.getMessage());
		}

		return apiResponse;
	}

	public ApiResponse<Map<String, GOAP_SH_REGISTER>> bottleBreakage(GOAP_SH_REGISTER entry) {
		// GOAP_SH_REGISTER goap_SH_REGISTER = new GOAP_SH_REGISTER();

		ApiResponse<Map<String, GOAP_SH_REGISTER>> res = new ApiResponse<>();

		try {
			// Updating Status for Bottle Breakage By ShCode into The RedisCache
			GOAP_SH_REGISTER goap_SH_REGISTER2 = get(entry.getShCode());
			if (goap_SH_REGISTER2 != null) {
				goap_SH_REGISTER2.setStatus("42");

				hashOperations.put(entry.getShCode(), entry.getShCode(), goap_SH_REGISTER2);
				res.setStatus("200");
				res.setMessage("Bottle Breakage Updated");

				// Set expiration for the entry for 5 days
				template.expire(entry.getShCode(), 5, TimeUnit.DAYS);

				// Set the data in the response
				res.setData(Map.of(entry.getShCode(), goap_SH_REGISTER2));
			} else {
				res.setShCode(entry.getShCode());
				res.setMessage(" Not Found On Redis");

			}
		} catch (IllegalArgumentException e) {
			logs.error("error Occured At BottleBreakage(" + e.getMessage() + ")");
			res.setMessage(e.getMessage().contains("non null key required") ? "No Payload" : res.getMessage());
		} catch (Exception e) {
			res.setMessage(e.getMessage());
		}

		return res;
	}

}