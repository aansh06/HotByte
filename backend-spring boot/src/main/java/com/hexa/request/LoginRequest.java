package com.hexa.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor

@Data
public class LoginRequest {
	
	private String email;
	private String password;


    public LoginRequest(String mail, String wrongpassword) {
    }
}
