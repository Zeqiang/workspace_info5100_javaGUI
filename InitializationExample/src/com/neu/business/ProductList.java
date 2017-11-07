/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Neeraj
 */
public class ProductList {

    List<Product> productList;

    public ProductList() {
        productList = new ArrayList<>();
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    public Product addProduct() {
        Product product = new Product();
        productList.add(product);
        return product;
    }
}
