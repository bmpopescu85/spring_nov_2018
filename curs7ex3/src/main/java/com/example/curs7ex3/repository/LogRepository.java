package com.example.curs7ex3.repository;

import com.example.curs7ex3.documents.Log;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LogRepository extends MongoRepository<Log, String> {
}
