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
public class Community {
    
    private int community_ID;
    private ArrayList<House> houseList;

    public Community() {
        houseList = new ArrayList<House>();
    }

    public int getCommunity_ID() {
        return community_ID;
    }

    public void setCommunity_ID(int community_ID) {
        this.community_ID = community_ID;
    }

    public ArrayList<House> getHouseList() {
        return houseList;
    }
    
    public House addHouse(){
        House house = new House();
        houseList.add(house);
        return house;
    }
}
