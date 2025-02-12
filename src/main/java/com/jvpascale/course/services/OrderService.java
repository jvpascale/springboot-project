package com.jvpascale.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.jvpascale.course.entities.Order;
import com.jvpascale.course.entities.User;
import com.jvpascale.course.repositories.OrderRepository;
import com.jvpascale.course.repositories.UserRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository OrderRepository;
	
	public List<Order> FindAll(){
		return OrderRepository.findAll();
	}
	
	public Order findById(Long id) {
		return OrderRepository.findById(id).get();
	}
	
}
