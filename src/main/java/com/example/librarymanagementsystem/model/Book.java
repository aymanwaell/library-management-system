package com.example.librarymanagementsystem.model;

import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@Entity
public class Book {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String title;

    private String author;

    private LocalDate publicationYear;

    private String ISBN;

    @OneToMany(mappedBy = "book")
    private Set<BorrowingRecord> borrowingRecords;
}
