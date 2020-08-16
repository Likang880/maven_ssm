package com.shop.testdemo;

import com.shop.dao.ProductMapper;
import com.shop.domain.Employee;
import com.shop.domain.Product;
import com.shop.service.EmployeeService;
import com.shop.service.ProductService;
import com.shop.service.impl.EmployeeServiceImpl;
import com.shop.service.impl.ProductServiceImpl;
import org.testng.annotations.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

public class DomeTest {
  ProductService productService =new ProductServiceImpl();
  @Test
    public void ss(){

        List<Product> productList = productService.getProductList();
        for (Product product : productList) {
            System.out.println(product);
        }


    }
}
