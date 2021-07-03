package com.zc.book.service;

import com.zc.book.pojo.ShopCart;
import com.zc.book.pojo.query.ShopCartBookInfo;

import java.util.List;

public interface ShopCartService {
    int deleteByPrimaryKey(Integer id);

    int insert(ShopCart record);

    int insertSelective(ShopCart record);

    ShopCart selectByPrimaryKey(String shopCartId);

    int updateByPrimaryKeySelective(ShopCart record);

    int updateByPrimaryKey(ShopCart record);

    List<ShopCartBookInfo> queryMyShopCart(Integer userId);

    int deleteMyShopCart(String shopcartid);

    int deleteMyShopCarts(String [] shopcartids);
}
