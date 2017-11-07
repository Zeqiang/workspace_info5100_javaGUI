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
public class CourseLoad {
    
    private ArrayList<SeatAssignment>  courseLoad;

    public CourseLoad() {
        courseLoad = new ArrayList<SeatAssignment>();
    }

    public ArrayList<SeatAssignment> getCourseLoad() {
        return courseLoad;
    }

    public SeatAssignment addCourseLoad(){
        SeatAssignment seatAssignment = new SeatAssignment();
        courseLoad.add(seatAssignment);
        return seatAssignment;
        
    }
}
