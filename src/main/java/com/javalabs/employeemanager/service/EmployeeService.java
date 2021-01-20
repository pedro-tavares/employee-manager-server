package com.javalabs.employeemanager.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javalabs.employeemanager.domain.Employee;
import com.javalabs.employeemanager.repository.EmployeeRepository;

@Service
public class EmployeeService extends BaseService {
	
    @Autowired
    EmployeeRepository employeeRepository;
	
    public List<Employee> getAll() {
    	return employeeRepository.findAll();
    }    
    
	public Employee save(Employee employee) {
		return employeeRepository.save(employee);
	}

}
