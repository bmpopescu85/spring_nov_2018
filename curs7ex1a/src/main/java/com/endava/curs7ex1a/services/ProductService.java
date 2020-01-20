package com.endava.curs7ex1a.services;

import com.endava.curs7ex1a.model.Product;
import com.endava.curs7ex1a.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public List<Product> findProducts() {
        return productRepository.findAll();
    }

    public List<Product> findProductsByManufacturer(String manufacturerId) {
        return productRepository.findProductByManufacturer(manufacturerId);
    }
}
