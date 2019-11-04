package com.zking.test1.service;

import com.zking.test1.model.Book;
import com.zking.test1.util.PageBean;
import com.zking.test1.vo.BookVo;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
public interface IBookService {
    int add(Book book);

    int edit(Book book);

    int editPrice(Book book);

    int del(Book book);

    int delAll(BookVo bookVo);

    @Transactional(readOnly = true)
    Book load(Book book);

    @Transactional(readOnly = true)
    List<Book> list(BookVo bookVo, PageBean pageBean);
}
