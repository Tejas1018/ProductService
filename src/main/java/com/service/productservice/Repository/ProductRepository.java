package com.service.productservice.Repository;

import com.service.productservice.Models.Product;
import com.service.productservice.projections.findProductWithTitleAndPrice;
import org.antlr.v4.runtime.misc.NotNull;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

    Optional<Product> findById(long id);

    Optional<Product> findByName(String name);

    // To find all products
    List<Product> findAll();
    //CUSTOM QUERY

    @Query(value = "SELECT p.name,p.price  FROM products p WHERE p.name = :title AND p.price = :price",nativeQuery = true)
    List<findProductWithTitleAndPrice> getProductWithTitleAndPrice(String title,Double price);

}
