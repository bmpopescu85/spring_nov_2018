package com.endava.springlesson6e1.controllers;

import com.endava.springlesson6e1.entities.Product;
import com.endava.springlesson6e1.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/get/{name}")
    public Product findProductByName(@PathVariable("name") String name) {
        return productService.findProductByName(name);
    }

    @GetMapping("/getall/{value}")
    public List<Product> findProducts(@PathVariable("value") double value) {
        return productService.findProducts(value);
    }
}
