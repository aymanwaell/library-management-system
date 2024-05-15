package com.example.librarymanagementsystem.Service.Impl;

import com.example.librarymanagementsystem.Repository.BookRepository;
import com.example.librarymanagementsystem.Repository.PatronRepository;
import com.example.librarymanagementsystem.Service.BorrowingRecordService;
import com.example.librarymanagementsystem.model.Book;
import com.example.librarymanagementsystem.model.Patron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingRecordServiceImpl implements BorrowingRecordService {
    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private PatronRepository patronRepository;

    @Override
    public void borrowBook(Long bookId, Long patronId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        Patron patron = patronRepository.findById(patronId)
                .orElseThrow(() -> new RuntimeException("Patron not found"));

        book.setBorrowedBy(patron);
        bookRepository.save(book);
    }

    @Override
    public void returnBook(Long bookId, Long patronId) {
        Book book = bookRepository.findById(bookId)
                .orElseThrow(() -> new RuntimeException("Book not found"));
        Patron patron = patronRepository.findById(patronId)
                .orElseThrow(() -> new RuntimeException("Patron not found"));

        book.setBorrowedBy(null);
        bookRepository.save(book);
    }
}
