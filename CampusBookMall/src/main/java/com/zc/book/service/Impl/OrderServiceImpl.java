package com.zc.book.service.Impl;

import com.zc.book.dao.OrderMapper;
import com.zc.book.pojo.Order;
import com.zc.book.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {
    @Autowired(required = false)
    private OrderMapper orderMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return orderMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Order record) {
        return orderMapper.insert(record);
    }

    @Override
    public int insertSelective(Order record) {
        return orderMapper.insertSelective(record);
    }

    @Override
    public Order selectByPrimaryKey(Integer id) {
        return orderMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(Order record) {
        return orderMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Order record) {
        return orderMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Order> selectOfOrderDaiFuKuan(String userid) {
        return orderMapper.selectOfOrderDaiFuKuan(userid);
    }

    @Override
    public List<Order> selectOfOrderCompleted(String userid) {
        return orderMapper.selectOfOrderCompleted(userid);
    }

    @Override
    public List<Order> selectOfOrderDaiFaHuo(String userid) {
        return orderMapper.selectOfOrderDaiFaHuo(userid);
    }

    @Override
    public List<Order> selectOfOrderDaiShouHuo(String userid) {
        return orderMapper.selectOfOrderDaiShouHuo(userid);
    }

    @Override
    public List<Order> selectOfOrderDaiComment(String userid) {
        return orderMapper.selectOfOrderDaiComment(userid);
    }
}
