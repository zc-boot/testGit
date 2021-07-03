package com.zc.book.utils;

import org.springframework.util.StringUtils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DateParse {
    public static final String DATA_FORMAT_19 = "yyyy-MM-dd HH:mm:ss";
    public static final String DATA_FORMAT_17 = "yyyyMMddHHmmssSSS";
    long nd = 1000 * 24 * 60 * 60;// 一天的毫秒数
    long nh = 1000 * 60 * 60;// 一小时的毫秒数
    static long nm = 1000 * 60;// 一分钟的毫秒数
    static long ns = 1000;// 一秒钟的毫秒数
    long diff;
    long day = 0;
    long hour = 0;
    long min = 0;
    long sec = 0;
    public static long diffMiunte(String start,String end){
        long time=0l;
        long difftime=0l;
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(DATA_FORMAT_19);
        try {
            time = simpleDateFormat.parse(end).getTime() - simpleDateFormat.parse(start).getTime();
            difftime=time/ns;
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return difftime;
    }
    public static String getDate(){
        long l = System.currentTimeMillis();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(DATA_FORMAT_19);
        String format = simpleDateFormat.format(l);
        return format;
    }
    public static Date StringToDate(String time) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
        Date parse = simpleDateFormat.parse(time);
        return parse;
    }
    public static Date getDateByCalendar(){
        Calendar calendar=Calendar.getInstance();
        Date time = calendar.getTime();
        return time;
    }
    public static String formatDateTime(Date date){
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(DATA_FORMAT_19);
        return simpleDateFormat.format(date);
    }
    public static long minuteBetween(Date startTime,Date endTime){
        Calendar calendar=Calendar.getInstance();
        calendar.setTime(startTime);
        long s = calendar.getTimeInMillis();
        calendar.setTime(endTime);
        long e = calendar.getTimeInMillis();
        long betweenMin = (e - s) /(1000 * 60);
        return betweenMin;
    }
    public static Date stringToDate(String time){
        if(StringUtils.isEmpty(time)){
            return null;
        }
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat(DATA_FORMAT_19);
        try {
            return simpleDateFormat.parse(time);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return null;
    }

}
