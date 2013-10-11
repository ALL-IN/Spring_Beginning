package com.spring.Common.model;

public class Customer {
	private int id;
	private String firstName;
	private String lastName;
	private String city;
	private String mobile;
	private String notice;
	
	public Customer() {
		
	}
	
	public Customer(int custId, String name, String surname, String city, String mobile, String notice) {
		this.id = custId;
		this.firstName = name;
		this.lastName = surname;
		this.city = city;
		this.mobile = mobile;
		this.notice = notice;
	}
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setFirstName(String name) {
		this.firstName = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String name) {
		this.lastName = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getNotice() {
		return notice;
	}

	public void setNotice(String notice) {
		this.notice = notice;
	}
	
	
}
