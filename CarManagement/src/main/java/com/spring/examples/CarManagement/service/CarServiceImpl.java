package com.spring.examples.CarManagement.service;

import java.util.List;

import com.spring.examples.CarManagement.model.Car;
import com.spring.examples.CarManagement.repo.CarRepo;

public class CarServiceImpl implements CarService {

	
	CarRepo repo;
	
	@Override
	public List<Car> getallcars() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Car registercar(Car car) {
		// TODO Auto-generated method stub
		return repo.save(car);
	}

	@Override
	public String removecar(Integer carno) {
		// TODO Auto-generated method stub
		repo.deleteById(carno);
		return "deleted";
	}

	@Override
	public Car modifycar(Car car) {
		// TODO Auto-generated method stub
		return repo.save(car);
	}

	@Override
	public List<Car> searchbycarno(Integer carno) {
		// TODO Auto-generated method stub
		return repo.searchbycarno(carno);
	}

}
