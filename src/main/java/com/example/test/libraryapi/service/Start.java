package com.example.test.libraryapi.service;

import com.example.test.libraryapi.BookRepository;
import com.example.test.libraryapi.UserRepository;
import com.example.test.libraryapi.model.Book;
import com.example.test.libraryapi.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class Start {
    private BookRepository bookRepository;
    private UserRepository userRepository;

    @Autowired
    public Start(BookRepository bookRepository, UserRepository userRepository) {
        this.bookRepository = bookRepository;
        this.userRepository = userRepository;
    }

    @EventListener(ApplicationReadyEvent.class)
    public void start() {
        bookRepository.save(new Book("Mikhail Bulkhakow", "Master and Margarita"));
        bookRepository.save(new Book("Kurt Vonnegut", "Butcherhouse-Five"));
        bookRepository.save(new Book("Mario Puzo", "Godfather"));

        userRepository.save(new User("Jan Kiel", "jan.kiel@a.com"));
        userRepository.save(new User("Radek G", "radzio@b.com"));

    }
}
