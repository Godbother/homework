package com.shop.mappers.newone;

import java.util.List;

import com.shop.pojo.entity.User;

public interface UserMapper {
	
	/**
	 * 根据部分用户信息获取特定用户对象(ID，用户名，购物车id，订单id)，info为空则返回全部user
	 * @param info
	 * @return
	 */
	public List<User> findUserByInfo(User info);
	/**
	 * 根据id删除用户，返回删除行数
	 * @param id
	 * @return integer
	 */
	public Integer deluser(Integer id);
	/**
	 * 传入需要修改后的user对象，id不可为空，id为唯一标识
	 * @param info
	 * @return 
	 */
	public Integer changeuser(User info);
}
