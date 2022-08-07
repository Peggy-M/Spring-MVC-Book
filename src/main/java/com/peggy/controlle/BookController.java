package com.peggy.controlle;

import com.peggy.daomain.Books;
import com.peggy.service.impl.BookServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.awt.print.Book;
import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    BookServiceImpl bookService = new BookServiceImpl();
    @RequestMapping("/getBookID")
    public String getBookID(Integer bookID , Model model){
        Books book = bookService.getBookID(3);
        model.addAttribute("msg",book);
        return "book";
    }
    @RequestMapping("/getAllBook")
    public String getAllBook(Model model){
        List<Books> allBook = bookService.getAllBook();
        allBook.forEach(System.out::println);
        model.addAttribute("list",allBook);
        return "allBook";
    }
    @RequestMapping("/addBook")
    public String addBook(Books book){
        bookService.addBook(book);
        return "redirect:/book/getAllBook";
    }
    @RequestMapping("/toAddBook")
    public String toAddBook(){
        return "addBook";
    }
}
