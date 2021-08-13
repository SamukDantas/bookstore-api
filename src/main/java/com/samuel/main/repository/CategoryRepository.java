package com.samuel.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.samuel.main.domain.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {
	
}
