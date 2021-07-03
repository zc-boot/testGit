package com.zc.book.pojo.reponse;


public class Response<T> {
    private Integer code;
    private String msg;
    private T data;

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public Response(){

    }
    public Response(Integer code, String msg){
        this.msg=msg;
        this.code=code;
    }
    public Response(Integer code, String msg, T data){
        this.msg=msg;
        this.code=code;
        this.data=data;
    }
    public static Response Error(String msg) {
        return new Response(2, msg);
    }

    public static Response Success(String msg) {
        return new Response(1, msg);
    }

    public static Response Success(Object data) {
        return new Response(1, "成功", data);
    }

    public static Response Success() {
        return new Response(1, "成功");
    }

    public static Response Unauthorized() {
        return new Response(3, "未认证");
    }

    public static Response Nouthority() {
        return new Response(4, "无权限操作");
    }

    public static Response Unknown() {
        return new Response(5, "状态未知");
    }

}
