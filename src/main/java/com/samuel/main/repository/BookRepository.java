package com.samuel.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuel.main.domain.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Integer> {
	
}
