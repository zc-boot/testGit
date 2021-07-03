package com.zc.book.utils;

import java.util.UUID;

public class GenerateOnlyId {
    private static Object lock=new Object();
    private static long golbal=12;
    public static String getSerialNumber(){
        long temp;
        synchronized(lock){
            temp=golbal++;
        }
        return String.format("sc%013d%05d",System.currentTimeMillis(),temp);
    }
    public static String getOrderId(){
        long temp;
        synchronized(lock){
            temp=golbal++;
        }
        return String.format("oi%013d%05d",System.currentTimeMillis(),temp);
    }
    public static String getCommentId(){
        long temp;
        synchronized(lock){
            temp=golbal++;
        }
        return String.format("ci%013d%05d",System.currentTimeMillis(),temp);
    }
    public static String getAddressId(){
        Integer temp=(int)Math.random()*10+1;
        return String.format("ua%013d%03d",System.currentTimeMillis(),temp);
    }
}
