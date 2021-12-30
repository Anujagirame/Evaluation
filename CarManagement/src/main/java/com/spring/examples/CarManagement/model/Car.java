package com.spring.examples.CarManagement.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="car")
public class Car {

	@Id
	Integer carno;
	
	@Column
	String car_owner;
	
	@Column
	String fuel_type;
	
	@Column
	String noofseats;
	
	@Column
	String model;

	
	

	public Car(Integer carno, String car_owner, String fuel_type, String noofseats, String model) {
		super();
		this.carno = carno;
		this.car_owner = car_owner;
		this.fuel_type = fuel_type;
		this.noofseats = noofseats;
		this.model = model;
	}
	

	public Integer getCarno() {
		return carno;
	}


	public void setCarno(Integer carno) {
		this.carno = carno;
	}


	public String getCar_owner() {
		return car_owner;
	}

	public void setCar_owner(String car_owner) {
		this.car_owner = car_owner;
	}

	public String getFuel_type() {
		return fuel_type;
	}

	public void setFuel_type(String fuel_type) {
		this.fuel_type = fuel_type;
	}

	public String getNoofseats() {
		return noofseats;
	}

	public void setNoofseats(String noofseats) {
		this.noofseats = noofseats;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}
	
	
}
