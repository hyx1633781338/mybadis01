package com.zking.test1.service;

import com.zking.test1.model.Book;
import com.zking.test1.util.PageBean;
import com.zking.test1.vo.BookVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static org.junit.Assert.*;

public class IBookServiceTest2 extends BaseTestCase{

    @Autowired
    private IBookService bookSerive;

    private Book book;

    @Before
    public void before(){
        book = new Book();
    }

    @Test
    public void list() throws Exception {
        BookVo bookVo = new BookVo();
        PageBean pageBean = new PageBean();

        List<Book> bookList = bookSerive.list(bookVo, pageBean);
        for(Book  b : bookList){
            System.out.println(b);
        }
        System.out.println(pageBean);
    }

}