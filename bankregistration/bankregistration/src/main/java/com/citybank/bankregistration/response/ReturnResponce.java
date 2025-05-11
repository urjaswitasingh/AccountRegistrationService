package com.citybank.bankregistration.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
@AllArgsConstructor
public class ReturnResponce<T> {
   private  int statusCode;
   private String statusMessage;
   private T data;
}
