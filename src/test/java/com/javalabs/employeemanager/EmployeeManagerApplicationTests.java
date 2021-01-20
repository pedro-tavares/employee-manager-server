package com.javalabs.employeemanager;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.annotation.Order;

@SpringBootTest
class EmployeeManagerApplicationTests {

	@Test
	@Order(1)
	void contextLoads() {}

}
