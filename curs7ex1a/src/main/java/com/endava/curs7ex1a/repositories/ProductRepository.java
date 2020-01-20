package com.endava.curs7ex1a.repositories;

import com.endava.curs7ex1a.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface ProductRepository extends MongoRepository<Product, String> {

    @Query("{manufacturer: {id: ?0}}")
    public List<Product> findProductByManufacturer(String manufacturer);
}
