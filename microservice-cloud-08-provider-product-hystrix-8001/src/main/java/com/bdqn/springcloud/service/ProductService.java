package com.bdqn.springcloud.service;

import com.bdqn.springcloud.entity.Product;

import java.util.List;

public interface ProductService {
    boolean add(Product product);

    Product get(Long id);

    List<Product> list();
}
