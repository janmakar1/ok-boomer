package com.example.test.libraryapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

import com.example.test.libraryapi.model.Book;

@RestController
public class BookController {
    private BookRepository bookRepository;

    @Autowired
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @GetMapping("/books")
    public List<Book> getAllBooks() {
        List<Book> books = bookRepository.findAll();
        return books;

//        List<Book> books = new ArrayList<Book>();
//        books.add(new Book("Adolf Shrek", "Mein Shwamp"));
//        books.add(new Book("Shrekkington Jones Jr.", "Star Shrek"));
//        return books;
    }

    @GetMapping("/book")
    public Book getBookById(@RequestParam(value = "id") Long id) {
        Book foundBook = bookRepository.findById(id).get();
//        Book foundBook = new Book(id,"Adi Nowak", "Moj rap");

        return foundBook;
    }

}
