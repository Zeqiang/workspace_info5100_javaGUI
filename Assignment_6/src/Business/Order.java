/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class Order {
    
    private static int count = 1;
    private int orderID;
    private ArrayList<Product> productList;

    public Order() {
        productList = new ArrayList<Product>();
        orderID = count++;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }
    
    public Product addProduct(){
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
    }
}
