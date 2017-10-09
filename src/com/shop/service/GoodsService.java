package com.shop.service;

import java.util.List;

import com.shop.pojo.entity.Goods;

public interface GoodsService {
	public List<Goods> getlist();
	public List<Goods> findGoodsByInfo(Goods info);
}
