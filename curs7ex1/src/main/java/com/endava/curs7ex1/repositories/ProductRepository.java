package com.endava.curs7ex1.repositories;

import com.endava.curs7ex1.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{manufacturer: {_id: ?0}}")
    public List<Product> findProductByManufacturer(String manufacturer);
}
