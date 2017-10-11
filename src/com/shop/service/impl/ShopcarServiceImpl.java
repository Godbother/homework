package com.shop.service.impl;

import com.shop.mappers.newone.ShopcarMapper;
import com.shop.pojo.entity.Shopcar;
import com.shop.service.ShopcarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShopcarServiceImpl implements ShopcarService {
    @Autowired
    private ShopcarMapper shopcarMapper;

    @Override
    public List<Shopcar> getlistByUid(Integer uid) {
        List<Shopcar> list = shopcarMapper.findShopcarByInfo(new Shopcar(null,null,null,null,null,uid,null));
        return list;
    }

    @Override
    public Shopcar getById(Integer id) {
        List<Shopcar> list = shopcarMapper.findShopcarByInfo(new Shopcar(id,null,null,null,null,null,null));
        if (list==null) {
            return null;
        }else{
            return list.get(0);
        }
    }

    @Override
    public Shopcar getByOid(Integer oid) {
        List<Shopcar> list = shopcarMapper.findShopcarByInfo(new Shopcar(null,null,null,null,null,null,oid));
        if (list==null) {
            return null;
        }else{
            return list.get(0);
        }
    }

    @Override
    public String addToShopcar(Shopcar info) {
        return null;
    }

    @Override
    public String delOne(Integer id) {
        return null;
    }

    @Override
    public String clear(Integer uid) {
        return null;
    }

    @Override
    public String updateShopcar(Shopcar info) {
        return null;
    }
}
