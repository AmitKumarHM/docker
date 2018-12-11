package com.synech.restdemo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {

	private Long id;
	private String firstName;
	private String lastName;
	private String avatar;
	

	public User() {
		super();
	}
	
	public User(Long id, String firstName) {
		super();
		this.id = id;
		this.firstName = firstName;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAvatar() {
		return avatar;
	}
	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}
	
	
}
