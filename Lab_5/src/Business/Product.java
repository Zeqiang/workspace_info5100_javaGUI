/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Eric
 */
public class Product {
    
    private int price;
    private String productName;
    private int modelNumber;
    private int avail;
    
    private static int count = 0;
    
    public Product(){
        count++;
        modelNumber = count;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getModelNumber() {
        return modelNumber;
    }

    public void setModelNumber(int modelNumber) {
        this.modelNumber = modelNumber;
    }

    public int getAvail() {
        return avail;
    }

    public void setAvail(int avail) {
        this.avail = avail;
    }
    
    @Override
    public String toString(){
        return productName;
    }
    
//    @Override
//    public String toString(){
//        return String.valueOf(modelNumber);
//    }
}
