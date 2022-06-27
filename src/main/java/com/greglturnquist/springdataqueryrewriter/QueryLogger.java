package com.greglturnquist.springdataqueryrewriter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.QueryRewriter;

public class QueryLogger implements QueryRewriter {

  private final static Logger log = LoggerFactory.getLogger(QueryLogger.class);

  @Override
  public String rewrite(String query, Sort sort) {
    log.info("Got '" + query + "'");
    return query;
  }
}
