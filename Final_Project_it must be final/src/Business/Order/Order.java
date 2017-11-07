/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Medicine.Medicine;
import Business.WorkQueue.MedicineTrade;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Eric
 */
public class Order {
    
    private int order_ID;
    private static int count = 1;
    private ArrayList<OrderItem> orderItemList;
    private String orderDate;
    private float totalAmount;
    
    public Order() {
        order_ID = count;
        count++;
        orderItemList = new ArrayList<OrderItem>();
    }

    public int getOrder_ID() {
        return order_ID;
    }

    public void setOrder_ID(int order_ID) {
        this.order_ID = order_ID;
    }

    public float getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public ArrayList<OrderItem> getOrderItemList() {
        return orderItemList;
    }
    
    public OrderItem addInOrder(OrderItem orderItem){
        orderItemList.add(orderItem);
        return orderItem;
    }
    
    public OrderItem addMoreInOrder(MedicineTrade medicine, int quantity ,float salePrice){
        OrderItem oi = new OrderItem();
        oi.setMedicine(medicine);
        oi.setQuantity(quantity);
        oi.setPrice(salePrice);
        oi.setAmount(salePrice * quantity);
        orderItemList.add(oi);
        return oi;
    }
    
    public void removeOrderItem(OrderItem orderItem){
        orderItemList.remove(orderItem);
    }
    
    @Override
    public String toString(){
        return String.valueOf(order_ID);
    }
}
