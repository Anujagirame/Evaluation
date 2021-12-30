package com.spring.examples.CustomerManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="customer")
public class Customer {
	
	@Id
	Integer cid;
	
	@Column
	String customername;
	
	@Column
	String address;
	
	@Column
	String mobile;

	public Customer(Integer cid, String customername, String address, String mobile) {
		super();
		this.cid = cid;
		this.customername = customername;
		this.address = address;
		this.mobile = mobile;
	}

	public Integer getCid() {
		return cid;
	}

	public void setCid(Integer cid) {
		this.cid = cid;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	
	


}
