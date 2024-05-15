package com.example.librarymanagementsystem.model;

import jakarta.persistence.*;

import java.util.List;
import java.util.Set;

@Entity
public class Patron {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String name;

    private String phone;

    private String email;

    @OneToMany(mappedBy = "patron")
    private Set<BorrowingRecord> borrowingRecords;
}
