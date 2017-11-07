/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.business;

/**
 *
 * @author Neeraj
 */
public class Initialization {

    public static ProductList initializeProductList() {

        ProductList productList = new ProductList();
        Product product = productList.addProduct();
        product.setName("HP");
        product.setPrice(1000);
        product = productList.addProduct();
        product.setName("Dell");
        product.setPrice(1010);
        product = productList.addProduct();
        product.setName("Lenovo");
        product.setPrice(1030);
        return productList;
        
    }

}
