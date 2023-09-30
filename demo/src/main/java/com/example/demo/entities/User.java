package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@Document
@Builder
public class User {
    @Id
private String id;
private  String firstname;
private String lastname;
private double height;
private double weight;
private double BMI;
private List<Historique> historiques;
private Programmetrain programmetrain;
private Programmealimentaire programmealimentaire;
private  Goal goal;




}
