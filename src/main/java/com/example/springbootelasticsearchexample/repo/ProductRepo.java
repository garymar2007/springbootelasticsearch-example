package com.example.springbootelasticsearchexample.repo;

import com.example.springbootelasticsearchexample.entity.Product;
import org.springframework.data.elasticsearch.annotations.Query;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface ProductRepo extends ElasticsearchRepository<Product,Integer> {

    List<Product> findAllByName(String name);

    @Query("{\"match\":{\"name\":\"?0\"}}")
    List<Product> findAllByNameUsingAnnotations(String name);

    @Query("{\"wildcard\":{\"name\":\"?0\"}}")
    List<Product> findAllProductsContainingName(String nameAlike);
}
