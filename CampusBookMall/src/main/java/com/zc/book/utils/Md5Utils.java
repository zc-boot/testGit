package com.zc.book.utils;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class Md5Utils {
    public static String stringToMD5(String password) {
        byte[] secretBytes = null;
        try {
            secretBytes = MessageDigest.getInstance("md5").digest(
                    password.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException("没有这个md5算法！");
        }
        String md5Password = new BigInteger(1, secretBytes).toString(16);
        for (int i = 0; i < 32 - md5Password.length(); i++) {
            md5Password = "0" + md5Password;
        }
        return md5Password;
    }

    public static void main(String[] args) {
        System.out.println(stringToMD5("123456"));
    }
}
