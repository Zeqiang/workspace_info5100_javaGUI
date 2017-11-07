/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Order;

import Business.Medicine.Medicine;
import Business.WorkQueue.MedicineTrade;

/**
 *
 * @author Eric
 */
public class OrderItem {
    
    private MedicineTrade medicine;
    private float price;
    private int quantity;
    private float amount;

    public OrderItem() {
        medicine = new MedicineTrade();
    }

    public MedicineTrade getMedicine() {
        return medicine;
    }

    public void setMedicine(MedicineTrade medicine) {
        this.medicine = medicine;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float amount) {
        this.amount = amount;
    }
    
    @Override
    public String toString(){
        return medicine.getMedicine().getMedicineName();
    }
}
