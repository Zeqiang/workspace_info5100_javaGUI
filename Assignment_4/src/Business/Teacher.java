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
public class Teacher extends Person{

    private String teacherID;
    private String salary;
    
    private FacultyRole facultyRole;

    public Teacher() {
        facultyRole = new FacultyRole();
    }

    public String getTeacherID() {
        return teacherID;
    }

    public void setTeacherID(String teacherID) {
        this.teacherID = teacherID;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public FacultyRole getFacultyRole() {
        return facultyRole;
    }

    public void setFacultyRole(FacultyRole facultyRole) {
        this.facultyRole = facultyRole;
    }
    
}
