package com.zc.book.dao;

import com.zc.book.pojo.Order;

import java.util.List;

public interface OrderMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Order record);

    int insertSelective(Order record);

    Order selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Order record);

    int updateByPrimaryKey(Order record);

    List<Order> selectOfOrderDaiFuKuan(String userid);

    List<Order> selectOfOrderCompleted(String userid);

    List<Order> selectOfOrderDaiFaHuo(String userid);

    List<Order> selectOfOrderDaiShouHuo(String userid);

    List<Order> selectOfOrderDaiComment(String userid);


}