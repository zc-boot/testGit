package com.zc.book.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("bookMall/page")
public class PageController {
    @RequestMapping("login")
    public String login(){
        return "login";
    }
    @RequestMapping("index")
    public String index(){
        return "index";
    }
    @RequestMapping("bookShow")
    public String bookShow(){
        return "home/allBookShow";
    }
    @RequestMapping("registered")
    public String registered(){
        return "registered";
    }
    @RequestMapping("bookDetailInfo")
    public String bookDetailInfo(){
        return "home/bookDetailInfo";
    }
    @RequestMapping("myCart")
    public String myCart(){
        return "home/MyCart";
    }
    @RequestMapping("orderBuy")
    public String orderBuy(){
        return "home/orderBuy";
    }
    @RequestMapping("pendingPayment")
    public String pendingPayment(){
        return "home/pendingPayment";
    }
    @RequestMapping("educationBook")
    public String educationBook(){
        return "home/educationBook";
    }
    @RequestMapping("Textbook")
    public String Textbook(){
        return "home/Textbook";
    }
    @RequestMapping("chuSchool")
    public String chuSchool(){
        return "home/chuSchool";
    }
    @RequestMapping("HighSchool")
    public String HighSchool(){
        return "home/HighSchool";
    }
    @RequestMapping("foreignLanguage")
    public String foreignLanguage(){
        return "home/foreignLanguage";
    }
    @RequestMapping("headring")
    public String headring(){
        return "home/hearing";
    }
    @RequestMapping("spoken")
    public String spoken(){
        return "home/spoken";
    }
    @RequestMapping("daiFaHuo")
    public String daiFaHuo(){
        return "home/daiFaHuo";
    }
    @RequestMapping("daiShouHuo")
    public String daiShouHuo(){
        return "home/daiShouHuo";
    }
    @RequestMapping("completedOrder")
    public String completedOrder(){
        return "home/completedOrder";
    }
    @RequestMapping("recharge")
    public String recharge(){
        return "home/Recharge";
    }
}
