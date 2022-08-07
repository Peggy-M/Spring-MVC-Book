package com.peggy.service.impl;

import com.peggy.dao.BookDao;
import com.peggy.daomain.Books;
import com.peggy.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class BookServiceImpl implements BookService {

    @Override
    public void addBook(Books books) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.addBook(books);
    }

    @Override
    public void delBook(Integer bookID) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.delBook(bookID);
    }

    @Override
    public void upBook(Books books) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        bookDao.upBook(books);
    }

    @Override
    public Books getBookID(Integer bookID) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        return bookDao.getBookID(bookID);
    }

    @Override
    public List<Books> getAllBook() {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        return bookDao.getAllBook();
    }
}
