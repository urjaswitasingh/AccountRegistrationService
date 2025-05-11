package com.citybank.bankregistration.repository;

import com.citybank.bankregistration.model.Account;
import com.citybank.bankregistration.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepo extends MongoRepository<Account, Integer> {
    Account findByAccountNumber(int accountNum);
}
