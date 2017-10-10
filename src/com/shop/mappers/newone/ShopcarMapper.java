package com.shop.mappers.newone;

import com.shop.pojo.entity.Shopcar;

import java.util.List;

public interface ShopcarMapper {
    public List<Shopcar> findOrderByInfo(Shopcar info);
}
