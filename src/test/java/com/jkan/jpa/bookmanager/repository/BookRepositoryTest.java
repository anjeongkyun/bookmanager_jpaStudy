package com.jkan.jpa.bookmanager.repository;

import com.jkan.jpa.bookmanager.domain.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BookRepositoryTest {

    @Autowired
    private BookRepository bookRepository;

    @Test
    void bookTest() {
        Book book = new Book();
        book.setName("토비의 스프링");
        book.setAuthor("토비");

        bookRepository.save(book);

        System.out.println(bookRepository.findAll());

    }
}
