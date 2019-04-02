package com.hello.Helloworld.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.hello.Helloworld.entity.Employee;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
public class EmployeeService {

	ArrayList<Employee> employees=new ArrayList<Employee>();
	private static Logger logger = LoggerFactory.getLogger(EmployeeService.class);
    
    
	public void addNewEmployee(Employee employee) {
		logger.info("Inside addNewEmployee method");
		employees.add(employee);
		logger.info("Employee {} added", employee);
	}
	
	public ArrayList<Employee> getAllEmployees() {
		logger.info("Inside getAllEmployees method");
		return employees;		
	}
	
	public Employee getEmployeeById(int employeeId) {
		logger.info("Inside getEmployeeById method");
		return employees.get(employeeId);		
	}
	
	public void updateEmployee(int employeeId,Employee employee) {
		logger.info("Inside updateEmployee method");
		employees.set(employeeId, employee);		
	}
	
	public void deleteEmployee(int employeeId) {
		logger.info("Inside deleteEmployee method");
		employees.remove(employeeId);
	}
}
