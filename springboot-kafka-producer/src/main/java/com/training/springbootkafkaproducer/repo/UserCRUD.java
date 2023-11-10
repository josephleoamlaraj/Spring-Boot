package com.training.springbootkafkaproducer.repo;

import com.training.springbootkafkaproducer.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUD extends CrudRepository<User,Integer> {

}
