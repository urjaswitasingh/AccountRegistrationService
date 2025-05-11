package com.citybank.bankregistration.repository;

import com.citybank.bankregistration.model.ShedulePayment;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SheduleRepo extends MongoRepository<ShedulePayment, Integer> {
}
