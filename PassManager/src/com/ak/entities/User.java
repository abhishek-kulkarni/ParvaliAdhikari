package com.ak.entities;

import java.util.LinkedHashMap;
import java.util.Map;

public class User {

	private String password;
	private String passwordHint;
	private Map<String, String> securityQuestions;
	
	public User(String password, String passwordHint) {
		
		this.password = password;
		this.passwordHint = passwordHint;
		this.securityQuestions = new LinkedHashMap<String, String>();
	}
	
	public String getPassword() {
		
		return this.password;
	}
	
	public String getPasswordHint() {
		
		return this.passwordHint;
	}
	
	public Map<String, String> getSecurityQuestions() {
		
		return this.securityQuestions;
	}
}
