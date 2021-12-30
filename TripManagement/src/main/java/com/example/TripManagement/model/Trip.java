package com.example.TripManagement.model;

import javax.persistence.Column;
import javax.persistence.Id;

public class Trip {
	
	@Id
	Integer tripid;
	
	@Column
	String source;
	
	@Column
	String customername;
	
	@Column
	Integer amount;

	public Trip(Integer tripid, String source, String customername, Integer amount) {
		super();
		this.tripid = tripid;
		this.source = source;
		this.customername = customername;
		this.amount = amount;
	}

	public Integer getTripid() {
		return tripid;
	}

	public void setTripid(Integer tripid) {
		this.tripid = tripid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getCustomername() {
		return customername;
	}

	public void setCustomername(String customername) {
		this.customername = customername;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	
	



}
