package com.example.demo.repositories;

import com.example.demo.entities.Goal;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GoalRepository extends MongoRepository<Goal,String> {

}
