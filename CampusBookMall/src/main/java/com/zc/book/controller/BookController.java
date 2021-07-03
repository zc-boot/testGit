package com.zc.book.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.book.pojo.Book;
import com.zc.book.pojo.reponse.Page;
import com.zc.book.pojo.reponse.Response;
import com.zc.book.service.Impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("bookMall/book")
public class BookController {
    @Autowired
    BookServiceImpl bookService;

    @GetMapping("queryAllBook")
    public Response queryAllBook(Book book){
        PageHelper.startPage(book.getPageNum(),book.getPageSize());
        List<Book> bookList = bookService.queryAllBook(book);
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        return Response.Success(bookPageInfo);
    }
    @PostMapping("queryBookByType")
    public Response queryBookByType(@RequestBody Book book){
        PageHelper.startPage(book.getPageNum(),book.getPageSize());
        List<Book> bookList = bookService.queryBookByType(book);
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        return Response.Success(bookPageInfo);
    }
    @PostMapping("queryBookByTypeChild")
    public Response queryBookByTypeChild(@RequestBody Book book){
        PageHelper.startPage(book.getPageNum(),book.getPageSize());
        List<Book> bookList = bookService.queryBookByType(book);
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        return Response.Success(bookPageInfo);
    }
    @PostMapping("queryBookByCateType")
    public Response queryBookByEducationType(@RequestBody Book book){
        Integer cateId=book.getCateId();
        PageHelper.startPage(book.getPageNum(),book.getPageSize());
        List<Book> bookList = bookService.queryBookByType(book);
        PageInfo<Book> bookPageInfo = new PageInfo<>(bookList);
        return Response.Success(bookPageInfo);
    }
}
