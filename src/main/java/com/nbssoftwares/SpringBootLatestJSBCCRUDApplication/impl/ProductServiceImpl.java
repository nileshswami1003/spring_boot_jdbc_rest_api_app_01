package com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.impl;

import com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.entity.Product;
import com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.simple.JdbcClient;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    @Autowired
    private JdbcClient jdbcClient;

    @Override
    public List<Product> getAllProducts() {
        return jdbcClient.sql("SELECT * FROM products").query(Product.class).list();
    }

    @Override
    public void addProduct(Product product) {
        jdbcClient.sql("INSERT INTO products (name,price,quantity) VALUES(?,?,?)")
                .params(List.of(product.getName(),product.getPrice(),product.getQuantity())).update();
    }

    @Override
    public void updateProduct(Integer id, Product product) {
        jdbcClient.sql("UPDATE products SET name=?, price=?, quantity=? WHERE id=?")
                .params(List.of(product.getName(),product.getPrice(),product.getQuantity(),id)).update();
    }

    @Override
    public void deleteProduct(Integer id) {
        jdbcClient.sql("DELETE FROM products WHERE id=?").param(id).update();
    }
}
