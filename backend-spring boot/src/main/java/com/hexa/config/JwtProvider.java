package com.hexa.config;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.crypto.SecretKey;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtProvider {
//	@Value("${jwt.secret}")
	private String SECRET_KEY="wpembytrwcvnryxksdbqwjebruyGHyudqgwveytrtrCSnwifoesarjbwe";

	private SecretKey key=Keys.hmacShaKeyFor(SECRET_KEY.getBytes());

	public String generateToken(Authentication auth) {
		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
	    String roles = populateAuthorities(authorities);

		String jwt=Jwts.builder()
				.setIssuedAt(new Date())
				.setExpiration(new Date(new Date().getTime()+86400000))
				.claim("email",auth.getName())
				.claim("authorities", roles)
				.signWith(key)
				.compact();
		return jwt;

	}

	public String getEmailFromJwtToken(String jwt) {
		jwt=jwt.substring(7);

		Claims claims=Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jwt).getBody();
		String email=String.valueOf(claims.get("email"));

		return email;
	}

	public String populateAuthorities(Collection<? extends GrantedAuthority> collection) {
		Set<String> auths=new HashSet<>();

		for(GrantedAuthority authority:collection) {
			auths.add(authority.getAuthority());
		}
		return String.join(",",auths);
	}

}

//
//@Service
//public class JwtProvider {
//
//	@Value("${jwt.secret}")
//	private String SECRET_KEY;
//
//	private SecretKey key;
//
//	@PostConstruct
//	public void init() {
//		this.key = Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
//	}
//
//	public String generateToken(Authentication auth) {
//		Collection<? extends GrantedAuthority> authorities = auth.getAuthorities();
//		String roles = populateAuthorities(authorities);
//
//		String jwt = Jwts.builder()
//				.setIssuedAt(new Date())
//				.setExpiration(new Date(new Date().getTime() + 86400000))
//				.claim("email", auth.getName())
//				.claim("authorities", roles)
//				.signWith(key)
//				.compact();
//		return jwt;
//	}
//
//	public String getEmailFromJwtToken(String jwt) {
//		jwt = jwt.substring(7);
//
//		Claims claims = Jwts.parserBuilder().setSigningKey(key).build().parseClaimsJws(jwt).getBody();
//		return String.valueOf(claims.get("email"));
//	}
//
//	public String populateAuthorities(Collection<? extends GrantedAuthority> collection) {
//		Set<String> auths = new HashSet<>();
//		for (GrantedAuthority authority : collection) {
//			auths.add(authority.getAuthority());
//		}
//		return String.join(",", auths);
//	}
//}