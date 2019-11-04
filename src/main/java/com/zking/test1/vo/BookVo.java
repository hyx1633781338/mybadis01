package com.zking.test1.vo;

import com.zking.test1.model.Book;
import lombok.Data;

@Data
public class BookVo extends Book{
    private Integer[] bookIds;
    private Float min;
    private Float max;

    public Integer[] getBookIds() {
        return bookIds;
    }

    public Float getMin() {
        return min;
    }

    public Float getMax() {
        return max;
    }

    public void setBookIds(Integer[] bookIds) {
        this.bookIds = bookIds;
    }

    public void setMin(Float min) {
        this.min = min;
    }

    public void setMax(Float max) {
        this.max = max;
    }

    public BookVo(Integer bookId, String bookName, Float bookPrice, String bookBrief, Integer[] bookIds, Float min, Float max) {
        super(bookId, bookName, bookPrice, bookBrief);
        this.bookIds = bookIds;
        this.min = min;
        this.max = max;
    }

    public BookVo(Integer[] bookIds, Float min, Float max) {
        this.bookIds = bookIds;
        this.min = min;
        this.max = max;
    }
    public BookVo() {

    }
}