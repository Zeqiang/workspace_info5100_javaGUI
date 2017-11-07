/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bussiness;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class ProductCatalog {
    
    private ArrayList<Product> productCatalog;

    public ProductCatalog() {
        productCatalog = new ArrayList<>();
    }

    public ArrayList<Product> getProductCatalog() {
        return productCatalog;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productCatalog.add(product);
        return product;
    }
    
    public void deleteProduct(Product product){
        productCatalog.remove(product);
    }
    
    public Product searchProduct(int id){
        for(Product product : productCatalog){
            if(product.getModelNumber() == id){
                return product;
            }
        }
        return null;
    }
}
