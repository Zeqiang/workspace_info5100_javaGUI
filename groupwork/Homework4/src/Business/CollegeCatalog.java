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
public class CollegeCatalog {
    
//    private String universityName;
    private ArrayList<College> collegeCatalog;

    public CollegeCatalog() {
        collegeCatalog = new ArrayList<College>(); 
    }

//    public String getUniversityName() {
//        return universityName;
//    }
//
//    public void setUniversityName(String universityName) {
//        this.universityName = universityName;
//    }

    public ArrayList<College> getCollegeCatalog() {
        return collegeCatalog;
    }
    
    public College addCollege(){
        College college = new College();
        collegeCatalog.add(college);
        return college;
    }
    
    public void removeCollege(College college){
        collegeCatalog.remove(college);
    }
    
}