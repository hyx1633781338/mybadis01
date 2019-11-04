package com.zking.test1.mapper;

import com.zking.test1.model.Book;
import com.zking.test1.vo.BookVo;

import java.util.List;

public interface BookMapper {
    int deleteByPrimaryKey(Integer bookId);

    int delAll(BookVo bookVo);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookId);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

    List<Book> list(BookVo bookVo);
}