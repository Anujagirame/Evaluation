package com.spring.examples.CarManagement.service;

import java.util.List;

import com.spring.examples.CarManagement.model.Car;

public interface CarService {
	
	public List<Car> getallcars();
	public Car registercar(Car car);
	public String removecar(Integer carno);
	public Car modifycar(Car car);
	public List<Car> searchbycarno(Integer carno);

}
