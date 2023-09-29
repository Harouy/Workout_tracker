package com.example.demo.entities;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
@Data
@Document
public class User {
    @Id
private String id;
private  String firstname;
private String lastname;
private double height;
private double weight;
private double BMI;

}
