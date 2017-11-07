/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.sql.Date;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class CourseOffering {
    
    private String courseOfferingID;
    private Course course;
    private Semester semester;
    private Teacher teacher;
    private ArrayList<Seat> seatList;
    private ClassRoom classRoom;
    
    private String teacherID;
    private String room;
    private String building;
    private String year;
    private String season;
    private String courseName;

    public CourseOffering() {
        seatList = new ArrayList<Seat>();
        course = new Course();
        semester = new Semester();
        teacher = new Teacher();
        classRoom = new ClassRoom();
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public ClassRoom getClassRoom() {
        return classRoom;
    }

    public void setClassRoom(ClassRoom classRoom) {
        this.classRoom = classRoom;
    }

    public String getCourseOfferingID() {
        return courseOfferingID;
    }

    public void setCourseOfferingID(String courseOfferingID) {
        this.courseOfferingID = courseOfferingID;
    }

    public ArrayList<Seat> getSeatList() {
        return seatList;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    public Semester getSemester() {
        return semester;
    }

    public void setSemester(Semester semester) {
        this.semester = semester;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public ArrayList<Seat> getSeat() {
        return seatList;
    }
    
    public Seat addSeat(){
        Seat seat = new Seat();
        seatList.add(seat);
        return seat;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = room;
    }

    public String getBuilding() {
        return building;
    }

    public void setBuilding(String building) {
        this.building = building;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getSeason() {
        return season;
    }

    public void setSeason(String season) {
        this.season = season;
    }
    
}
