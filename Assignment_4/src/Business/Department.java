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
public class Department {
    
    private String departmentID;
    private String departmentName;
    
    private JobPosition jobPosition;
    private DegreeCatalog degreeCatalog;
    private DepartmentCourseCatalog departmentCourseCatalog;
    private StudentDirectory studentDirectory;
    private DepartmentCourseSchedule departmentCourseList;

    public Department() {
        jobPosition = new JobPosition();
        degreeCatalog =new DegreeCatalog();
        departmentCourseCatalog = new DepartmentCourseCatalog();
        studentDirectory = new StudentDirectory();
        departmentCourseList = new DepartmentCourseSchedule();
    }

    public String getDepartmentID() {
        return departmentID;
    }

    public void setDepartmentID(String departmentID) {
        this.departmentID = departmentID;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }

    public DegreeCatalog getDegreeCatalog() {
        return degreeCatalog;
    }

    public DepartmentCourseCatalog getDepartmentCourseCatalog() {
        return departmentCourseCatalog;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    public DepartmentCourseSchedule getDepartmentCourseList() {
        return departmentCourseList;
    }
}
