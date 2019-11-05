package br.com.flsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flsoftware.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
