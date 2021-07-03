package com.zc.book.dao;

import com.zc.book.pojo.Order;
import com.zc.book.pojo.User;

public interface UserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String  userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByuserName(User user);

    User selectByAll(User user);

    User selectByPhone(User user);

    Integer orderPay(Order order);

    Integer recharge(User user);
}