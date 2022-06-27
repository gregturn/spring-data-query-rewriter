package com.greglturnquist.springdataqueryrewriter;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.QueryRewriter;

@SpringBootApplication
public class SpringDataQueryRewriterApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataQueryRewriterApplication.class, args);
  }

}
