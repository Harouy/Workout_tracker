package com.example.demo.repositories;

import com.example.demo.entities.Programmetrain;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface Programmetrainrepository extends MongoRepository<Programmetrain,String> {
}
