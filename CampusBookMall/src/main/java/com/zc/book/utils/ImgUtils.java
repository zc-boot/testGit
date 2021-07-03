package com.zc.book.utils;

import org.springframework.web.multipart.MultipartFile;

public class ImgUtils {
    private Integer id;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public static String uploadFile(MultipartFile file){
        return null;
    }

    public static void main(String[] args) {
        ImgUtils integer = new ImgUtils();
        integer.setId(null);
        System.out.println(integer.getId()*5);
        System.out.println(integer.getId());
        System.out.println("sss");
    }
}
