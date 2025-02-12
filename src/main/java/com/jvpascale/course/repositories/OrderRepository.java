package com.jvpascale.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvpascale.course.entities.Order;
import com.jvpascale.course.entities.User;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
