package com.p1;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Address {
	@Column(name = "Permanent_HouseNo",nullable=false)
	private String houseNum;
	
	@Column(name = "Permanent_city",nullable=false)
	private String city;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(String houseNum, String city) {
		super();
		this.houseNum = houseNum;
		this.city = city;
	}
	public String getHouseNum() {
		return houseNum;
	}
	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	

}
