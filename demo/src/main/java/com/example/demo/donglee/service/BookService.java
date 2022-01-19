package com.example.demo.donglee.service;

import com.example.demo.donglee.domain.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    List<Book> getBookList();

    Book getRestBook();
}
