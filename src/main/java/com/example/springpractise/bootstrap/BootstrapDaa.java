package com.example.springpractise.bootstrap;

import com.example.springpractise.model.Author;
import com.example.springpractise.model.Book;
import com.example.springpractise.model.Publisher;
import com.example.springpractise.repositories.AuthorRepository;
import com.example.springpractise.repositories.BookRepository;
import com.example.springpractise.repositories.PublisherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootstrapDaa implements CommandLineRunner {


    private static final Logger log= LoggerFactory.getLogger(BootstrapDaa.class);
    public final AuthorRepository authorRepository;
    public final BookRepository bookRepository;
    public final PublisherRepository publisherRepository;

    public BootstrapDaa(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {

        Author author1=new Author("f1", "l1");
        Book book1=new Book("t1","123456");
        Publisher p1=new Publisher("sathya");

        publisherRepository.save(p1);
        author1.getBooks().add(book1);
        book1.getAuthors().add(author1);
        book1.setPublisher(p1);

        bookRepository.save(book1);
        authorRepository.save(author1);
        publisherRepository.save(p1);

        log.info("Nummber of authors="+authorRepository.count());
        log.info("Number of books="+bookRepository.count());
        log.info("number of publishers="+publisherRepository.count());


    }
}
