package com.example.test.libraryapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDate;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    Book book;
    User user;
    LocalDate startDate;

    protected Order() {
    }

    public Order(Book book, User user, LocalDate startDate) {
        this.book = book;
        this.user = user;
        this.startDate = startDate;
    }

    public Long getId() {
        return id;
    }

    public Book getBook() {
        return book;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getStartDate() {
        return startDate;
    }
}
