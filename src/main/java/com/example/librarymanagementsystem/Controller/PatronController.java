package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Service.Impl.PatronServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/patrons")
public class PatronController {

    @Autowired
    private PatronServiceImpl patronService;

}
