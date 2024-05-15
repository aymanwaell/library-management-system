package com.example.librarymanagementsystem.Service.Impl;


import com.example.librarymanagementsystem.Repository.PatronRepository;
import com.example.librarymanagementsystem.Service.PatronService;
import com.example.librarymanagementsystem.model.Patron;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PatronServiceImpl implements PatronService {

    @Autowired
    private PatronRepository patronRepository;

    @Override
    public List<Patron> findAll() {
        return patronRepository.findAll();
    }

    @Override
    public Optional<Patron> findById(Long id) {
        return patronRepository.findById(id);
    }

    @Override
    public Patron save(Patron patron) {
        return patronRepository.save(patron);
    }

    @Override
    public Patron update(Long id, Patron patronDetails) {
        Patron patron = patronRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Patron not found"));

        patron.setName(patronDetails.getName());
        patron.setEmail(patronDetails.getEmail());

        return patronRepository.save(patron);
    }

    @Override
    public void deleteById(Long id) {
        patronRepository.deleteById(id);
    }
}
