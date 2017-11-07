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
public class MasterMarket extends Market{
    
    private String areaMarketName;
    private ArrayList<SubMarket> subMarketList;

    public MasterMarket() {
        subMarketList = new ArrayList<SubMarket>();
        this.level = "Master";
    }

    public String getAreaMarketName() {
        return areaMarketName;
    }

    public void setAreaMarketName(String areaMarketName) {
        this.areaMarketName = areaMarketName;
    }

    public ArrayList<SubMarket> getSubMarketList() {
        return subMarketList;
    }

    public SubMarket addSubMarket(){
        SubMarket subMarket = new SubMarket();
        subMarketList.add(subMarket);
        return subMarket;
    }

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> productList = new ArrayList<Product>();
        for(SubMarket subMarket : subMarketList){
            for(Product p : subMarket.getProducts()){
                productList.add(p);
            }
        }
        return productList;
    }
}
