package com.zking.test1.service;

import com.zking.test1.model.Book;
import com.zking.test1.util.PageBean;
import com.zking.test1.vo.BookVo;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class IBookSeriveTest extends BaseTestCase{

    @Autowired
    private IBookService bookSerive;

    private Book book;

    @Before
    public void before(){
        book = new Book();
    }

    @Test
    public void add() throws Exception {
        book.setBookId(null);
        book.setBookName("111");
        book.setBookPrice(33f);
        book.setBookBrief("--------2313---------");
        int rowCount = this.bookSerive.add(book);
        System.out.println(rowCount);
        System.out.println(book.getBookId());
    }

    @Test
    public void addAll() throws Exception {
        for (int i=0;i<100 ;i++){
            book = new Book();
            book.setBookId(null);
            book.setBookName("打狗棒法第"+(i+1)+"层");
            book.setBookPrice(100f);
            book.setBookBrief("--------10000---------");
            this.bookSerive.add(book);
        }
    }

    @Test
    public void load() throws Exception {
        book.setBookId(3);
        Book b = this.bookSerive.load(book);
        System.out.println(b);
        System.out.println("**************");
        book.setBookId(3);
        Book b2 = this.bookSerive.load(book);
        System.out.println(b2);
    }

    @Test
    public void edit() throws Exception {
        book.setBookId(7);
        book.setBookName("2222222");
        book.setBookPrice(255f);
        book.setBookBrief("**********");
        bookSerive.edit(book);
    }

    @Test
    public void editPrice() throws Exception {
        book.setBookId(3);
        book.setBookPrice(6666f);
        bookSerive.editPrice(book);
    }

    @Test
    public void del() throws Exception {
        book.setBookId(2);
        bookSerive.del(book);
    }
    @Test
    public void delAll() throws Exception {
        BookVo bookVo = new BookVo();
        bookVo.setBookIds(new Integer[]{10,11,12});
        bookSerive.delAll(bookVo);
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