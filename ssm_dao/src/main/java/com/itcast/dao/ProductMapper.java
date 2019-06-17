package com.itcast.dao;


import com.itcast.pojo.Product;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;
public interface ProductMapper {
    @Select("select * from product")
    List<Product> findAll();
}
