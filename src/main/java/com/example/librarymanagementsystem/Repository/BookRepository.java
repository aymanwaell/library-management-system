package com.example.librarymanagementsystem.Repository;

import com.example.librarymanagementsystem.Service.BookService;
import com.example.librarymanagementsystem.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long>{

}
