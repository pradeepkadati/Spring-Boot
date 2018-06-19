package com.example.mongodb.dal;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.mongodb.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
}
