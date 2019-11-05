package br.com.flsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flsoftware.course.entities.Category;
import br.com.flsoftware.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
