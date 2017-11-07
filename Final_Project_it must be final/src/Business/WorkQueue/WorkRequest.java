/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Enterprise.Enterprise;
import Business.Medicine.Medicine;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Eric
 */
public abstract class WorkRequest {
    
    private Medicine medicine;
    private String status;
    private UserAccount sender;
    
    public static String STATUS_1 = "To be Assisted";
    public static String STATUS_2 = "To be Sponsored";
    public static String STATUS_3 = "Move to Volunteer Manager";
    public static String STATUS_4 = "Getting Volunteers";
    public static String STATUS_5 = "Testing";
    public static String STATUS_6 = "Test Compeleted";
    public static String STATUS_7 = "To be Sale";
    
    public WorkRequest() {
        medicine = new Medicine();
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public UserAccount getSender() {
        return sender;
    }

    public void setSender(UserAccount sender) {
        this.sender = sender;
    }
    
    @Override
    public String toString(){
        return this.getMedicine().getMedicineName();
    }
}
