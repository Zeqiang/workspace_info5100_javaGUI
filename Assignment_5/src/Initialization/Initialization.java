/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initialization;

import Business.City;
import Business.Community;
import Business.Family;
import Business.House;
import Business.Person;
import Business.VitalSign;

/**
 *
 * @author Eric
 */
public class Initialization {
    
    public static City Initialization_City(){
        
        City city = new City();
        
        for(int i = 0; i < 5; i++){
            
            Community community = city.addCommunity();
            community.setCommunity_ID(i+1);
            
            for(int j = 0; j < 100; j++){
                
                House house = community.addHouse();
                house.setCommunity_ID(i+1);
                house.setHouse_ID(j+1);
                
                Family family = house.addFamily();
                family.setCommunity_ID(i+1);
                family.setHouse_ID(j+1);
                family.setFamily_ID(j+1);
                
                Person person_1 = family.addPerson();
                Person person_2 = family.addPerson();
                Person person_3 = family.addPerson();
                Person person_4 = family.addPerson();
                
                person_1.setCommunity_ID(i+1);
                person_2.setCommunity_ID(i+1);
                person_3.setCommunity_ID(i+1);
                person_4.setCommunity_ID(i+1);
                
                person_1.setHouse_ID(j+1);
                person_1.setFamily_ID(j+1);
                person_2.setHouse_ID(j+1);
                person_2.setFamily_ID(j+1);
                person_3.setHouse_ID(j+1);
                person_3.setFamily_ID(j+1);
                person_4.setHouse_ID(j+1);
                person_4.setFamily_ID(j+1);
                
                person_1.setPerson_ID(1);
                person_2.setPerson_ID(2);
                person_3.setPerson_ID(3);
                person_4.setPerson_ID(4);
                
                person_1.setLabel("GrandParent");
                person_2.setLabel("Parent");
                person_3.setLabel("Parent");
                person_4.setLabel("Individual");
                
                person_1.setPerson_Name(GetRandom.getRandomString_Name());
                person_2.setPerson_Name(GetRandom.getRandomString_Name());
                person_3.setPerson_Name(GetRandom.getRandomString_Name());
                person_4.setPerson_Name(GetRandom.getRandomString_Name());
                
                person_1.setAge(GetRandom.getRandomInt_Age_GrandParent());
                person_2.setAge(GetRandom.getRandomInt_Age_Parent());
                person_3.setAge(GetRandom.getRandomInt_Age_Parent());
                person_4.setAge(GetRandom.getRandoInt_Age_Individual());
                
                person_1.setGender(GetRandom.getRandomString_Gender());
                person_2.setGender("M");
                person_3.setGender("F");
                person_4.setGender(GetRandom.getRandomString_Gender());
                
                for(int k = 0; k < 10; k++){
                    VitalSign vitalSign_1 = Initialization_VitalSign();
                    vitalSign_1.setDate(k+1);
                    person_1.addVitalSign(vitalSign_1);
                    VitalSign vitalSign_2 = Initialization_VitalSign();
                    vitalSign_2.setDate(k+1);
                    person_2.addVitalSign(vitalSign_2);
                    VitalSign vitalSign_3 = Initialization_VitalSign();
                    vitalSign_3.setDate(k+1);
                    person_3.addVitalSign(vitalSign_3);
                    VitalSign vitalSign_4 = Initialization_VitalSign();
                    vitalSign_4.setDate(k+1);
                    person_4.addVitalSign(vitalSign_4);
                }
                
                GetScore getscore = new GetScore();
                
                if(person_1.getGender().equals("M")){
                    getscore.setMaleScore(person_1);
                }
                if(person_1.getGender().equals("F")){
                    getscore.setFemaleScore(person_1);
                }                
                if(person_2.getGender().equals("M")){
                    getscore.setMaleScore(person_2);
                }
                if(person_2.getGender().equals("F")){
                    getscore.setFemaleScore(person_2);
                }
                if(person_3.getGender().equals("M")){
                    getscore.setMaleScore(person_3);
                }
                if(person_3.getGender().equals("F")){
                    getscore.setFemaleScore(person_3);
                }
                if(person_4.getGender().equals("M")){
                    getscore.setMaleScore(person_4);
                }
                if(person_4.getGender().equals("F")){
                    getscore.setFemaleScore(person_4);
                }
                
                int sum_1 = 0;
                for(int z = 0; z  < 10; z++){
                    int point = person_1.getHealthAccount().get(z).getScore();
                    sum_1 = sum_1 + point;
                }
                person_1.setScore(sum_1/10);
                
                int sum_2 = 0;
                for(int z = 0; z  < 10; z++){
                    int point = person_2.getHealthAccount().get(z).getScore();
                    sum_2 = sum_2 + point;
                }
                person_2.setScore(sum_2/10);
                
                int sum_3 = 0;
                for(int z = 0; z  < 10; z++){
                    int point = person_3.getHealthAccount().get(z).getScore();
                    sum_3 = sum_3 + point;
                }
                person_3.setScore(sum_3/10);
                
                int sum_4 = 0;
                for(int z = 0; z  < 10; z++){
                    int point = person_4.getHealthAccount().get(z).getScore();
                    sum_4 = sum_4 + point;
                }
                person_4.setScore(sum_4/10);
            }            
        }
        return city;
    }
    
    
    public static VitalSign Initialization_VitalSign(){
        
        VitalSign vitalSign = new VitalSign();
        
        vitalSign.setTotalCholesterol(GetRandom.getRandomDouble_TotalCholesterol());
        vitalSign.setHdlCholesterol(GetRandom.getRandomDouble_HDLCholesterol());
        vitalSign.setLdlCholesterol(GetRandom.getRandomDouble_LDLCholesterol());
        vitalSign.setIfSmoke(GetRandom.getRandomBoolean_IfSmoke());
        vitalSign.setIfDiabetes(GetRandom.getRandomBoolean_IfDiabtes());
        vitalSign.setSystolic(GetRandom.getRandomInt_Systolic());
        vitalSign.setDiastolc(GetRandom.getRandomInt_Diastolc());
        vitalSign.setExerciseHour(GetRandom.getRandomInt_ExerciseHour());
        
        return vitalSign;
    }
}
