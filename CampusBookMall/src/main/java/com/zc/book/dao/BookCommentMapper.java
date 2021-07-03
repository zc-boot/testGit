package com.zc.book.dao;

import com.zc.book.pojo.BookComment;

import java.util.List;

public interface BookCommentMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(BookComment record);

    int insertSelective(BookComment record);

    BookComment selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(BookComment record);

    int updateByPrimaryKeyWithBLOBs(BookComment record);

    int updateByPrimaryKey(BookComment record);

    List<BookComment> queryCommentByBookId(String bookid);
}