package com.zc.book.utils;

import java.util.Random;

public class GeneratID {
    public static String getRandomId(){
        long  t = System.currentTimeMillis();
        Random rd =  new  Random(t);
        Integer id = rd.nextInt(1000000);
        return id.toString();
    }
    public static String getShopCartId(){
        long  t = System.currentTimeMillis();
        Random rd =  new  Random(t);
        Integer id = rd.nextInt(1000000000);
        return id.toString();
    }

    public static void main(String[] args) {
        System.out.println(getShopCartId());
    }
}
