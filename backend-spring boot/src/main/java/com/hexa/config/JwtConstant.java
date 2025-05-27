package com.hexa.config;

import org.springframework.beans.factory.annotation.Value;

public class JwtConstant {


	@Value("${jwt.secret}")
	private String SECRET_KEY;
	public static final String JWT_HEADER="Authorization";
	
}
