package com.example.jersey.repository;

import com.example.jersey.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LibraryRepo extends JpaRepository<Book,Integer> {
//    List<Book> findAllByName(String name);
}
