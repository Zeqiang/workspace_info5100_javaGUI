/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;
import java.util.Comparator;

/**
 *
 * @author Eric
 */
public class ProductDirectory {
    
    private ArrayList<Product> productList;
    private ArrayList<Product> virtualList;

    public ProductDirectory() {
        this.productList = new ArrayList<Product>();
        this.virtualList = new ArrayList<Product>();
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public void setProductList(ArrayList<Product> productList) {
        this.productList = productList;
    }

    public ArrayList<Product> getVirtualList() {
        return virtualList;
    }

    public void setVirtualList(ArrayList<Product> virtualList) {
        this.virtualList = virtualList;
    }
    
    public Product addProduct(){
        Product product = new Product();
        productList.add(product);
        return product;
    }
    
    public void deleteProduct(Product product){
        productList.remove(product);
    }
    
    public ArrayList<Product> computerList(){
        ArrayList<Product> computerList = new ArrayList<>();
        for(Product product : productList){
            if(product.getType().equals("Computer")){
                computerList.add(product);
            }
        }
        return computerList;
    }
    
    public ArrayList<Product> printerList(){
        ArrayList<Product> printerList = new ArrayList<>();
        for(Product product : productList){
            if(product.getType().equals("Printer")){
                printerList.add(product);
            }
        }
        return printerList;
    }
    
    public ArrayList<Product> hardwareList(){
        ArrayList<Product> hardwareList = new ArrayList<>();
        for(Product product : productList){
            if(product.getType().equals("Hardware parts")){
                hardwareList.add(product);
            }
        }
        return hardwareList;
    }
    
    public ArrayList<Product> softwareList(){
        ArrayList<Product> softwareList = new ArrayList<>();
        for(Product product : productList){
            if(product.getType().equals("Software products")){
                softwareList.add(product);
            }
        }
        return softwareList;
    }
    
    public ArrayList<Product> searchByName(String productName){
        ArrayList<Product> result = new ArrayList<>();
        for(Product product : productList){
            if(product.getName().contains(productName)){
                result.add(product);
            }
        }
        return result;
    }
    
    public ArrayList<Product> searchByVendor(String Vendor){
        ArrayList<Product> result = new ArrayList<>();
        for(Product product : productList){
            if(product.getVendor().contains(Vendor)){
                result.add(product);
            }
        }
        return result;
    }
    
    public ArrayList<Product> searchByDescription(String Description){
        ArrayList<Product> result = new ArrayList<>();
        for(Product product : productList){
            if(product.getDescription().contains(Description)){
                result.add(product);
            }
        }
        return result;
    }
    
    public ArrayList<Product> searchByAll(String keyword){
        ArrayList<Product> result = new ArrayList<>();
        for(Product product : productList){
            if(product.getName().contains(keyword) || product.getVendor().contains(keyword) || product.getDescription().contains(keyword)){
                result.add(product);
            }
        }
        return result;
    }
}
