package com.hello.Helloworld.resource;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.hello.Helloworld.entity.Employee;
import com.hello.Helloworld.service.EmployeeService;

@RestController
public class EmployeeResource {

	@Autowired
	EmployeeService service;
	
	@GetMapping
	public ArrayList<Employee> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	
	@GetMapping("/{employeeId}")
	public Employee getEmployeeById(@PathVariable Integer employeeId){
		return service.getEmployeeById(employeeId);
	}
	
	
	@PostMapping
	public void addNewEmployee(@RequestBody Employee employee) {
		service.addNewEmployee(employee);
	}
	
	@PutMapping
	public void updateEmployeeDetails(@RequestBody Employee employee) {
		service.updateEmployee(employee.getEmployeeId(), employee);
	}
	
	@DeleteMapping("/delete/{employeeId}")
	public void deleteEmployee(@PathVariable Integer employeeId) {
		service.deleteEmployee(employeeId);
	}
}
