package com.citybank.bankregistration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ShedulePayment {
    @Id
    private String paymentId;
    @DBRef
    Account fromAccount;
    @DBRef
    Account toAccount;
    double amount;
    Timestamp scheduleTime;
    String status;
}
