package com.example.springbootelasticsearchexample;

import com.example.springbootelasticsearchexample.entity.Product;
import com.example.springbootelasticsearchexample.service.ProductService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class SpringBootElasticsearchExampleApplicationTests {
    @Autowired
    private ProductService productService;

    @Test
    void contextLoads() {
    }

    @Test
    void testGetAllProducts(){
        Iterable<Product> products = productService.getProducts();
        List<Product> productList = new ArrayList<>();
        products.forEach(productList::add);

        assertTrue(productList.size() == 3);
    }

}
