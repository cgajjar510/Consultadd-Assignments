package com.consultAdd.dao;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.consultAdd.model.Employee;
import com.consultAdd.repository.EmployeeRepository;

@Service
public class EmployeeDAO {
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	//1) To add an Employee
	public Employee add(Employee emp) {
		return employeeRepository.save(emp);
	}
	
	//2) Search all Employee
	public List<Employee> findAll(){
		return employeeRepository.findAll();
	}
	
	//3)get an employee by id
	public Employee findOne(Long empId) {
		return employeeRepository.findOne(empId);
	}
	
	//4) delete an employee
	public void delete(Employee emp) {
		employeeRepository.delete(emp);
	}
}
