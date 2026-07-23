package com.example;

import com.example.model.Book;
import com.example.repository.BookRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataJpaApplication implements CommandLineRunner {

    private final BookRepository bookRepository;

    public SpringDataJpaApplication(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringDataJpaApplication.class, args);
    }

    @Override
    public void run(String... args) {
        bookRepository.save(new Book("Clean Code", "Robert Martin"));
        bookRepository.save(new Book("Effective Java", "Joshua Bloch"));

        System.out.println("Books in database:");
        bookRepository.findAll().forEach(book ->
                System.out.println(book.getId() + ": " + book.getTitle() + " by " + book.getAuthor())
        );
    }
}