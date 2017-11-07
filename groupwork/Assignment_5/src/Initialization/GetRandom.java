/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Initialization;

import java.text.DecimalFormat;
import java.util.Random;

/**
 *
 * @author Eric
 */
public class GetRandom {
    
    public static String getRandomString_Name() {
        
        String base = "abcdefghijklmnopqrstuvwxyz";     
        Random random = new Random();
        StringBuffer sb = new StringBuffer();
        
        for (int i = 0; i < 6; i++) {     
            int number = random.nextInt(base.length());            
            sb.append(base.charAt(number));     
        }
        
        return sb.toString();
    }
    
    
    public static String getRandomString_Gender() {
        
        Random random = new Random();
        boolean isMale =  random.nextBoolean();
        
        if(isMale){
            return "M";
        }else{
            return "F";
        }
    }
    
    
    public static int getRandoInt_Age_Individual() {
           
        Random random = new Random();
        int max = 45;
        int min = 20;
        int age_Individual = random.nextInt(max)%(max-min+1) + min;
                
        return age_Individual;
    }
    
    
    public static int getRandomInt_Age_Parent() {
           
        Random random = new Random();
        int max = 65;
        int min = 45;
        int age_Individual = random.nextInt(max)%(max-min+1) + min;
                
        return age_Individual;
    }
    
    
    public static int getRandomInt_Age_GrandParent() {
           
        Random random = new Random();
        int max = 65;
        int min = 95;
        int age_Individual = random.nextInt(max)%(max-min+1) + min;
                
        return age_Individual;
    }
    
    
    public static double getRandomDouble_TotalCholesterol() {
           
        Random random = new Random();
        
        double totalCholesterol = random.nextDouble()*10;
        DecimalFormat decimalformat = new DecimalFormat( "0.00 "); 
        double newTotalCholesterol = Double.parseDouble(decimalformat.format(totalCholesterol));
                
        return newTotalCholesterol;
    }
    

    public static double getRandomDouble_HDLCholesterol() {
           
        Random random = new Random();
        
        double hdlCholesterol = random.nextDouble()*10;
        DecimalFormat decimalformat = new DecimalFormat( "0.00 "); 
        double newHDLCholesterol = Double.parseDouble(decimalformat.format(hdlCholesterol));
                
        return newHDLCholesterol;
    }
    
    
    public static double getRandomDouble_LDLCholesterol() {
           
        Random random = new Random();
        
        double ldlCholesterol = random.nextDouble()*10;
        DecimalFormat decimalformat = new DecimalFormat( "0.00 "); 
        double newLDLCholesterol = Double.parseDouble(decimalformat.format(ldlCholesterol));
                
        return newLDLCholesterol;
    }
    
    
    public static boolean getRandomBoolean_IfSmoke() {
           
        Random random = new Random();
        boolean ifSmoke = random.nextBoolean();
        
        return ifSmoke;
    }
    
    
    public static boolean getRandomBoolean_IfDiabtes() {
           
        Random random = new Random();
        boolean ifDiabtes = random.nextBoolean();
        
        return ifDiabtes;
    }
    
    
//    public static int getRandomInt_BloodPressure() {
//           
//        Random random = new Random();
//        int max = 200;
//        int min = 50;
//        int bloodPressure = random.nextInt(max)%(max-min+1) + min;
//                
//        return bloodPressure;
//    }
    
    
    public static int getRandomInt_Systolic() {
           
        Random random = new Random();
        int systolic = random.nextInt(5);
                
        return systolic;
    }
    
    
    public static int getRandomInt_Diastolc() {
           
        Random random = new Random();
        int diastolc = random.nextInt(5);
                
        return diastolc;
    }
    
    
    public static int getRandomInt_ExerciseHour() {
           
        Random random = new Random();
        int exerciseHour = random.nextInt(5);
                
        return exerciseHour;
    } 
}
