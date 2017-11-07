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
public class Customer extends Person{
    
    private static int count = 1;
    private int customerID;
    private int age;
    private String preference;
    private ArrayList<StateMarket> stateMarketList;
    private ArrayList<Order> OrderList;

    public Customer() {
        customerID = count++;
        stateMarketList = new ArrayList<StateMarket>();
        OrderList = new ArrayList<Order>();
    }

    public int getCustomerID() {
        return customerID;
    }

    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPreference() {
        return preference;
    }

    public void setPreference(String preference) {
        this.preference = preference;
    }

    public ArrayList<StateMarket> getStateMarketList() {
        return stateMarketList;
    }

    public ArrayList<Order> getOrderList() {
        return OrderList;
    }
    
    public StateMarket addStateMarket(){
        StateMarket stateMarket = new StateMarket();
        stateMarketList.add(stateMarket);
        return stateMarket;
    }
    
    public Order addOrder(){
        Order order = new Order();
        OrderList.add(order);
        return order;
    }
}
