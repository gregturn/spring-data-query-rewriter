package com.greglturnquist.springdataqueryrewriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.QueryRewriter;

@SpringBootApplication
public class SpringDataQueryRewriterApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataQueryRewriterApplication.class, args);
  }

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

  public static class QueryLogger implements QueryRewriter {

    private final static Logger log = LoggerFactory.getLogger(QueryLogger.class);

    @Override
    public String rewrite(String query, Sort sort) {
      log.info("Got " + query);
      return query;
    }
  }

}
