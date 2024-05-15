package com.example.librarymanagementsystem.Service;

public interface BorrowingRecordService {

    void borrowBook(Long bookId, Long patronId);
    void returnBook(Long bookId, Long patronId);
}
