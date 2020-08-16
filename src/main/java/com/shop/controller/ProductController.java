package com.shop.controller;

import com.shop.domain.Employee;
import com.shop.domain.Product;
import com.shop.exception.MyException;
import com.shop.service.EmployeeService;
import com.shop.service.ProductService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Controller
public class ProductController {
    @Autowired
    private ProductService productService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping(value = "/product")
    public ModelAndView modelAndView() throws MyException {

        ModelAndView modelAndView = new ModelAndView();
        List<Product> productList = this.productService.getProductList();
        for (Product product : productList) {
            System.out.println(product);
        }
        modelAndView.addObject("productList",productList);
        modelAndView.setViewName("productList");
        return modelAndView;

    }
    @RequestMapping(value = "/itemEdit.action")
    public ModelAndView getProductById(HttpServletRequest request){
        ModelAndView modelAndView = new ModelAndView();
        String id = request.getParameter("id");
        Product product = this.productService.getProductById(id);
        modelAndView.addObject("item",product);
        modelAndView.setViewName("productItem");
        return modelAndView;
    }

    /*@RequestMapping(value = "/updateitem.action")
    public ModelAndView updateitem(Product product){
        ModelAndView modelAndView = new ModelAndView();


        this.productService.updateitem(product);
        modelAndView.setViewName("success");
        return modelAndView;
    }*/

    @RequestMapping(value = "/querySearchItem.action")
    public ModelAndView querySearchItem(){
        Product product = new Product();

        ModelAndView modelAndView = new ModelAndView();
        this.productService.querSearchItem(product);
        return null;
    }

   @RequestMapping(value = "/updateitem.action")
    public ModelAndView updateitem(Product product, MultipartFile pictureFile) throws IOException {

        ModelAndView modelAndView = new ModelAndView();

        String originalFilename = pictureFile.getOriginalFilename();

        String s = UUID.randomUUID().toString()+ originalFilename.substring(originalFilename.lastIndexOf("."));
        product.setPic(s);
        this.productService.updateitem(product);
        pictureFile.transferTo(new File("D:\\image\\",s));

        modelAndView.setViewName("success");
        return modelAndView;
    }

    @RequestMapping("/good")
    public ModelAndView goodsList(){
        ModelAndView modelAndView = new ModelAndView();
        List<Employee> employees = this.employeeService.slectEmployeeList();

        modelAndView.addObject("employees",employees);
        modelAndView.setViewName("goods");
        return modelAndView;
    }
}
