package com.citybank.bankregistration.service;

import com.citybank.bankregistration.kafka.Producer;
import com.citybank.bankregistration.model.Account;
import com.citybank.bankregistration.model.ShedulePayment;
import com.citybank.bankregistration.model.User;
import com.citybank.bankregistration.repository.AccountRepo;
import com.citybank.bankregistration.repository.SheduleRepo;
import com.citybank.bankregistration.repository.UserRepo;
import com.citybank.bankregistration.response.ReturnResponce;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.time.LocalDate;


@Service
public class AccountCreation {
    @Autowired
    UserRepo userRepo;
    @Autowired
    SheduleRepo sheduleRepo;
    @Autowired
    Producer producer;
    @Autowired
    AccountRepo accountRepo;

    public ResponseEntity<ReturnResponce> userRegister(User user) {
        ReturnResponce returnResponce = new ReturnResponce();
        try {
            User createdUser = userRepo.save(user);
            Account account = new Account();
            account.setAccountType("Saving");
            account.setCreatedAt(LocalDate.now());
            account.setBalance(2000);
            account.setBankName("Citi Bank");
            account.setIfscCode("CITI983764");
            account.setUser(createdUser);
            Account saveAccount = accountRepo.save(account);
            returnResponce.setStatusCode(200);
            returnResponce.setStatusMessage("Account created successfully");
            returnResponce.setData(saveAccount);
            return ResponseEntity.ok(returnResponce);
        }catch(Exception ex){

           returnResponce.setStatusCode(422);
           returnResponce.setStatusMessage("Registration failed");
           return new ResponseEntity<ReturnResponce> (returnResponce, HttpStatus.UNPROCESSABLE_ENTITY);
        }


    }

    public ShedulePayment shedulePayment(ShedulePayment shedulePayment){
        ShedulePayment shedulePayment1 = sheduleRepo.save(shedulePayment);
        producer.sendMessage(shedulePayment1);
        return shedulePayment1;
    }
     public String fundTransfer(int userId, int senderNumber, int receiverAccount, double amount){
        User user = userRepo.findAllByUserId(userId);
        Account receiveraccount = accountRepo.findByAccountNumber(receiverAccount);
        if(receiveraccount!=null && receiveraccount.getBalance()>=amount){
            receiveraccount.setBalance(receiveraccount.getBalance()-amount);
            accountRepo.save(receiveraccount);
        }
        Account senderAccount =accountRepo.findByAccountNumber(senderNumber);
        senderAccount.setBalance(senderAccount.getBalance()+amount);
        accountRepo.save(senderAccount);
        return "Fund transfer successful";

     }
}
