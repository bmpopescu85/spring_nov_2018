package com.endava.curs6ex1.services;

import com.endava.curs6ex1.entities.Product;
import com.endava.curs6ex1.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void addProduct(Product product) {
        productRepository.save(product);
    }

    public Product findProductByName(String name) {
        return productRepository.findProductByName(name).orElse(null);
    }

    public List<Product> findProducts(double value) {
        return productRepository.findProductsWithPriceGreaterThenValue(value);
    }
}
