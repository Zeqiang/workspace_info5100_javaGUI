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
public class StateMarket extends Market{
    
    private String stateMarketName;
    private ArrayList<Product> productList;
    private ArrayList<Channel> channelList;

    public StateMarket() {
        this.level = "State";
        productList = new ArrayList<Product>();
        channelList = new ArrayList<Channel>();
    }

    public String getStateMarketName() {
        return stateMarketName;
    }

    public void setStateMarketName(String stateMarketName) {
        this.stateMarketName = stateMarketName;
    }

    public ArrayList<Product> getProductList() {
        return productList;
    }

    public ArrayList<Channel> getChannelList() {
        return channelList;
    }
    
    public Channel addChannel(){
        Channel cha = new Channel();
        channelList.add(cha);
        return cha;
    }
    
    public void removeChannel(Channel cha){
        channelList.remove(cha);
    }
    
    public Product addProduct(){
        Product p = new Product();
        productList.add(p);
        return p;
    }
    
    public void removeProduct(Product p){
        productList.remove(p);
    }

    @Override
    public ArrayList<Product> getProducts() {
        return productList;
    }
}
