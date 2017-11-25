package com.raq.springboot.employee.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.raq.springboot.employee.vo.EmployeeVO;

@Service
public class EmployeeService {

	private List<EmployeeVO> employees 
			= new ArrayList<>(Arrays.asList(
					new EmployeeVO(1, "AbdulRaquib", 20), 
					new EmployeeVO(2, "SyedJaffarAli", 30),
					new EmployeeVO(3, "AbdulRaafay", 40)));

	public List<EmployeeVO> getEmployees() {
		System.out.println("EmployeeService.getEmployees() called");
		return employees;
	}
	
	public EmployeeVO getEmployee(int id) {
		return employees.stream().filter(t -> t.getId() == id).findFirst().get();
	}

	public void addEmployee(EmployeeVO employee) {
		employees.add(employee);
		
	}

	public void updateEmployee(EmployeeVO employee) {
		System.out.println("Employee Updated " + employee);
		
	}

	public void deleteEmployee(int id) {
		System.out.println("Employee Deleted " + id);
		
	}

	
}
