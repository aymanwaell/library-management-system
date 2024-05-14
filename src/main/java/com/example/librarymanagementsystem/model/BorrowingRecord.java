package com.example.librarymanagementsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class BorrowingRecord {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
}
