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
public class SupplierDirectory {
    
    private ArrayList<Supplier> supplierDirectory;

    public SupplierDirectory() {
        supplierDirectory = new ArrayList<>();
    }

    public ArrayList<Supplier> getSupplierDirectory() {
        return supplierDirectory;
    }
    
    public Supplier addSupplier(){
        Supplier supplier = new Supplier();
        supplierDirectory.add(supplier);
        return supplier;
    }
    
    public void deleteSupplier(Supplier supplier){
        supplierDirectory.remove(supplier);
    }
    
    public Supplier searchSupplier(String keyword){
        for(Supplier supplier : supplierDirectory){
            if(keyword.equals(supplier.getSupplierName())){
                
//                .tolowercase
                
                return supplier;
            }
        }
        return null;
    }
}
