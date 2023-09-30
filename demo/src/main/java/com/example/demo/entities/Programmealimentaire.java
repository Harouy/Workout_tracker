package com.example.demo.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;
@Data
@AllArgsConstructor
@Document
public class Programmealimentaire  {
    @Id
    private String id;
    private List<Jour>  jours;


}
