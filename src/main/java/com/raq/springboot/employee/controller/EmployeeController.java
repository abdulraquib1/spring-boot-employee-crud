package com.raq.springboot.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.raq.springboot.employee.vo.EmployeeVO;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employees")
	public List<EmployeeVO> getEmployees() {
		return employeeService.getEmployees();
	}

	@RequestMapping("/employees/{id}")
	public EmployeeVO getEmployee(@PathVariable String id) {
		return employeeService.getEmployee(Integer.parseInt(id));
		
	}

	@RequestMapping(method = RequestMethod.POST, value="/employees")
	public void addEmployee(@RequestBody EmployeeVO employee) {
		employeeService.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employees/{id}")
	public void addEmployee(@RequestBody EmployeeVO employee, @PathVariable String id) {
		employeeService.updateEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employees/{id}")
	public void addEmployee( @PathVariable String id) {
		employeeService.deleteEmployee(Integer.parseInt(id));
	}
	
}
