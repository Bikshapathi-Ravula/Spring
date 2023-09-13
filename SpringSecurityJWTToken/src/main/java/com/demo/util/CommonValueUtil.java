package com.demo.util;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class CommonValueUtil implements Serializable {

	private static final long serialVersionUID = -473111247534092318L;

	@Value("${secret.key}")
	private String secretKey;

	@Value("${id}")
	private String id;

	@Value("${issuer}")
	private String issuer;

	/**
	 * Getters And Setters
	 * 
	 * @return secretKey,id,subject,issuer
	 */

	public String getIssuer() {
		return issuer;
	}

	public String getId() {
		return id;
	}

	public String getSecretKey() {
		return secretKey;
	}

}
