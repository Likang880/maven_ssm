package com.shop.service.impl;

import com.shop.dao.ProductMapper;
import com.shop.domain.Employee;
import com.shop.domain.Product;
import com.shop.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

    @Autowired
    private ProductMapper productMapper;

    @Override
    public List<Product> getProductList() {
        System.out.println("xxxx");
        List<Product> products = this.productMapper.selectByExampleWithBLOBs(null);
        return products;
    }

    @Override
    public Product getProductById(String id) {
        Product product = this.productMapper.selectByPrimaryKey(Integer.parseInt(id));
        return product;
    }

    @Override
    public void updateitem(Product product) {
        this.productMapper.updateByPrimaryKeySelective(product);

    }

    @Override
    public List<Product> querSearchItem(Product product) {
        List<Product> products = this.productMapper.selectByExample(null);
        return products;
    }



}
