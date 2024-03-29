package br.com.flsoftware.course.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flsoftware.course.entities.Order;
import br.com.flsoftware.course.entities.OrderItem;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
