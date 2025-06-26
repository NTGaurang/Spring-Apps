package com.gaurang.simpleWebApp.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
public class Product {


    @Id
    private Integer prodId;
    private String prodName;
    private Integer price;

    public Integer getProdId() {
        return prodId;
    }

    public Product() {
        // default constructor
    }

}
