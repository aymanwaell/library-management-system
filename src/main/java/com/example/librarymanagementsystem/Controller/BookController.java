package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Service.Impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

}
