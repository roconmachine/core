package com.roconmachine.core.controllers;

import com.roconmachine.openapi.api.ProductApi;
import com.roconmachine.openapi.model.Product;
import org.springframework.http.ResponseEntity;

import java.util.List;

public class ProductController implements ProductApi {

    @Override
    public ResponseEntity<Product> getProductsById(Long productId) {
        return ProductApi.super.getProductsById(productId);
    }

    @Override
    public ResponseEntity<Product> getProductsByName(String productName) {
        return ProductApi.super.getProductsByName(productName);
    }
}
