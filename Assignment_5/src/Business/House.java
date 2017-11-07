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
public class House {
    
    private int community_ID;
    private int house_ID;
    private ArrayList<Family> familyList;

    public House() {
        familyList = new ArrayList<Family>();
    }

    public int getCommunity_ID() {
        return community_ID;
    }

    public void setCommunity_ID(int community_ID) {
        this.community_ID = community_ID;
    }

    public int getHouse_ID() {
        return house_ID;
    }

    public void setHouse_ID(int house_ID) {
        this.house_ID = house_ID;
    }

    public ArrayList<Family> getFamilyList() {
        return familyList;
    }
    
    public Family addFamily(){
        Family family = new Family();
        familyList.add(family);
        return family;
    }
}
