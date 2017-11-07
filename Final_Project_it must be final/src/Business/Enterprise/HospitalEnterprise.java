/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Order.Order;
import Business.Role.Role;
import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class HospitalEnterprise extends Enterprise{
    
    private ArrayList<Order> orderList;
    
    public HospitalEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.Hospital);
        orderList = new ArrayList<Order>();
    }

    public ArrayList<Order> getOrderList() {
        return orderList;
    }
    
    public Order createOrder(Order order){
        orderList.add(order);
        return order;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
