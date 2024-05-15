package com.example.librarymanagementsystem.Service.Impl;

import com.example.librarymanagementsystem.Repository.BorrowingRecordRepository;
import com.example.librarymanagementsystem.Service.BorrowingRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowingRecordServiceImpl implements BorrowingRecordService {

    @Autowired
    private BorrowingRecordRepository borrowingRecordRepository;

}
