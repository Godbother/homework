package com.shop.test;

import com.shop.service.OrderService;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.shop.mappers.newone.UserMapper;

public class Test1 {
	@Autowired
	private UserMapper userMapper;
	@Autowired
	private OrderService orderService;
	@Test
	public void daotest(){
		System.out.println(orderService.getlist());
	}
}
