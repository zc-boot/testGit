package com.zc.book.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.zc.book.pojo.BookComment;
import com.zc.book.pojo.reponse.Page;
import com.zc.book.pojo.reponse.Response;
import com.zc.book.service.Impl.BookCommentServiceImpl;
import com.zc.book.utils.GenerateOnlyId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("bookMall/bookComment")
public class BookCommentController {
    @Autowired
    private BookCommentServiceImpl bookCommentService;

    @PostMapping("addBookComment")
    public Response addBookComment(@RequestBody BookComment bookComment){
        bookComment.setCommenrcreatedate(new Date());
        bookComment.setCommentId(GenerateOnlyId.getCommentId());
        bookCommentService.insertSelective(bookComment);
        return Response.Success("发表成功");
    }
    @PostMapping("queryBookComment")
    public Response queryBookComment(@RequestBody BookComment bookComment){
        PageHelper.startPage(bookComment.getPageNum(),bookComment.getPageSize());
        List<BookComment> bookComments = bookCommentService.queryCommentByBookId(bookComment.getBookid());
        PageInfo<BookComment> bookCommentPageInfo = new PageInfo<>(bookComments);
        Page<BookComment> bookCommentPage = new Page<>(bookCommentPageInfo.getTotal(), bookCommentPageInfo.getList());
        return Response.Success(bookCommentPage);
    }
}
