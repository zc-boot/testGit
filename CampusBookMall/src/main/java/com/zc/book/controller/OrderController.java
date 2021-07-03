package com.zc.book.controller;

import com.zc.book.pojo.Book;
import com.zc.book.pojo.Order;
import com.zc.book.pojo.ShopCart;
import com.zc.book.pojo.User;
import com.zc.book.pojo.reponse.Response;
import com.zc.book.service.Impl.BookServiceImpl;
import com.zc.book.service.Impl.OrderServiceImpl;
import com.zc.book.service.Impl.ShopCartServiceImpl;
import com.zc.book.service.Impl.UserServiceImpl;
import com.zc.book.utils.GenerateOnlyId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("bookMall/order")
public class OrderController {

    @Autowired(required = false)
    private OrderServiceImpl orderService;
    @Autowired(required = false)
    private UserServiceImpl userService;
    @Autowired
    ShopCartServiceImpl shopCartService;
    @Autowired
    BookServiceImpl bookService;

    @PostMapping("insertOrder")
    @Transactional(rollbackFor={RuntimeException.class, Exception.class})
    public Response insertOrder(@RequestBody Order order){
        order.setOrderid(GenerateOnlyId.getOrderId());
        order.setOrdercreatedate(new Date());
        order.setOrderstate(2);
        User user = userService.selectByPrimaryKey(order.getUserid());
        if (user.getBanlance().compareTo(order.getAmount())==-1){
            order.setOrderstate(1);
            order.setPaystate(2);
            int i = orderService.insertSelective(order);
            return Response.Error("余额不足，请充值");
        }
        order.setOrderstate(4);
        order.setPaystate(1);
        int i = orderService.insertSelective(order);
        if(i<=0){
            return Response.Error("订单创建失败");
        }
        userService.orderPay(order);
        return Response.Success("订单创建成功");
    }

    @GetMapping("selectOfOrderDaiFuKuan")
    public Response selectOfOrderDaiFuKuan(String userid){
        List<Order> orders = orderService.selectOfOrderDaiFuKuan(userid);
        if (orders.size()==0){
            return Response.Error("没有待支付订单");
        }
        for (Order order:orders) {
            String shopCartId = order.getShopCartId();
            String[] split = shopCartId.split(",");
            ShopCart shopCart = shopCartService.selectByPrimaryKey(split[0]);
            Book book = bookService.queryBook(shopCart.getBookid().toString());
            order.setOrderImg(book.getBookImg());
        }
        return  Response.Success(orders);
    }

    @GetMapping("selectOfOrderCompleted")
    public Response selectOfOrderCompleted(String userid){
        List<Order> orders = orderService.selectOfOrderCompleted(userid);
        if (orders.size()==0){
            return Response.Error("没有已完成订单");
        }
        return Response.Success(orders);
    }
    @GetMapping("selectOfOrderDaiFaHuo")
    public Response selectOfOrderDaiFaHuo(String userid){
        List<Order> orders = orderService.selectOfOrderDaiFaHuo(userid);
        if (orders.size()==0){
            return Response.Error("没有待付款订单");
        }
        return Response.Success(orders);
    }
    @GetMapping("selectOfOrderDaiShouHuo")
    public Response selectOfOrderDaiShouHuo(String userid){
        List<Order> orders = orderService.selectOfOrderDaiShouHuo(userid);
        if (orders.size()==0){
            return Response.Error("没有待收货订单");
        }
        return Response.Success(orders);
    }
    @GetMapping("selectOfOrderDaiComment")
    public Response selectOfOrderDaiComment(String userid){
        List<Order> orders = orderService.selectOfOrderDaiComment(userid);
        if (orders.size()==0){
            return Response.Error("没有待评论订单");
        }
        return Response.Success(orders);
    }
}
