package com.gaurang.simpleWebApp.service;

import com.gaurang.simpleWebApp.model.Product;
import com.gaurang.simpleWebApp.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepo repo;

//    List<Product> products = new ArrayList<>(Arrays.asList(new Product(101,"Iphone",50000),
//            new Product(102,"Canon",70000)));

    public List<Product> getProducts()
    {
//        return products;
        return repo.findAll();
    }

    public Product getProductById(int prodId)
    {
//        return products.stream()
//                .filter(p -> p.getProdId()==prodId)
//                .findFirst().get();
        return repo.findById(prodId).orElse(new Product());
    }

    public void addProduct(Product prod)
    {
//        products.add(prod);
        repo.save(prod);
    }

    public void updateProduct(Product prod) {
//        int index = 0;
//        for (int i=0;i< products.size();i++){
//            if(products.get(i).getProdId()==prod.getProdId())
//                index = i;
//        }
//        products.set(index,prod);
        repo.save(prod);
    }


    public void deleteProductById(int prodId) {
//                products.remove(products.stream()
//                .filter(p -> p.getProdId()==prodId)
//                .findFirst().get());
        repo.deleteById(prodId);
    }
}
