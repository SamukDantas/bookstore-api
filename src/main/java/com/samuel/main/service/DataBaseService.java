package com.samuel.main.service;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.samuel.main.domain.Book;
import com.samuel.main.domain.Category;
import com.samuel.main.repository.BookRepository;
import com.samuel.main.repository.CategoryRepository;

@Service
public class DataBaseService {
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private BookRepository bookRepository;
	
	public void instanceDB() {
		Category category1 = new Category(null, "Informática", "Livros de TI");
		Book book1 = new Book(null, "Lógica de Programação", "Samuel Dantas", "Estruturas de controle", category1);
		
		category1.getBooks().addAll(Arrays.asList(book1));
		
		this.categoryRepository.saveAll(Arrays.asList(category1));
		this.bookRepository.saveAll(Arrays.asList(book1));
	}

}
