package com.sopovs.moradanen.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sopovs.moradanen.service.DbService;

@RestController
public class DbController {

	private final DbService db;

	public DbController(DbService db) {
		this.db = db;
	}

	@RequestMapping(value = "/foo", method = RequestMethod.POST)
	public String clear() {
		db.foo();
		return "OK";
	}

}
