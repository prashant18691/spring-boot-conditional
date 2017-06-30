package com.prs.boot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.prs.boot.annotation.DatabaseType;
import com.prs.boot.daoSource.JdbcUserDao;
import com.prs.boot.daoSource.MongoUserDao;
import com.prs.boot.daoSource.UserDao;

@Configuration
@ComponentScan
public class AppConfiguration {

	@Bean
	@DatabaseType("Jdbc")
	public UserDao jdbcUserDao(){
		return new JdbcUserDao();
	}
	
	@Bean
	@DatabaseType("Mongo")
	public UserDao mongoUserDao(){
		return new MongoUserDao();
	}
	
}
