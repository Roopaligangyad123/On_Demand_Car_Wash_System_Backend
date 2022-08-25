package com.cg.washer.models;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;
@Document(collection ="Washerdb")
public class Washers {
	
	@Transient
    public static final String SEQUENCE_NAME = "users_sequence";

    public static String getSequenceName() {
		return SEQUENCE_NAME; }
	@Id
	private int id;
	@NotEmpty(message = "Name must not be empty")
	private String name;
	@NotEmpty(message = "Location must not be empty")
	private String location;
	@NotEmpty(message = "password Must not be empty")
	@Size(min=8,message="Not Strong Password")
	private String password;
	
	public Washers() {
		super();
	}

	public Washers(int id, @NotEmpty(message = "Name must not be empty") String name, 
			@NotEmpty(message = "Location must not be empty") String location, 
			@NotEmpty(message = "password Must not be empty") @Size(min=8,message="Not Strong Password") String password) {
		super();
		this.id = id;
		this.name = name;
		this.location = location;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Washers [id=" + id + ", name=" + name + ", location=" + location + ", password=" + password + "]";
	}

	

}
