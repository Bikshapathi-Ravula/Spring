package com.demo.bean;

import java.io.Serializable;

public class UserResponse implements Serializable {

	private static final long serialVersionUID = 3215136256142512837L;

	public UserResponse(String token, String message) {
		super();
		this.token = token;
		this.message = message;
	}

	private String token;

	private String message;

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
}
