package br.com.flsoftware.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.flsoftware.course.entities.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
