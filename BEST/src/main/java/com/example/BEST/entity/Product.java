package com.example.BEST.entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Product {
 @Id
 private long prodId;
 private String prodName;
 private double price;

 
 public long getProdId() {
     return prodId;
 }

 public void setProdId(long id) {
     this.prodId = id;
 }

 public String getProdName() {
     return prodName;
 }

 public void setProdName(String name) {
     this.prodName = name;
 }

 public double getPrice(){
     return price;
 }

 public void setPrice(double price) {
     this.price = price;
 }

 
}
