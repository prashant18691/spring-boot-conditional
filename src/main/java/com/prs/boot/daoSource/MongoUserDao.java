package com.prs.boot.daoSource;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class MongoUserDao implements UserDao {

	@Override
	public List<String> getAllUsers() {
		// TODO Auto-generated method stub
		return Arrays.asList("D","E","F");
	}

}
