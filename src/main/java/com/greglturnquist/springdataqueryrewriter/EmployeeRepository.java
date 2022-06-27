package com.greglturnquist.springdataqueryrewriter;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.greglturnquist.springdataqueryrewriter.SpringDataQueryRewriterApplication.QueryLogger;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

  @Query(value = "select e from Employee e where e.name = :name", queryRewriter = QueryLogger.class)
  List<Employee> findCustomEmployees(String name);

}
