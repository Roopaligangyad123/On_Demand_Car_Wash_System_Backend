package com.cg.washer.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection="Login")
public class WasherLogin 
{
	@Id
	@NotEmpty(message = "userName must not be empty")
	private String name;
	@NotEmpty(message = "password Must not be empty")
	@Size(min=8,message="Not Strong Password")
	private String password;
	public WasherLogin(@NotEmpty(message = "userName must not be empty") String name, 
			@NotEmpty(message = "password Must not be empty") @Size(min=8,message="Not Strong Password") String password) {
		super();
		this.name = name;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "WasherLogin [name=" + name + ", password=" + password + "]";
	}
	
	
}
