/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.neu.userinterface;

import com.neu.business.Initialization;
import com.neu.business.Product;

/**
 *
 * @author User
 */
public class UserInterafce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (Product p : Initialization.initializeProductList().getProductList()) {
            System.out.println("Name-->" + p.getName() + "\nPrice-->" + p.getPrice());
        }
    }

}
