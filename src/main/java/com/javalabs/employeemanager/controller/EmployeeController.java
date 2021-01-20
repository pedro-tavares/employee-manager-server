package com.javalabs.employeemanager.controller;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.lang3.exception.ExceptionUtils;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import com.javalabs.employeemanager.domain.Employee;
import com.javalabs.employeemanager.service.EmployeeService;

import lombok.extern.slf4j.Slf4j;

/**
 * Employee Front Controller
 * 
 * @author PATavares
 * @since Jan 2021
 */
@Slf4j
@RestController
@RequestMapping("/employee")
public class EmployeeController extends BaseController {
	
	@Autowired
	EmployeeService employeeService;

    @GetMapping("/all")
    ResponseEntity<List<Employee>> all(){
        return new ResponseEntity<List<Employee>>((List<Employee>) employeeService.getAll(), HttpStatus.OK);
    }

    @PostMapping("/save")
    ResponseEntity<Employee> save(@RequestBody Employee employee){
    	log.info("save:{}", employee.toString());
    	
        return new ResponseEntity<Employee>(employeeService.save(employee), HttpStatus.OK);
    }    
 
    @PostMapping("/fileupload")
    public ResponseEntity<?> fileUpload(@RequestBody MultipartFile file) {
    	log.info("fileupload:{}", file.getOriginalFilename());
    	
    	try {
			file.transferTo(new File(System.getProperty("user.home") + "/employee-manager/" + file.getOriginalFilename()));
		
    	} catch (IllegalStateException | IOException e) {
    		log.info(ExceptionUtils.getStackTrace(e));		
    	} 
        return new ResponseEntity<>(HttpStatus.OK);
    }
   
}
