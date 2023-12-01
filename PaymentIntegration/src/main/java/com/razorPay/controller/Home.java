package com.razorPay.controller;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Optional;

import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.razorPay.model.Customer;
import com.razorPay.model.RazorPay;
import com.razorPay.model.Response;
import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@Controller
public class Home {

	private  static Optional<RazorpayClient> client;
	JSONObject options = new JSONObject();

	/**
	 * add your secretId and secretValue you got from your RazorPay account.
	 */
	@Value("${razorpay.client}")

	private String secret;
	@Value("${razorpaySecret}")

	private String key;

//	public Home() throws RazorpayException {
//	
//	}

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String getHome() throws RazorpayException {
		this.client = Optional.ofNullable((new RazorpayClient(secret, key)));
//		System.out.println(client);
		return "indexes";
	}

	@RequestMapping(value = "/createPayment", method = RequestMethod.POST)
	@ResponseBody
	public Response createOrder(@RequestBody Customer customer) throws JsonProcessingException {
		Order order = null;
		RazorPay razorPay = null;
		Response ss = new Response();

		// if (!client.isPresent())
		try {
			this.client = Optional.ofNullable(new RazorpayClient(secret, key));
			order = createRazorPayOrder(Integer.valueOf(customer.getAmount()));
			razorPay = getRazorPay((String) order.get("id"), customer);
			ObjectMapper r = new ObjectMapper();
			String result = r.writeValueAsString(razorPay);
			System.out.println(result);
			if (order != null && razorPay != null) {
				ss.setStatusCode(200);
				ss.setRazorPay(razorPay);
			} else {
				ss.setStatusCode(204);
				ss.setRazorPay(null);
			}

		} catch (RazorpayException e) {
			// TODO Auto-generated catch block
			System.out.println("Client Authentication Failed");
			e.printStackTrace();
		}
		System.out.println(client);
		/**
		 * creating an order in RazorPay. new order will have order id. you can get this
		 * order id by calling order.get("id")
		 */  
//		return ResponseEntity.ok().body(razorPay);
		return ss;
	}

	private Response getResponse(RazorPay razorPay, int statusCode) {
		Response response = new Response();
		response.setStatusCode(statusCode);
		response.setRazorPay(razorPay);
		return response;
	}

	private RazorPay getRazorPay(String orderId, Customer customer) {
		System.out.println(orderId);
		RazorPay razorPay = new RazorPay();
		razorPay.setApplicationFee(customer.getAmount());
		razorPay.setCustomerName(customer.getCustomerName());
		razorPay.setCustomerEmail(customer.getEmail());
		razorPay.setMerchantName("Test");
		razorPay.setPurchaseDescription("TEST PURCHASES");
		razorPay.setRazorpayOrderId(orderId);
		razorPay.setSecretKey(secret);
		razorPay.setImageURL("/logo");
		razorPay.setTheme("#F37254");
		razorPay.setNotes("notes" + orderId);

		return razorPay;
	}

	/**
	 * @param amount
	 * @return
	 * @throws RazorpayException
	 */
	private Order createRazorPayOrder(int amount) throws RazorpayException {

		JSONObject options = new JSONObject();
//		options.put("OrderID", "#OID" + UUID.randomUUID().toString().replace('-', ' '));
		options.put("amount", amount);
		options.put("currency", "INR");
		options.put("receipt", "txn_123456");
		options.put("payment_capture", 1);
//  		   You can enable this if you want to do Auto Capture.
		return client.get().Orders.create(options);
	}

	private String convertRupeeToPaise(String paise) {
		BigDecimal b = new BigDecimal(paise);
		BigDecimal value = b.multiply(new BigDecimal("100"));
		return value.setScale(0, RoundingMode.UP).toString();

	}

}
