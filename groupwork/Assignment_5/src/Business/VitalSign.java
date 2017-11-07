/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Eric
 */
public class VitalSign {
    
    private int date;
    
    private double totalCholesterol;
    private double hdlCholesterol;
    private double ldlCholesterol;
    
    private boolean ifSmoke;
    private boolean ifDiabetes;
    
    private int systolic;
    private int diastolc;
    private int exerciseHour;
    
    private int score;

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public double getTotalCholesterol() {
        return totalCholesterol;
    }

    public void setTotalCholesterol(double totalCholesterol) {
        this.totalCholesterol = totalCholesterol;
    }

    public double getHdlCholesterol() {
        return hdlCholesterol;
    }

    public void setHdlCholesterol(double hdlCholesterol) {
        this.hdlCholesterol = hdlCholesterol;
    }

    public double getLdlCholesterol() {
        return ldlCholesterol;
    }

    public void setLdlCholesterol(double ldlCholesterol) {
        this.ldlCholesterol = ldlCholesterol;
    }

    public boolean isIfSmoke() {
        return ifSmoke;
    }

    public void setIfSmoke(boolean ifSmoke) {
        this.ifSmoke = ifSmoke;
    }

    public boolean isIfDiabetes() {
        return ifDiabetes;
    }

    public void setIfDiabetes(boolean ifDiabetes) {
        this.ifDiabetes = ifDiabetes;
    }

    public int getSystolic() {
        return systolic;
    }

    public void setSystolic(int systolic) {
        this.systolic = systolic;
    }

    public int getDiastolc() {
        return diastolc;
    }

    public void setDiastolc(int diastolc) {
        this.diastolc = diastolc;
    }

    public int getExerciseHour() {
        return exerciseHour;
    }

    public void setExerciseHour(int exerciseHour) {
        this.exerciseHour = exerciseHour;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}
