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
public class City {
    
    private ArrayList<Community> communityList;

    public City() {
        communityList = new ArrayList<>();
    }

    public ArrayList<Community> getCommunityList() {
        return communityList;
    }
    
    public Community addCommunity(){
        Community community = new Community();
        communityList.add(community);
        return community;
    }
}
