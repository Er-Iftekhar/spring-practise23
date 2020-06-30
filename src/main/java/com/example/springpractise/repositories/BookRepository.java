package com.example.springpractise.repositories;

import com.example.springpractise.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}
