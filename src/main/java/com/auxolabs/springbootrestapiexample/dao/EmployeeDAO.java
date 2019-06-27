package com.auxolabs.springbootrestapiexample.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import com.auxolabs.springbootrestapiexample.model.Employee;
import com.auxolabs.springbootrestapiexample.repository.EmployeeRepository;

@Service
public class EmployeeDAO 
{
	@Autowired
	EmployeeRepository employeeRepository;
	
	/*to save an employee*/
	
	public Employee save(Employee emp) {
		return employeeRepository.save(emp);
	}
	/*search all employees*/
		
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	/*get an employee by id*/
	public Employee findOne(Long empid) {
		return employeeRepository.findOne(empid);
	}
	
	/*delete an employee*/
	public void delete(Employee emp) {
	employeeRepository.delete(emp);	
	}
	
}


