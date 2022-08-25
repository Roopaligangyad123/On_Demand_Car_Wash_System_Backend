package com.cg.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Login")
public class UserLogin 
{
	@Id
	@NotEmpty(message="username must not be empty")
	private String username;
	@NotEmpty(message = "password Must not be empty")
	@Size(min=8,message="Not Strong Password")
	private String password;
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "UserLogin [username=" + username + ", password=" + password + "]";
	}
	public UserLogin(@NotEmpty(message="username must not be empty") String username, 
			@NotEmpty(message = "password Must not be empty") @Size(min=8,message="Not Strong Password") String password) {
		super();
		this.username = username;
		this.password = password;
	}
	
	
}
