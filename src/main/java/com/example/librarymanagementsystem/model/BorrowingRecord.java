package com.example.librarymanagementsystem.model;

import jakarta.persistence.*;

@Entity
public class BorrowingRecord {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    @JoinColumn(name = "book_id")
    private Book book;
}
