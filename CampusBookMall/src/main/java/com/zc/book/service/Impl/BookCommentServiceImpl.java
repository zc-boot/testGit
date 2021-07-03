package com.zc.book.service.Impl;

import com.zc.book.dao.BookCommentMapper;
import com.zc.book.pojo.BookComment;
import com.zc.book.service.BookCommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookCommentServiceImpl implements BookCommentService {
    @Autowired(required = false)
    private BookCommentMapper bookCommentMapper;
    @Override
    public int deleteByPrimaryKey(Integer id) {
        return bookCommentMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(BookComment record) {
        return bookCommentMapper.insert(record);
    }

    @Override
    public int insertSelective(BookComment record) {
        return bookCommentMapper.insertSelective(record);
    }

    @Override
    public BookComment selectByPrimaryKey(Integer id) {
        return bookCommentMapper.selectByPrimaryKey(id);
    }

    @Override
    public int updateByPrimaryKeySelective(BookComment record) {
        return bookCommentMapper.updateByPrimaryKeySelective(record);
    }

    @Override
    public int updateByPrimaryKeyWithBLOBs(BookComment record) {
        return bookCommentMapper.updateByPrimaryKeyWithBLOBs(record);
    }

    @Override
    public int updateByPrimaryKey(BookComment record) {
        return bookCommentMapper.updateByPrimaryKey(record);
    }

    @Override
    public List<BookComment> queryCommentByBookId(String bookid) {
        return bookCommentMapper.queryCommentByBookId(bookid);
    }
}
