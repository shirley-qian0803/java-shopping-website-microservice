package com.jiayi.orderservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.jiayi.orderservice.model.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {


}
