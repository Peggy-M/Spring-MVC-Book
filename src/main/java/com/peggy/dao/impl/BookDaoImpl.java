package com.peggy.dao.impl;

import com.peggy.dao.BookDao;
import com.peggy.daomain.Books;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import java.util.List;

public class BookDaoImpl extends SqlSessionDaoSupport implements BookDao {

    @Override
    public void addBook(Books books) {
        BookDao mapper = getSqlSession().getMapper(BookDao.class);
        mapper.addBook(books);
    }

    @Override
    public void delBook(Integer bookID) {
        BookDao mapper = getSqlSession().getMapper(BookDao.class);
        mapper.delBook(bookID);
    }

    @Override
    public void upBook(Books books) {
        BookDao mapper = getSqlSession().getMapper(BookDao.class);
        mapper.upBook(books);
    }

    @Override
    public Books getBookID(Integer bookID) {
        BookDao mapper = getSqlSession().getMapper(BookDao.class);
        return mapper.getBookID(bookID);
    }

    @Override
    public List<Books> getAllBook() {
        BookDao mapper = getSqlSession().getMapper(BookDao.class);
        return mapper.getAllBook();
    }
}
