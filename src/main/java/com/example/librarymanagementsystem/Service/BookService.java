package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<Book> getAllBooks();

    Optional<Book> getBookById(Long id);

    Book saveBook(Book book);

    Book updateBook(Long id, Book bookDetails);

    void deleteBook(Long id);
}
