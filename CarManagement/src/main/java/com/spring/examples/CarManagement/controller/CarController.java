package com.spring.examples.CarManagement.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.examples.CarManagement.model.Car;
import com.spring.examples.CarManagement.service.CarService;

@RestController
@RequestMapping("/carservice")
public class CarController {
	
	@Autowired
	CarService service;
	
	@GetMapping("/car/all")
	public List<Car> getAll(){
		return service.getallcars();
		
	}
	
	@PostMapping("/car/add")
	public Car registercar(@RequestBody Car car) {
		return service.registercar(car);
	}
	
	
	@DeleteMapping("/car/delete/{carno}")
		public String removecar(@PathVariable("carno") Integer carno)
		{
			return service.removecar(carno);
		}
	
	@PutMapping("/car/update")
	public Car modifycar(@RequestBody Car car) {
		return service.modifycar(car);
	}
	
	@GetMapping("/car/search/{carno}")
	public List<Car> getCarBycarno(@PathVariable("carno")Integer carno){
		return service.searchbycarno(carno);
		
	}
		
	
	
	
	

}
