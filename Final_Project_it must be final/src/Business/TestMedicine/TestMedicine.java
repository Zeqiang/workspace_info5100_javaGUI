/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestMedicine;

import Business.Medicine.Medicine;

/**
 *
 * @author Eric
 */
public class TestMedicine extends Medicine{
    
    private String status;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    public String toString(){
        return this.getMedicineName();
    }
} 
