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
public class University {
    
    private String universityID;
    private String universityName;
    
    private CollegeCatalog collegeCatalog;
    private StudentDirectory studentDirectory;

    public University() {
        collegeCatalog = new CollegeCatalog();
        studentDirectory = new StudentDirectory();
    }

    public String getUniversityID() {
        return universityID;
    }

    public void setUniversityID(String universityID) {
        this.universityID = universityID;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }

    public CollegeCatalog getCollegeCatalog() {
        return collegeCatalog;
    }

    public void setCollegeCatalog(CollegeCatalog collegeCatalog) {
        this.collegeCatalog = collegeCatalog;
    }

    public StudentDirectory getStudentDirectory() {
        return studentDirectory;
    }

    
    
}
