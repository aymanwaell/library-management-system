package com.example.librarymanagementsystem.Service;

import com.example.librarymanagementsystem.model.Patron;

import java.util.List;
import java.util.Optional;

public interface PatronService {

    List<Patron> findAll();
    Optional<Patron> findById(Long id);
    Patron save(Patron patron);
    Patron update(Long id, Patron patronDetails);
    void deleteById(Long id);
}
