package com.zc.book.controller;

import com.zc.book.pojo.User;
import com.zc.book.pojo.reponse.Response;
import com.zc.book.service.Impl.UserServiceImpl;
import com.zc.book.service.UserService;
import com.zc.book.utils.DateParse;
import com.zc.book.utils.GeneratID;
import com.zc.book.utils.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

@RestController
@RequestMapping("bookMall/user/")
public class UserController {
    @Autowired
    private UserServiceImpl userService;
    @GetMapping("login")
    public Response login( User user){
        if (user.getPhone()==null){
            return Response.Error("账号不能为空");
        }
        if (user.getPassword()==null){
            return Response.Error("请输入密码！");
        }
        User user1 = userService.selectByPhone(user);
        if (user1==null){
            return Response.Error("没有该用户");
        }
        if (!Md5Utils.stringToMD5(user.getPassword()).equals(user1.getPassword())){
            return Response.Error("密码错误，请重新输入");
        }
        return Response.Success(user1);
    }
    @PostMapping("register")
    public Response register(@RequestBody  User user){
        if (user.getUsername()==null || "".equals(user.getUsername())){
            return Response.Error("用户名不能为空");
        }
        if (user.getPhone()==null || "".equals(user.getPhone())){
            return Response.Error("电话不能为空");
        }
        User user1 = userService.selectByuserName(user);
        if (user1!=null){
            return Response.Error("用户名已存在");
        }
        user.setUserid(GeneratID.getRandomId());
        user.setPassword(Md5Utils.stringToMD5(user.getPassword()));
        user.setCreatedate(new Date());
        user.setUsertype(2);
        int num = userService.insert(user);
        if (num>0){
            return Response.Success("注册成功");
        }
        return Response.Error("注册失败");
    }
    @PostMapping("recharge")
    public Response recharge(@RequestBody User user){
        userService.recharge(user);
        return Response.Success("充值成功");
    }
    @GetMapping("zhye")
    public Response zhye(String userid){
        User user = userService.selectByPrimaryKey(userid);
        return Response.Success(user.getBanlance());
    }
}
