package com.ctel.HpfsApRedis.controller;

import java.util.Map;
import java.util.Optional;
import java.util.PriorityQueue;
import java.util.Queue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.HpfsApRedis.configuration.ApiResponse;
import com.ctel.HpfsApRedis.entity.GOAP_SH_REGISTER;
import com.ctel.HpfsApRedis.service.ServiceImplementation;

@RestController
@Controller
@RequestMapping("/AP")
public class ApiController {

	private static final Logger logs = LoggerFactory.getLogger(ApiController.class);

	@Autowired
	ServiceImplementation ser;

//	@GetMapping("/all")
//	public ResponseEntity<?> getCases() {
//
//		long starttime = System.currentTimeMillis();
//		ApiResponse<?> s = ser.getAllEntryFromReddis();
//		long endtime = System.currentTimeMillis();
//
//		logs.info("Processing Time ----->" + (endtime - starttime) + "millis");
//		if (s != null) {
//			logs.info("Status-------->" + s.getMessage());
//
//			return ResponseEntity.status(HttpStatus.FOUND).body(s);
//		} else
//			return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(s);
//
//	}

	@GetMapping("/insert/Redis")
	public ApiResponse<Map<String, GOAP_SH_REGISTER>> saveCasestoRedis() {

		return ser.getNewStatusShCode();
	}

	Queue<String> p = new PriorityQueue<>();

	@GetMapping("/get/Redis")
	public ResponseEntity</* ApiResponse<GOAP_SH_REGISTER> */ String> get(@RequestParam(name = "key") String key) {

		p.add(key);
		System.out.println(p.toString());
//		
//		long startTime = System.currentTimeMillis();
//		logs.info("Received key: {}", key);
//
//		ApiResponse<GOAP_SH_REGISTER> response = ser.geDataFromRedisByKey(key);
//
//		long endTime = System.currentTimeMillis();
//		logs.info("Processing Time: {} millis", (endTime - startTime));
//
//		if (response != null && "FOUND".equals(response.getMessage())) {
//			logs.info("Status: {}", response.getMessage());
//			return ResponseEntity.ok(response);
//		} else {
//			logs.warn("Data not found for key: {}", key);
//			return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
//		}
		return ResponseEntity.status(HttpStatus.NOT_FOUND).body(p.toString()+"\n");
	}

	@PostMapping("/update/bottle")
	public ResponseEntity<String> updateBottleByShcode(@RequestBody GOAP_SH_REGISTER tts_SH_REGISTER) {
		ApiResponse<?> apiResponse = ser.updateBottle(tts_SH_REGISTER);
		return apiResponse.getStatus().equals("Updated")
				? ResponseEntity.status(HttpStatus.OK).body(apiResponse.getMessage())
				: ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(apiResponse.getMessage());
	}

	/*
	 * @Scheduled(cron="0 0 23 * *") public void expireEntry() {
	 * 
	 * }
	 */

	@PostMapping("/breakage/bottle")
	public ResponseEntity<?> breakageOrShortageMethod(@RequestBody GOAP_SH_REGISTER breakageBottle) {
		if (Optional.ofNullable(breakageBottle).isEmpty()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT).body(Map.of("message", "No PayLoad"));
		} else {
			ApiResponse<?> apiResponse = ser.bottleBreakage(breakageBottle);
			System.out.println("Shcode " + breakageBottle.toString() + "\t" + "Status " + breakageBottle.getStatus());

			// Check if apiResponse.getStatus() is null before calling equals
			if ("200".equals(apiResponse.getStatus())) {
				return ResponseEntity.status(HttpStatus.OK).body(apiResponse);
			} else {
				return ResponseEntity.status(HttpStatus.PRECONDITION_FAILED).body(apiResponse);
			}
		}
	}

//	@GetMapping("/sse")
//	public SseEmitter handleSse() {
//		SseEmitter emitter = new SseEmitter();
//
//		Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
//			try {
//				  Map<String, Object> allData = new HashMap<>();
//			        Set<String> keys = redisTemplate.keys("*"); // Get all keys
//
//			        if (keys != null) {
//			            for (String key : keys) {
//			                Object value = redisTemplate.opsForValue().get(key); // Get value for each key
//			                allData.put(key, value);
//			            }
//			        }
//
//			        return allData;
//				http://localhost:8084/AP/sse
//// 	                  Send a message to the client
//				emitter.send("Current time: " + System.currentTimeMillis());
//			} catch (IOException e) {
//				emitter.completeWithError(e);
//			}
//		}, 0, 1, TimeUnit.SECONDS); // Send a message every second
//
//// 	          Complete the emitter when done
//		emitter.onCompletion(() -> System.out.println("SSE completed"));
//		emitter.onTimeout(() -> {
//			System.out.println("SSE timed out");
//			emitter.complete();
//		});
//
//		return emitter;
//	}

//	import org.springframework.web.bind.annotation.GetMapping;
//	import org.springframework.web.bind.annotation.RestController;
//	import org.springframework.web.servlet.mvc.method.annotation.SseEmitter;
//
//	import java.io.IOException;
//	import java.util.concurrent.Executors;
//	import java.util.concurrent.TimeUnit;

//	@RestController
//	public class SseController {
//
//	    @GetMapping("/sse")
//	    public SseEmitter handleSse() {
//	        SseEmitter emitter = new SseEmitter();
//
//	        Executors.newSingleThreadScheduledExecutor().scheduleAtFixedRate(() -> {
//	            try {
//	                // Send a message to the client
//	                emitter.send("Current time: " + System.currentTimeMillis());
//	            } catch (IOException e) {
//	                emitter.completeWithError(e);
//	            }
//	        }, 0, 1, TimeUnit.SECONDS); // Send a message every second
//
//	        // Complete the emitter when done
//	        emitter.onCompletion(() -> System.out.println("SSE completed"));
//	        emitter.onTimeout(() -> {
//	            System.out.println("SSE timed out");
//	            emitter.complete();
//	        });
//
//	        return emitter;
//	    }
//	}
//
//}
}