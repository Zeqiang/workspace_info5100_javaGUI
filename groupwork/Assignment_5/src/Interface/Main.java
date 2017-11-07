/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import Business.City;
import Business.Community;
import Business.Family;
import Business.House;
import Business.Person;
import Business.VitalSign;
import Initialization.GetRandom;
import Initialization.Initialization;
import Initialization.Population;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author Eric
 */
public class Main {
    
    public static void main(String[] args) {
        
        City city = Initialization.Initialization_City();
        Population population = new Population();
        
        System.out.println("**************************************** Welcome to the Framingham Heart Study ****************************************");
        System.out.println("************************************** Please enter the choice below for Reports ****************************************");
        
        System.out.println("1. City Level Reprots");
        System.out.println("2. Community Level Reprots");
        System.out.println("3. Family Level Reprots");
        System.out.println("4. Person Level Reprots");
        
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        
        System.out.println("************************************************ Enter a choice ************************************************");
        int choice = reader.nextInt(); // Scans the next token of the input as an int.
        System.out.println("****************************************************************************************************************");

        
        switch (choice){
            case 1:
                int p_city = population.CalculateCity(city);
                System.out.println("City Name :  Framingham");
                System.out.println("Total Population :  2000");
                System.out.println("Population(Risk Score>20) :  " + p_city);
                System.out.println("****************************************************************************************************************");
            break;
            
            case 2:
                for(int i = 0; i < 5; i++){
                    int p_com = population.CalculateCommunity(city.getCommunityList().get(i));
                    System.out.println("Community ID :  " + (i+1));
                    System.out.println("Total Population :  400");
                    System.out.println("Population(Risk Score>20) :  " + p_com);
                    System.out.println("****************************************************************************************************************");
                }                
            break;
            
            case 3:
                for(int i = 0; i < 5; i++){
                    System.out.println("Community ID: " + (i+1));
                }
                System.out.println("************************************************ Enter a choice ************************************************");
                // print the list of community
                
                
                Scanner com = new Scanner(System.in);
                int com_id = com.nextInt() - 1;
                System.out.println("****************************************************************************************************************");
                // get the choice from input
                
                for(int k = 0; k < 100; k++){
                    int p_family = population.CalculateFamily(city.getCommunityList().get(com_id).getHouseList().get(k).getFamilyList().get(0));
                    System.out.println("Community ID :  " + (com_id+1));
                    System.out.println("House ID :  " + (k+1));
                    System.out.println("Family ID :  " + (k+1));
                    System.out.println("Family members :  4");
                    System.out.println("Population(Risk Score>20) :  " + p_family);
                    System.out.println("****************************************************************************************************************");
                }
            break;
            
            case 4:
                for(int i=0; i<5; i++) {
                    System.out.println("Community ID: " + (i+1));
                }
                System.out.println("************************************************ Enter a choice ************************************************");
                // print the list of community
                
                Scanner community = new Scanner(System.in);
                int community_id = community.nextInt() - 1;
                System.out.println("****************************************************************************************************************");
                // get the choice from input
                
                for(House house : city.getCommunityList().get(community_id).getHouseList()) {
                    System.out.println("Community ID: " + house.getCommunity_ID() + "   --   " + "House ID: "+ house.getHouse_ID() + "   --   " + "Family ID: "+ house.getHouse_ID());
                }
                System.out.println("************************************************ Enter a choice ************************************************");
                //print the list of house
                
                Scanner family = new Scanner(System.in);
                int family_id = family.nextInt() - 1;
                System.out.println("****************************************************************************************************************");
                // get the choice from input
                
                System.out.println("Person ID\tName\t\tAge\tGender\tRist Score\tRelationship");
                for(Person person : city.getCommunityList().get(community_id).getHouseList().get(family_id).getFamilyList().get(0).getPersonList()) {
                    System.out.println(person.getPerson_ID() + "\t\t" + person.getPerson_Name() + "\t\t" + person.getAge() + "\t" + person.getGender() + "\t" + person.getScore() + "\t\t" + person.getLabel());
                }
                System.out.println("************************************************ Enter a choice ************************************************");
                
                Scanner person = new Scanner(System.in);
                int person_id = person.nextInt() - 1;
                System.out.println("****************************************************************************************************************");
                // get the choice from input
                
                System.out.println("Date\tTotal Cholesterol\tHDL Cholesterol\tLDL Cholesterol\tIf Smoke\tIf Diabetes\tSystolic\tDiastolc\tExercise Hour\tRisk Score");
                for(VitalSign vs : city.getCommunityList().get(community_id).getHouseList().get(family_id).getFamilyList().get(0).getPersonList().get(person_id).getHealthAccount()) {
                    System.out.println(vs.getDate() + "\t" + vs.getTotalCholesterol() + "\t\t\t" + vs.getHdlCholesterol() + "\t\t" + vs.getLdlCholesterol() + "\t\t" + vs.isIfSmoke() + "\t\t" + vs.isIfDiabetes() + "\t\t" + vs.getSystolic() + "\t\t" + vs.getDiastolc() + "\t\t" + vs.getExerciseHour() + "\t\t" + vs.getScore());
                }
                
            break;
        }
    }
}
