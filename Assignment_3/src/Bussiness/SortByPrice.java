/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.Comparator;

/**
 *
 * @author Eric
 */
public class SortByPrice implements Comparator{
    
    @Override
        public int compare(Object o1, Object o2) {
            Product product1 = (Product) o1;
            Product product2 = (Product) o2;
            if(product1.getFloorPrice() > product2.getFloorPrice()){
                return 1;
            }else if(product1.getFloorPrice() == product2.getFloorPrice()){
                return 0;
            }
            return -1;
        }
}
