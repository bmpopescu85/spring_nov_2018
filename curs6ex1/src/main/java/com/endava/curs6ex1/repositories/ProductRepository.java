package com.endava.curs6ex1.repositories;

import com.endava.curs6ex1.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {

    @Query("SELECT p FROM Product p WHERE p.name LIKE :name") // JPQL  Select, Update, Delete (batch update / delete)
    public Optional<Product> findProductByName(@Param("name") String nameToSearch);

    @Query("SELECT p FROM Product p WHERE p.price > :value")
    public List<Product> findProductsWithPriceGreaterThenValue(@Param("value") double value);

    @Query("UPDATE Product p SET p.price = 10")
    @Modifying
    public void updateAllProducts();

    @Query("UPDATE Product p SET p.price = 10 WHERE p.name = :name")
    @Modifying
    public void updateProduct(String name);
}
