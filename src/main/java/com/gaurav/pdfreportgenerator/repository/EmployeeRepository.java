package com.gaurav.pdfreportgenerator.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.gaurav.pdfreportgenerator.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer>{
	
	@Query("FROM Employee e")
	List<Employee> getAllEmployeeData();

}
