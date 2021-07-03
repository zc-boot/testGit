package com.zc.book.dao;

import com.zc.book.pojo.Book;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Book key);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Book key);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> queryAllBook(Book book);

    List<Book> queryBookByType(Book book);

    Book  queryBook(String bookId);
}