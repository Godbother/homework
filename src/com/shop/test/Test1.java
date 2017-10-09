package com.shop.test;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.mappers.newone.UserMapper;

public class Test1 {
	@Autowired
	private UserMapper userMapper;
	@Test
	public void daotest(){
	}
}
