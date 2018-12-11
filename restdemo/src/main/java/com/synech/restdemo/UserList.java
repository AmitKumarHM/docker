package com.synech.restdemo;

import java.util.List;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserList {

	private List<User> listOfUser;

	
	
	public UserList() {
	}

	public UserList(List<User> listOfUser) {
		this.listOfUser = listOfUser;
	}

	public List<User> getListOfUser() {
		return listOfUser;
	}

	public void setListOfUser(List<User> listOfUser) {
		this.listOfUser = listOfUser;
	}
	
}
