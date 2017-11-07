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
public class Person {
    
    private int community_ID;
    private int house_ID;
    private int family_ID;
    private int person_ID;
    private String person_Name;
    private String gender;
    private int age;
    private String label;
    
    private int score;
    
    private ArrayList<VitalSign> healthAccount;

    public Person() {
        healthAccount = new ArrayList<VitalSign>();
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

    public int getPerson_ID() {
        return person_ID;
    }

    public void setPerson_ID(int person_ID) {
        this.person_ID = person_ID;
    }

    public String getPerson_Name() {
        return person_Name;
    }

    public void setPerson_Name(String person_Name) {
        this.person_Name = person_Name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public ArrayList<VitalSign> getHealthAccount() {
        return healthAccount;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
    
    public VitalSign addVitalSign(VitalSign vitalSign){
        healthAccount.add(vitalSign);
        return vitalSign;
    }
}
