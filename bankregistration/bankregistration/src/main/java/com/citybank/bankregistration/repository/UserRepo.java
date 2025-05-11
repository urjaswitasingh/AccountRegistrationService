package com.citybank.bankregistration.repository;

import com.citybank.bankregistration.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends MongoRepository<User, Integer> {
    User findAllByUserId(int user);
}
