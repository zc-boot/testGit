package com.zc.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.book.pojo.Book;
import com.zc.book.pojo.ShopCart;
import com.zc.book.pojo.query.ShopCartBookInfo;
import com.zc.book.pojo.reponse.Page;
import com.zc.book.pojo.reponse.Response;
import com.zc.book.service.Impl.BookServiceImpl;
import com.zc.book.service.Impl.ShopCartServiceImpl;
import com.zc.book.service.ShopCartService;
import com.zc.book.utils.GenerateOnlyId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("bookMall/shopCart")
public class ShopCartController {
    @Autowired
    private ShopCartServiceImpl shopCartService;
    @Autowired
    private BookServiceImpl bookService;

    @PostMapping("insertShopCart")
    public Response insertShopCart(@RequestBody  ShopCart shopCart){
        shopCart.setShopcartid(GenerateOnlyId.getSerialNumber());
        shopCart.setCreatedate(new Date());
        Book book = bookService.queryBook(shopCart.getBookid().toString());
        shopCart.setAmount(book.getPrice());
        int i = shopCartService.insertSelective(shopCart);
        if (i>0){
            return Response.Success("已成功加入购物车！");
        }
        return Response.Success("加入购物车失败");
    }
    @PostMapping("queryMyShopCart")
    public Response queryMyShopCart(@RequestBody  ShopCart shopCart){
//        PageHelper.startPage(shopCart.getPageNum(),shopCart.getPageSize());
        List<ShopCartBookInfo> shopCarts = shopCartService.queryMyShopCart(shopCart.getUserid());
        if (shopCarts.size()==0){
            return Response.Success("您还没有添加商品");
        }
//        PageInfo<ShopCartBookInfo> pageInfo =new PageInfo<>(shopCarts);
//        Page<ShopCartBookInfo> shopCartPage = new Page<>(pageInfo.getTotal(), pageInfo.getList());
        return Response.Success(shopCarts);
    }
    @PostMapping("updateMyShopCart")
    public Response updateMyShopCart(@RequestBody ShopCart shopCart){
        int i = shopCartService.updateByPrimaryKeySelective(shopCart);
        if (i<=0){
            return Response.Error("编辑失败");
        }
        return Response.Success("修改成功");
    }
    //批量删除
    @GetMapping("deleteMyShopCarts")
    public Response deleteMyShopCart(String[] shopCartIds){
        int i = shopCartService.deleteMyShopCarts(shopCartIds);
        if (i<=0){
            return Response.Error("删除失败");
        }
        return Response.Success("删除成功");
    }
    @GetMapping("deleteMyShopCart")
    public Response deleteMyShopCart(String shopCartId){
        int i = shopCartService.deleteMyShopCart(shopCartId);
        if (i<=0){
            return Response.Error("删除失败");
        }
        return Response.Success("删除成功");
    }
}
