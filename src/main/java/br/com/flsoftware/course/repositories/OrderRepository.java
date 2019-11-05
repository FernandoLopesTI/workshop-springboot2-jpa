package br.com.flsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flsoftware.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
