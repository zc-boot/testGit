package com.zc.book.service.Impl;

import com.zc.book.dao.ShopCartMapper;
import com.zc.book.pojo.ShopCart;
import com.zc.book.pojo.query.ShopCartBookInfo;
import com.zc.book.service.ShopCartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShopCartServiceImpl implements ShopCartService {
    @Autowired(required = false)
    private ShopCartMapper shopCartMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return shopCartMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(ShopCart record) {
        return shopCartMapper.insert(record);
    }

    @Override
    public int insertSelective(ShopCart record) {
        return shopCartMapper.insertSelective(record);
    }

    @Override
    public ShopCart selectByPrimaryKey(String shopCartId) {
        return shopCartMapper.selectByPrimaryKey(shopCartId);
    }

    @Override
    public int updateByPrimaryKeySelective(ShopCart record) {
        return shopCartMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(ShopCart record) {
        return shopCartMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<ShopCartBookInfo> queryMyShopCart(Integer userId) {
        return shopCartMapper.queryMyShopCart(userId);
    }

    @Override
    public int deleteMyShopCart(String shopcartid) {
        return shopCartMapper.deleteMyShopCart(shopcartid);
    }

    @Override
    public int deleteMyShopCarts(String[] shopcartids) {
        return shopCartMapper.deleteMyShopCarts(shopcartids);
    }
}
