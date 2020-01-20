package com.endava.curs7ex1.repositories;

import com.endava.curs7ex1.model.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {
}
