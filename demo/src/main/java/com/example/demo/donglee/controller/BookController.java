package com.example.demo.donglee.controller;

import com.example.demo.donglee.domain.Book;
import com.example.demo.donglee.service.BookRestService;
import com.example.demo.donglee.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.awt.*;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @Autowired
    private BookRestService bookRestService;

    @GetMapping("/books")
    public String getBookList(Model model) {
        model.addAttribute("bookList", bookService.getBookList());
        return "book";
    }

    @GetMapping(value = "/rest/test", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book getRestBooks() {
        return bookRestService.getRestBook();
    }
}
