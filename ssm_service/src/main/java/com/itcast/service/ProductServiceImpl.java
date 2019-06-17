package com.itcast.service;

import com.itcast.dao.ProductMapper;
import com.itcast.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductMapper productMapper;
    @Override
    public List<Product> findAll() {
        return productMapper.findAll();
    }
}
