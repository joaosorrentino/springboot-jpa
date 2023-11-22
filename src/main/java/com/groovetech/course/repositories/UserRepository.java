package com.groovetech.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.groovetech.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
