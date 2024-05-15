package com.example.librarymanagementsystem.Controller;

import com.example.librarymanagementsystem.Service.Impl.BorrowingRecordServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/borrowing-record")
public class BorrowingRecordController {

    @Autowired
    private BorrowingRecordServiceImpl borrowingRecordService;

}
