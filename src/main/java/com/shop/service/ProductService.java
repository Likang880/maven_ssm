package com.shop.service;

import com.shop.domain.Employee;
import com.shop.domain.Product;

import java.util.List;

public interface ProductService {
    public List<Product> getProductList();

    public Product getProductById(String id);

    public void updateitem(Product product);

    public List<Product> querSearchItem(Product product);


}