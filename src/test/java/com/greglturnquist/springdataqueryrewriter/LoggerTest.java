package com.greglturnquist.springdataqueryrewriter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class LoggerTest {

	@Autowired EmployeeRepository repository;

	@Test
	void queryShouldOutputDetailsInConsole() {
		repository.findCustomEmployees("Bilbo Baggins");
	}
}
