package com.example.demo.repositories;

import com.example.demo.entities.Historique;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Historiquerepository extends MongoRepository<Historique,String> {
}
