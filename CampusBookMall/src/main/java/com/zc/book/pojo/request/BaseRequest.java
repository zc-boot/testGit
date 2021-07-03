package com.zc.book.pojo.request;



public class BaseRequest {
    /**
     * 第几页
     */
    private Integer pageNum;
    /**
     * 每页多少数据
     */
    private Integer pageSize;
    /**
     * 第几页
     */
    private Integer page;
    /**
     * 每页多少数据
     */
    private Integer limit;



    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getPage() {
        return page;
    }

    public void setPage(Integer page) {
        this.page = page;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }


}
