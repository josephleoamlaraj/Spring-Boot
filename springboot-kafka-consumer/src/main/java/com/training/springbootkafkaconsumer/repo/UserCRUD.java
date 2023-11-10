package com.training.springbootkafkaconsumer.repo;

import com.training.springbootkafkaconsumer.bean.User;
import org.springframework.data.repository.CrudRepository;

public interface UserCRUD extends CrudRepository<User,Integer> {

}
