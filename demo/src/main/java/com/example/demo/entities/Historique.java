package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@Document
public class Historique {
    @Id
    private String id;
    private double calories;
    private double weight;
    private LocalDate date;
}
