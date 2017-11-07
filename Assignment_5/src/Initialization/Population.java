/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initialization;

import Business.City;
import Business.Community;
import Business.Family;
import Business.Person;

/**
 *
 * @author Eric
 */
public class Population {
    
    public int CalculateCity(City city){
        int population = 0;
        
        for(int a = 0; a < 5; a++){
            for(int b = 0; b < 100; b++){
                for(int c = 0; c < 4; c++){
                    Person p = city.getCommunityList().get(a).getHouseList().get(b).getFamilyList().get(0).getPersonList().get(c);
                    if(p.getScore() > 20){
                        population++;
                    }
                }
            }
        }
        return population;
    }
    
    
    public int CalculateCommunity(Community community) {
        int population = 0;
        for (int a = 0; a < 100; a++) {
            for (int b = 0; b < 4; b++) {
                Person p = community.getHouseList().get(a).getFamilyList().get(0).getPersonList().get(b);
                if (p.getScore() > 20) {
                    population++;
                }
            }
        }
        return population;
    }
    
    
    public int CalculateFamily(Family family) {
        int population = 0;
        for (int a = 0; a < 4; a++) {
            Person p = family.getPersonList().get(a);
            if (p.getScore() > 20) {
                population++;
            }
        }
        return population;
    }
}
