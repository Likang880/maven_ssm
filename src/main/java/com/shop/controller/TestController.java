package com.shop.controller;

import com.shop.domain.Product;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@Controller
public class TestController {


    @RequestMapping(value = "/sendjson")
    @ResponseBody
    public Product sendjson(@RequestBody Product product){

        System.out.println("product:"+product);
        return product;
    }

    @RequestMapping(value = "/tologin")
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("login");

        return modelAndView;
    }

    @RequestMapping(value = "/login")
    public String toLogin(String username, String password, HttpSession session){

        if ("admin".equals(username)&&"123".equals(password)){
            session.setAttribute("user",username);
            return "redirect:/product";
        }
        return "login";
    }
}
