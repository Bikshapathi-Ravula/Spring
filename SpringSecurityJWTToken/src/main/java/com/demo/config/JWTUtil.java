package com.demo.config;

import java.util.Date;
import java.util.concurrent.TimeUnit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.demo.util.CommonValueUtil;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {

	@Autowired
	private CommonValueUtil commonValueUtil;

	// Generate Token
	public String generateToken(String subject) {

		return Jwts.builder()// builder
				.setSubject(subject)// username
				.setIssuer(commonValueUtil.getIssuer())// issuer
				.setIssuedAt(new Date(System.currentTimeMillis()))// token GenerationTime
				.setExpiration(new Date(System.currentTimeMillis() + TimeUnit.MINUTES.toMillis(2)))// Token Exp Time
				.signWith(SignatureAlgorithm.HS512, commonValueUtil.getSecretKey().getBytes()) // Signature
				.compact();// convert to string
	}

	// Read Claims
	public Claims getClaims(String token) {
		return Jwts.parser().setSigningKey(commonValueUtil.getSecretKey().getBytes()).parseClaimsJws(token).getBody();
	}

	// Read Exp date
	public Date getExpDate(String token) {
		return this.getClaims(token).getExpiration();
	}

	// Read Subject(UserName)
	public String getUserName(String token) {
		return this.getClaims(token).getSubject();
	}

	// Validate Exp Date
	public boolean isTokenExp(String token) {
		Date expDate = this.getExpDate(token);
		return expDate.before(new Date(System.currentTimeMillis()));
	}

	// Validate USerName in token and datebase && Validate Exp Date
	public boolean validateToken(String token, String userName) {
		String tokenUserName = this.getUserName(token);
		return (userName.equals(tokenUserName) && !isTokenExp(token));
	}
}
