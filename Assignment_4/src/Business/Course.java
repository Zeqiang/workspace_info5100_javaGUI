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
public class Course {
    
    private String courseID;
    private String courseName;
    
    private String courseCredit;
    private String coursePrice;
    
    private String courseType;
    private String courseDepartment;
    
    private String coursePrerequest;
    private String courseFollowup;
    private String courseDegreeName;

    public String getCourseDegreeName() {
        return courseDegreeName;
    }

    public void setCourseDegreeName(String courseDegreeName) {
        this.courseDegreeName = courseDegreeName;
    }

    public String getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(String courseCredit) {
        this.courseCredit = courseCredit;
    }

    public String getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(String coursePrice) {
        this.coursePrice = coursePrice;
    }

    public String getCoursePrerequest() {
        return coursePrerequest;
    }

    public void setCoursePrerequest(String coursePrerequest) {
        this.coursePrerequest = coursePrerequest;
    }

    public String getCourseFollowup() {
        return courseFollowup;
    }

    public void setCourseFollowup(String courseFollowup) {
        this.courseFollowup = courseFollowup;
    }

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseType() {
        return courseType;
    }

    public void setCourseType(String courseType) {
        this.courseType = courseType;
    }

    public String getCourseDepartment() {
        return courseDepartment;
    }

    public void setCourseDepartment(String courseDepartment) {
        this.courseDepartment = courseDepartment;
    }

}
