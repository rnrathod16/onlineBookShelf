package com.example.demo.persistance;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Orders;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
	@Query("from Orders where uid=?1")
	public List<Orders> orderHistory(int uid);
	
	
}
