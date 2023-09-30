package com.example.demo.repositories;

import com.example.demo.entities.Jour;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Jourrepository extends MongoRepository<Jour,String> {
}
