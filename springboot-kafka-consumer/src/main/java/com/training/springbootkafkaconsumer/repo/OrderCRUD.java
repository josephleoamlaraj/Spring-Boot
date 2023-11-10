package com.training.springbootkafkaconsumer.repo;

import com.training.springbootkafkaconsumer.bean.Order;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderCRUD extends CrudRepository<Order,Integer> {

}
