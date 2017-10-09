package com.shop.mappers.newone;

import java.util.List;

import com.shop.pojo.entity.Goods;

public interface GoodsMapper {
	public List<Goods> findGoodsByInfo(Goods info);
}
