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
public class SubMarket extends Market{
    
    private String subMarketName;
    private ArrayList<StateMarket> stateMarketList;

    public SubMarket() {
        stateMarketList = new ArrayList<StateMarket>();
        this.level = "Sub";
    }

    public String getSubMarketName() {
        return subMarketName;
    }

    public void setSubMarketName(String subMarketName) {
        this.subMarketName = subMarketName;
    }

    public ArrayList<StateMarket> getStateMarketList() {
        return stateMarketList;
    }

    public StateMarket addStateMarket(){
        StateMarket stateMarket = new StateMarket();
        stateMarketList.add(stateMarket);
        return stateMarket;
    }
    
    public void removeStateMarket(StateMarket stateMarket){
        stateMarketList.remove(stateMarket);
    }

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> productList = new ArrayList<Product>();
        for(StateMarket stateMarket : stateMarketList){
            for(Product p : stateMarket.getProducts()){
                productList.add(p);
            }
        }
        return productList;
    }
}
