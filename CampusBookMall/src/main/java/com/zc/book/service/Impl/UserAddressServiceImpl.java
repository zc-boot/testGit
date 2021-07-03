package com.zc.book.service.Impl;

import com.zc.book.dao.UserAddressMapper;
import com.zc.book.pojo.UserAddress;
import com.zc.book.service.UserAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired(required = false)
    private UserAddressMapper userAddressMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return userAddressMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(UserAddress record) {
        return userAddressMapper.insert(record);
    }

    @Override
    public int insertSelective(UserAddress record) {
        return userAddressMapper.insertSelective(record);
    }

    @Override
    public UserAddress selectByPrimaryKey(Integer id) {
        return userAddressMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(UserAddress record) {
        return userAddressMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(UserAddress record) {
        return userAddressMapper.updateByPrimaryKey(record);
    }

    @Override
    public int setDefaultAddress(String addressId) {
        return userAddressMapper.setDefaultAddress(addressId);
    }

    @Override
    public List<UserAddress> queryMyAddress(Integer userid) {
        return userAddressMapper.queryMyAddress(userid);
    }


}
