package com.javalabs.employeemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.javalabs.employeemanager.domain.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {}
