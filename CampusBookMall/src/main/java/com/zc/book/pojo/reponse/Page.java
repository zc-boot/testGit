package com.zc.book.pojo.reponse;


import java.util.List;

public class Page<T> {
    private Integer code =0;
    private Long count;
    private List<T> data;
    private String msg;

    public Page() {
    }

    public Page(Long count, List<T> data) {
        this.count = count;
        this.data = data;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<T> getData() {
        return data;
    }

    public void setData(List<T> data) {
        this.data = data;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
