package com.example.test.libraryapi;

import com.example.test.libraryapi.model.Book;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface BookRepository extends CrudRepository<Book, Long> {
    List<Book> findByBookTitle(String bookTitle);
    Book findById(long id);
    List<Book> findAll();
}
