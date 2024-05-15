package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Service.Impl.BookServiceImpl;
import com.example.librarymanagementsystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @GetMapping("/")
    public List<Book> getAllBooks(){
        return bookService.getAllBooks();
    }
}
