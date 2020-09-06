package com.example.test.libraryapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    String authorName;
    String bookTitle;

    protected Book() {
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", authorName='" + authorName + '\'' +
                ", bookTitle='" + bookTitle + '\'' +
                '}';
    }

    public Book(String authorName, String bookTitle) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
    }

    public Book(Long id, String authorName, String bookTitle) {
        this.id = id;
        this.authorName = authorName;
        this.bookTitle = bookTitle;
    }

    public Long getId() {
        return id;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getBookTitle() {
        return bookTitle;
    }

}
