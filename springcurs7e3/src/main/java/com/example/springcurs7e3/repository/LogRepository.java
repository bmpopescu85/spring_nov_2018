package com.example.springcurs7e3.repository;

import com.example.springcurs7e3.documents.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}
