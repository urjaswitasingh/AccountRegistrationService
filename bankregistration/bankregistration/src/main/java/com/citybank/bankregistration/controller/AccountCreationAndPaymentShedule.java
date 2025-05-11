package com.citybank.bankregistration.controller;

import com.citybank.bankregistration.model.ShedulePayment;
import com.citybank.bankregistration.model.User;
import com.citybank.bankregistration.response.ReturnResponce;
import com.citybank.bankregistration.service.AccountCreation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class AccountCreationAndPaymentShedule {
      @Autowired
      AccountCreation accountCreation;
      @PostMapping("/user/register")
      public ResponseEntity<ReturnResponce> userRegister(@RequestBody User user){
          return accountCreation.userRegister(user);
      }

      @PostMapping("/schedulePayment")
      public ShedulePayment shedulePayment(@RequestBody ShedulePayment shedulePayment){
            return accountCreation.shedulePayment(shedulePayment);
      }
}
