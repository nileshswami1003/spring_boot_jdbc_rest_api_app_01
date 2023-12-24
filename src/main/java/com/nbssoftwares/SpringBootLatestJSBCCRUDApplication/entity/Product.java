package com.nbssoftwares.SpringBootLatestJSBCCRUDApplication.entity;

import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name = "products")
public class Product {
    private Integer id;
    private String name;
    private Double price;
    private Integer quantity;

}
