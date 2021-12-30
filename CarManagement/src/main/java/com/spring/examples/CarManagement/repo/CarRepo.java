package com.spring.examples.CarManagement.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.spring.examples.CarManagement.model.Car;


@Repository
@Transactional
public interface CarRepo extends JpaRepository<Car,Integer>{

	@Query("select c from Car c where c.carno=?1")
	List<Car> searchbycarno(Integer carno);

}
