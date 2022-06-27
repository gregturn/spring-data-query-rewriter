package com.greglturnquist.springdataqueryrewriter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.QueryRewriter;

@Configuration
public class Config {

  @Bean
  CommandLineRunner init(EmployeeRepository repository) {
    return args -> {
      repository.save(new Employee("Frodo Baggins", "ring bearer"));
      repository.save(new Employee("Bilbo Baggins", "burglar"));
    };
  }

  @Bean
  QueryRewriter logit() {
    return new QueryLogger();
  }
}
