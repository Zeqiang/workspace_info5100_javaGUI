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
public class Family {
    
    private int community_ID;
    private int house_ID;
    private int family_ID;
    private ArrayList<Person> personList;

    public Family() {
        personList = new ArrayList<Person>();
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

    public int getFamily_ID() {
        return family_ID;
    }

    public void setFamily_ID(int family_ID) {
        this.family_ID = family_ID;
    }

    public ArrayList<Person> getPersonList() {
        return personList;
    }

    public Person addPerson(){
        Person person = new Person();
        personList.add(person);
        return person;
    }
}
