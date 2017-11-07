/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Shuchao Huang
 */
public class Transcript {
    
    private String studentID;
    private CourseLoad courseLoad;

    public Transcript() {
        courseLoad = new CourseLoad();
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public CourseLoad getCourseLoad() {
        return courseLoad;
    }
    
}
