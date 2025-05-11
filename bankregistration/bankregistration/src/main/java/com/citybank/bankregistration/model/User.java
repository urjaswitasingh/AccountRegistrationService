package com.citybank.bankregistration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.sql.Timestamp;
import java.time.LocalDate;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
private String  userId;
String name;
String email;
String password;
long phone;
LocalDate dob;
String address;
long aadhar;
String gender;

}
