package com.cg.models;

import javax.validation.constraints.NotEmpty;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="washpackdb")
public class Washpack {
	
	@Id
	private Integer id;
	
	 @NotEmpty(message="packname must not be empty")
	private String packname;
	 @NotEmpty(message="cost must not be empty")
	private Integer Cost;
	 @NotEmpty(message="description must not be empty")
	private String description;

	
	public Washpack() {
		super();
	}
	public Washpack(Integer id, @NotEmpty(message = "packname must not be empty") String packname,
			@NotEmpty(message = "cost must not be empty") Integer cost,
			@NotEmpty(message = "description must not be empty") String description) {
		super();
		this.id = id;
		this.packname = packname;
		Cost = cost;
		this.description = description;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getPackname() {
		return packname;
	}
	public void setPackname(String packname) {
		this.packname = packname;
	}
	public Integer getCost() {
		return Cost;
	}
	public void setCost(Integer cost) {
		Cost = cost;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Washpack [id=" + id + ", packname=" + packname + ", Cost=" + Cost + ", description=" + description
				+ "]";
	}
	

}
