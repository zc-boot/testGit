package com.zc.book.service.Impl;

import com.zc.book.dao.BookMapper;
import com.zc.book.pojo.Book;
import com.zc.book.pojo.Order;
import com.zc.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {
    @Autowired(required = false)
    private BookMapper bookMapper;


    @Override
    public int deleteByPrimaryKey(Book key) {
        return bookMapper.deleteByPrimaryKey(key);
    }

    @Override
    public int insert(Book record) {
        return bookMapper.insert(record);
    }

    @Override
    public int insertSelective(Book record) {
        return bookMapper.insertSelective(record);
    }

    @Override
    public Book selectByPrimaryKey(Book key) {
        return bookMapper.selectByPrimaryKey(key);
    }

    @Override
    public int updateByPrimaryKeySelective(Book record) {
        return bookMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKey(Book record) {
        return bookMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<Book> queryAllBook(Book book) {
        return bookMapper.queryAllBook(book);
    }

    @Override
    public List<Book> queryBookByType(Book book) {
        return bookMapper.queryBookByType(book);
    }

    @Override
    public Book queryBook(String bookId) {
        return bookMapper.queryBook(bookId);
    }
}
