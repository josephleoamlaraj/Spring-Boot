package com.training.springbootkafkaproducer.repo;

import com.training.springbootkafkaproducer.bean.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCRUD extends CrudRepository<Order,Integer> {

}
