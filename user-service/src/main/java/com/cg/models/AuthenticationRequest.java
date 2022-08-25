package com.cg.models;


import java.io.Serializable;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class AuthenticationRequest implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@NotEmpty(message = "username must not be empty")
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

    //need default constructor for JSON Parsing
    public AuthenticationRequest()
    {

    }

    public AuthenticationRequest(@NotEmpty(message = "username must not be empty") String username, 
    		@NotEmpty(message = "password Must not be empty") @Size(min=8,message="Not Strong Password")String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
}