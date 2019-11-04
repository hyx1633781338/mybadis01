package com.zking.test1.service.impl;

import com.zking.test1.mapper.BookMapper;
import com.zking.test1.model.Book;
import com.zking.test1.service.IBookService;
import com.zking.test1.util.PageBean;
import com.zking.test1.vo.BookVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements IBookService {

    @Autowired
    private BookMapper bookMapper;

    public BookServiceImpl(){
    }

    @Override
    public int edit(Book book) {
        return bookMapper.updateByPrimaryKey(book);
    }

    @Override
    public int editPrice(Book book) {
        Book b = new Book();
        b.setBookId(book.getBookId());
        b.setBookPrice(book.getBookPrice());
        return bookMapper.updateByPrimaryKeySelective(b);
    }

    @Override
    public int del(Book book) {
        return bookMapper.deleteByPrimaryKey(book.getBookId());
    }

    @Override
    public int delAll(BookVo bookVo) {
        return bookMapper.delAll(bookVo);
    }

    @Override
    public List<Book> list(BookVo bookVo, PageBean pageBean) {
//        if (null != pageBean && pageBean.isPagination()) {
//            PageHelper.startPage(pageBean.getPage(), pageBean.getRows());
//        }
//        List<Book> bookList = bookMapper.list(bookVo);
//        System.out.println(bookList.getClass().getName());
//        if (null != pageBean && pageBean.isPagination()) {
//            PageInfo pageInfo = new PageInfo();
//            pageBean.setTotal(pageInfo.getTotal()+"");
//        }
        return bookMapper.list(bookVo);
    }

    public BookMapper getBookMapper() {
        return bookMapper;
    }

    public void setBookMapper(BookMapper bookMapper) {
        this.bookMapper = bookMapper;
    }

    @Override
    public int add(Book book) {
        return bookMapper.insert(book);
    }

    @Override
    public Book load(Book book) {
        return bookMapper.selectByPrimaryKey(book.getBookId());
    }
}
