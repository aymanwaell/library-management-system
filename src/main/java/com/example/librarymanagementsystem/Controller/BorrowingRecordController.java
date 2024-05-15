package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Service.BookService;
import com.example.librarymanagementsystem.Service.PatronService;
import com.example.librarymanagementsystem.model.Book;
import com.example.librarymanagementsystem.model.Patron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/borrowing-record")
public class BorrowingRecordController {

    @Autowired
    private BookService bookService;

    @Autowired
    private PatronService patronService;

    @PostMapping("/borrow/{bookId}/patron/{patronId}")
    public ResponseEntity<Void> borrowBook(@PathVariable Long bookId, @PathVariable Long patronId) {
        Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        Patron patron = patronService.findById(patronId).orElseThrow(() -> new RuntimeException("Patron not found"));
        book.setBorrowedBy(patron);
        bookService.save(book);
        return ResponseEntity.ok().build();
    }

    @PutMapping("/return/{bookId}/patron/{patronId}")
    public ResponseEntity<Void> returnBook(@PathVariable Long bookId, @PathVariable Long patronId) {
        Book book = bookService.findById(bookId).orElseThrow(() -> new RuntimeException("Book not found"));
        Patron patron = patronService.findById(patronId).orElseThrow(() -> new RuntimeException("Patron not found"));
        if (book.getBorrowedBy() != null && book.getBorrowedBy().getId() == patronId) {
            book.setBorrowedBy(null);
            bookService.save(book);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.badRequest().build();
        }
    }
}
