package com.demo.bean;

import java.io.Serializable;

public class UserRequest implements Serializable {

	private static final long serialVersionUID = 8400565371657875493L;

	private String userName;

	private String password;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
