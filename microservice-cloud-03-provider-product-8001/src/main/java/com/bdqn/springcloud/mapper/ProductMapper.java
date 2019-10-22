package com.bdqn.springcloud.mapper;

import com.bdqn.springcloud.entity.Product;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


public interface ProductMapper {
    Product findById(Long pid);

    List<Product> findAll();

    boolean addProduct(Product product);
}
