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
public class Degree {
    
    private String degreeID;
    private String degreeName;
    private String degreeRequirement;
    private String degreeRelated;
    
    private ArrayList<Course> courseList;

    
    public Degree() {
        courseList = new ArrayList<Course>();
    }    

    public ArrayList<Course> getCourseList() {
        return courseList;
    }
    
    public Course addCourse(){
        Course course = new Course();
        courseList.add(course);
        return course;
    }

    public String getDegreeName() {
        return degreeName;
    }

    public void setDegreeName(String degreeName) {
        this.degreeName = degreeName;
    }

    public String getDegreeRequirement() {
        return degreeRequirement;
    }

    public void setDegreeRequirement(String degreeRequirement) {
        this.degreeRequirement = degreeRequirement;
    }

    public String getDegreeID() {
        return degreeID;
    }

    public void setDegreeID(String degreeID) {
        this.degreeID = degreeID;
    }

    public String getDegreeRelated() {
        return degreeRelated;
    }

    public void setDegreeRelated(String degreeRelated) {
        this.degreeRelated = degreeRelated;
    }

    
    
}