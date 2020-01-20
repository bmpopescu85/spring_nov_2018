package com.endava.curs7ex1a.controllers;

import com.endava.curs7ex1a.model.Product;
import com.endava.curs7ex1a.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/add/product")
    public void addProduct(@RequestBody Product product) {
        productService.addProduct(product);
    }

    @GetMapping("/get/products")
    public List<Product> findProducts() {
        return productService.findProducts();
    }

    @GetMapping("/get/products/{manufacturer}")
    public List<Product> findProductsByManufacturer(@PathVariable String manufacturer) {
        return productService.findProductsByManufacturer(manufacturer);
    }
}
