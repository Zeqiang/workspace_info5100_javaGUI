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
public class DepartmentCourseCatalog {
    
    private ArrayList<Course> courseCatalog;

    public DepartmentCourseCatalog() {
       courseCatalog = new ArrayList<Course>(); 
    }

    public ArrayList<Course> getCourseCatalog() {
        return courseCatalog;
    }
    
    public Course addCourse(){
        Course course = new Course();
        courseCatalog.add(course);
        return course;
    }
     
    public void removeCollege(Course course){
        courseCatalog.remove(course);
    }

}
