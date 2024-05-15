package com.example.librarymanagementsystem.Service.Impl;

import com.example.librarymanagementsystem.Repository.BookRepository;
import com.example.librarymanagementsystem.Service.BookService;
import com.example.librarymanagementsystem.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

    public List<Book> getAllBooks() {
        return bookRepository.findAll();
    }
}
