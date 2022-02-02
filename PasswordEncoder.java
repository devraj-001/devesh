package com.shu.kart;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class PasswordEncoder {

	public static void main(String[] args) {
		
		BCryptPasswordEncoder encodedPassword = new BCryptPasswordEncoder();
		String rawPassword = "devesh1234";
		String encodePassword = encodedPassword.encode(rawPassword);
		System.out.println(encodedPassword); 
		
	}

}
