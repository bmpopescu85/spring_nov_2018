package com.endava.curs7ex1.services;

import com.endava.curs7ex1.model.Product;
import com.endava.curs7ex1.repositories.ManufacturerRepository;
import com.endava.curs7ex1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ManufacturerRepository manufacturerRepository;

    public void addProduct(Product product) {
        manufacturerRepository.save(product.getManufacturer());
        productRepository.save(product);
    }

    public List<Product> findProducts() {
        return productRepository.findAll();
    }

    public List<Product> findProductsByManufacturer(String manufacturerId) {
        return productRepository.findProductByManufacturer(manufacturerId);
    }
}
