package com.ctel.hpfs.control;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ctel.hpfs.response.Response;
import com.ctel.hpfs.service.PublisherService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/hpfs/produce")
public class PublisherController {
	@Autowired
	PublisherService service;
	@Autowired
	ObjectMapper map;

	@GetMapping("/payload")
	public ResponseEntity<?> publishPayload(@RequestBody Object obj) {
		String obb = "";
		try {
			obb = map.writeValueAsString(obj);
			System.out.println("producer" + obb);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (obb.substring(1, obb.length() - 1).isBlank()) {
			return ResponseEntity.status(HttpStatus.NO_CONTENT)
					.body(new Response<>(HttpStatus.NO_CONTENT.value(), "No Content", obj));
		}

		else {
			Response<?> res = service.producePayLoad(obb);

			if (res.getMessage().equals("Published"))
				return ResponseEntity.status(HttpStatus.ACCEPTED)
						.body(new Response<>(HttpStatus.ACCEPTED.value(), res.getMessage(), obj));

			else
				return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
						.body(new Response<>(HttpStatus.INTERNAL_SERVER_ERROR.value(), res.getMessage(), obj));
		}
	}

}
