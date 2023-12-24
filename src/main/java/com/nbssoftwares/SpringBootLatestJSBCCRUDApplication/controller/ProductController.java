package com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.controller;

import com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.entity.Product;
import com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.impl.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductServiceImpl productService;

    @GetMapping("/list")
    List<Product> getAllProductList(){
        return productService.getAllProducts();
    }

    @PostMapping("/add")
    void insertProduct(@RequestBody Product product){
        productService.addProduct(product);
    }

    @PutMapping("/update/{id}")
    void updateProduct(@PathVariable Integer id, @RequestBody Product product){
        productService.updateProduct(id,product);
    }

    @DeleteMapping("/delete/{id}")
    void deleteProduct(@PathVariable Integer id){
        productService.deleteProduct(id);
    }
}
