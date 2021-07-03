package com.zc.book.service;

import com.zc.book.pojo.UserAddress;

import java.util.List;

public interface UserAddressService {
    int deleteByPrimaryKey(Integer id);

    int insert(UserAddress record);

    int insertSelective(UserAddress record);

    UserAddress selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserAddress record);

    int updateByPrimaryKey(UserAddress record);

    int setDefaultAddress(String addressId);

    List<UserAddress> queryMyAddress(Integer userid);
}
