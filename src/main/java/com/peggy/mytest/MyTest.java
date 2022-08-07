package com.peggy.mytest;

import com.peggy.dao.BookDao;
import com.peggy.daomain.Books;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {
    @Test
    public void test001(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        List<Books> allBook = bookDao.getAllBook();
        allBook.forEach(System.out::println);
    }
    @Test
    public void test002(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        Books book = bookDao.getBookID(1);
        System.out.println(book);
    }
    @Test
    public void test003(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-dao.xml");
        BookDao bookDao = context.getBean("bookDao", BookDao.class);
        Books books=new Books("霍乱中的爱情",10,"爱情就像霍乱一样依法不可收拾");
        bookDao.addBook(books);
    }
}
