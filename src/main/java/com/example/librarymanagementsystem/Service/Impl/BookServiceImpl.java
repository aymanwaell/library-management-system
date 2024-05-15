package com.example.librarymanagementsystem.Service.Impl;

import com.example.librarymanagementsystem.Repository.BookRepository;
import com.example.librarymanagementsystem.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository bookRepository;

}
