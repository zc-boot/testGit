package com.zc.book.controller;

import com.zc.book.pojo.UserAddress;
import com.zc.book.pojo.reponse.Response;
import com.zc.book.service.Impl.UserAddressServiceImpl;
import com.zc.book.utils.GenerateOnlyId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("bookMall/userAddress")
public class UserAddressController {
    @Autowired
    private UserAddressServiceImpl userAddressService;

    @PostMapping("addUserAddress")
    public Response addUserAddress(@RequestBody UserAddress userAddress){
        userAddress.setCreatetime(new Date());
        userAddress.setAddressid(GenerateOnlyId.getAddressId());

        userAddressService.insertSelective(userAddress);
        return Response.Success("保存成功");
    }
    @GetMapping("setDefaultAddress")
    public Response setDefaultAddress(@RequestParam String addressId){
        userAddressService.setDefaultAddress(addressId);
        return Response.Success("设置成功");
    }
    @GetMapping("queryMyAddress")
    public Response queryMyAddress(Integer userid){
        List<UserAddress> userAddresses = userAddressService.queryMyAddress(userid);
        return Response.Success(userAddresses);
    }
}
