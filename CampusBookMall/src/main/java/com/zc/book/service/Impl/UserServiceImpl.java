package com.zc.book.service.Impl;

import com.zc.book.dao.UserMapper;
import com.zc.book.pojo.Order;
import com.zc.book.pojo.User;
import com.zc.book.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired(required = false)
    private UserMapper userMapper;

    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(User record) {
        return userMapper.insert(record);
    }

    @Override
    public int insertSelective(User record) {
        return userMapper.insertSelective(record);
    }

    @Override
    public User selectByPrimaryKey(String userid) {
       return userMapper.selectByPrimaryKey(userid);

    }

    @Override
    public int updateByPrimaryKeySelective(User record) {
        return userMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(User record) {
        return userMapper.updateByPrimaryKey(record);
    }

    @Override
    public User selectByuserName(User user) {
        return userMapper.selectByuserName(user);
    }

    @Override
    public User selectByAll(User user) {
        return userMapper.selectByAll(user);
    }

    @Override
    public User selectByPhone(User user) {
        return userMapper.selectByPhone(user);
    }

    @Override
    public Integer orderPay(Order order) {
        return userMapper.orderPay(order);
    }

    @Override
    public Integer recharge(User user) {
        return userMapper.recharge(user);
    }
}
