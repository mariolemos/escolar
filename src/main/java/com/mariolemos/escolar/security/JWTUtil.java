package com.mariolemos.escolar.security;

import java.util.Date;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;

@Component
public class JWTUtil {
	
	@Value("${jwt.secret")
	private String secret;
	
	@Value("${jwt.experation")
	private String experation;
	
	public String generateToken(String username) {
		return Jwts.builder().setSubject(username).setExpiration(new Date(System.currentTimeMillis() + experation)).signWith(SignatureAlgorithm.HS512, secret.getBytes()).compact();
	}

}
