package com.shop.service;

import java.util.List;

import com.shop.pojo.entity.User;

public interface UserService {
	public List<User> getUserList();
	public List<User> findUserByInfo(User info);
	public String deluser(Integer id);
	public String updateuser(User info);
}
