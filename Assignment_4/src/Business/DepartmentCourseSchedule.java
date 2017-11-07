/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Shuchao Huang
 */
public class DepartmentCourseSchedule {
    
    private String scheduleID;
    private ArrayList<CourseOffering> departmentCourseSchedule;

    public DepartmentCourseSchedule() {
        departmentCourseSchedule = new ArrayList<CourseOffering>();
    }

    public String getScheduleID() {
        return scheduleID;
    }

    public void setScheduleID(String scheduleID) {
        this.scheduleID = scheduleID;
    }

    public ArrayList<CourseOffering> getDepartmentCourseSchedule() {
        return departmentCourseSchedule;
    }
    
    public CourseOffering addCourseOffering(){
        CourseOffering courseOffering = new CourseOffering();
        departmentCourseSchedule.add(courseOffering);
        return courseOffering;
    }
    
}
