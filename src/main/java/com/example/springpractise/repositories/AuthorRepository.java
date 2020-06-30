package com.example.springpractise.repositories;

import com.example.springpractise.model.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {
}
