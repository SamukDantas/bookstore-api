package com.samuel.main;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.samuel.main.domain.Book;
import com.samuel.main.domain.Category;
import com.samuel.main.repository.BookRepository;
import com.samuel.main.repository.CategoryRepository;

@SpringBootApplication
public class BookstoreApplication implements CommandLineRunner{
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private BookRepository bookRepository;

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	public void run(String... args) throws Exception {
		Category category1 = new Category(null, "Informática", "Livros de TI");
		Book book1 = new Book(null, "Lógica de Programação", "Samuel Dantas", "Estruturas de controle", category1);
		
		category1.getBooks().addAll(Arrays.asList(book1));
		this.categoryRepository.saveAll(Arrays.asList(category1));
		this.bookRepository.saveAll(Arrays.asList(book1));
	}

}
