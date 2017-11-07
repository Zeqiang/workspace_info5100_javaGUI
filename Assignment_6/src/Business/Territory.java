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
public class Territory extends Market{
    
    private String territoryName;
    private ArrayList<MasterMarket> masterMarketList;

    public Territory() {
        masterMarketList = new ArrayList<MasterMarket>();
        this.level = "Territory";
    }

    public String getTerritoryName() {
        return territoryName;
    }

    public void setTerritoryName(String territoryName) {
        this.territoryName = territoryName;
    }

    public ArrayList<MasterMarket> getMasterMarketList() {
        return masterMarketList;
    }
    
    public MasterMarket addMasterMarket(){
        MasterMarket masterMarket = new MasterMarket();
        masterMarketList.add(masterMarket);
        return masterMarket;
    }

    @Override
    public ArrayList<Product> getProducts() {
        ArrayList<Product> productList = new ArrayList<Product>();
        for(MasterMarket masterMarket : masterMarketList){
            for(Product p : masterMarket.getProducts()){
                productList.add(p);
            }
        }
        return productList;
    }
}
