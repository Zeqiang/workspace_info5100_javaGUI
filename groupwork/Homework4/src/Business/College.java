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
public class College {
    
    private String collegeID;
    private String collegeName;
    
    private DepartmentCatalog departmentcatalog;
    private StudentDirectory studentList;

    public College() {
        departmentcatalog = new DepartmentCatalog();
        studentList = new StudentDirectory();
    }

    public String getCollegeID() {
        return collegeID;
    }

    public void setCollegeID(String collegeID) {
        this.collegeID = collegeID;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public DepartmentCatalog getDepartmentcatalog() {
        return departmentcatalog;
    }

    public void setDepartmentcatalog(DepartmentCatalog departmentcatalog) {
        this.departmentcatalog = departmentcatalog;
    }

    public StudentDirectory getStudentList() {
        return studentList;
    }

    public void setStudentList(StudentDirectory studentList) {
        this.studentList = studentList;
    }

}