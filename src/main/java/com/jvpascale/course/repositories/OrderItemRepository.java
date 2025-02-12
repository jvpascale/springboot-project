package com.jvpascale.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jvpascale.course.entities.OrderItem;
import com.jvpascale.course.entities.pk.OrderItemPK;


public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {

}
