package com.peggy.dao;

import com.peggy.daomain.Books;

import java.util.List;

public interface BookDao {
    //添加一个图书
     void addBook(Books books);
    //根据id删除图书
    void delBook(Integer bookID);
    //更新图书
    void upBook(Books books);
    //更加id查询图书
    Books getBookID(Integer bookID);
    //查询所有得图书
    List<Books> getAllBook();
}
