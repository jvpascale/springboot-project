package com.jvpascale.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvpascale.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
