package com.sopovs.moradanen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class DbService {
	private final JdbcTemplate template;

	@Autowired
	public DbService(JdbcTemplate template) {
		this.template = template;
	}

	public void foo() {
		template.execute("insert into foobar(val) values('foobar')");
	}

}
