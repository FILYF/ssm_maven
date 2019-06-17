package com.itcast.controller;

import com.itcast.pojo.Product;
import com.itcast.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;

import java.util.List;

public class ProductController {
    @Autowired
    private ProductService productService;
    public String findAll(Model model){
        List<Product> products = productService.findAll();
        for (Product product:products) {
            System.out.println(product.getProductName());
        }
        model.addAttribute("products",products);
        return "product";
    }
}
