package com.zc.book.service;

import com.zc.book.pojo.Order;
import com.zc.book.pojo.User;
import org.springframework.transaction.annotation.Transactional;

public interface UserService {
    int deleteByPrimaryKey(Integer id);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(String userid);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    User selectByuserName(User user);

    User selectByAll(User user);

    User selectByPhone(User user);


    Integer orderPay(Order order);

    Integer recharge(User user);
}
