package com.example.LearnSpring.product.services;

import com.example.LearnSpring.product.ProductRepository;
import com.example.LearnSpring.product.Query;
import com.example.LearnSpring.product.model.Product;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GetProductService implements Query<Void, List<Product>> {

    private final ProductRepository productRepository;

    public GetProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public ResponseEntity<List <Product>> execute(Void input) {
        List<Product> products = productRepository.findAll();
        return ResponseEntity.status(HttpStatus.OK).body(products);
    }
}