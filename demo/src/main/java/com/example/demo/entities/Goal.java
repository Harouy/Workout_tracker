package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@Document
public class Goal {
@Id
    private String id;
private double actualweight;
private double goalweight;
private double period;

}
