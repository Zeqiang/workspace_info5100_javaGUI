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
    
    private ArrayList<OrderItem> orderItemList;
    private int orderNumber;
    
    private static int count=0;

    public Order() {
        count++;
        orderNumber=count;
        
        orderItemList = new ArrayList<OrderItem>();
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }

    public void setOrderItemList(ArrayList<OrderItem> orderItemList) {
        this.orderItemList = orderItemList;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(int orderNumber) {
        this.orderNumber = orderNumber;
    }
    
     public OrderItem addOrderItem(Product product,int quantity,double price){
         OrderItem OI = new OrderItem();
         OI.setProduct(product);
         OI.setQuantity(quantity);
         OI.setSalePrice(price);
         orderItemList.add(OI);
         
         return OI;
     }
     
     public void removeOrderItem(OrderItem OI){
         orderItemList.remove(OI);
     }
}
