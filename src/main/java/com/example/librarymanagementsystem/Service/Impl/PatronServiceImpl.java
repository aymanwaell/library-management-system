package com.example.librarymanagementsystem.Service.Impl;

import com.example.librarymanagementsystem.Repository.PatronRepository;
import com.example.librarymanagementsystem.Service.PatronService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatronServiceImpl implements PatronService {

    @Autowired
    private PatronRepository patronRepository;

}
