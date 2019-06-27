package com.auxolabs.springbootrestapiexample.repository;

import com.auxolabs.springbootrestapiexample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{
	
 
}
