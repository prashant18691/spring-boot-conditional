package com.prs.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.prs.boot.daoSource.JdbcUserDao;
import com.prs.boot.daoSource.MongoUserDao;

@RestController
public class AppController {
	
	@Autowired
	JdbcUserDao jdbc;
	
	@Autowired
	MongoUserDao mongo;

	@GetMapping("/jdbc")
	public List<String> getJdbcInfo(){
		
		return jdbc.getAllUsers();
	}
	
	@GetMapping("/")
	public List<String> getMongoInfo(){
		
		return mongo.getAllUsers();
	}
}
