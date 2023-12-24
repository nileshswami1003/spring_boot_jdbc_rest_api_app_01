package com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.service;

import com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.entity.Product;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void addProduct(Product product);

    void updateProduct(Integer id, Product product);

    void deleteProduct(Integer id);
}
