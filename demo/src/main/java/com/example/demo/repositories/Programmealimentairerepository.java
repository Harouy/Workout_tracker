package com.example.demo.repositories;

import com.example.demo.entities.Programmealimentaire;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Programmealimentairerepository extends MongoRepository<Programmealimentaire,String> {
}
