package com.endava.springcurs7e1.repositories;

import com.endava.springcurs7e1.model.Manufacturer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ManufacturerRepository extends MongoRepository<Manufacturer, String> {
}
