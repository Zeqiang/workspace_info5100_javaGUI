/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Student;
import java.util.ArrayList;

/**
 *
 * @author Shuchao Huang
 */
public class StudentDirectory {
    
    private ArrayList<Student> studentDiredtory;
    
    public StudentDirectory() {
        studentDiredtory = new ArrayList<Student>(); 
    }

    public ArrayList<Student> getStudentDiredtory() {
        return studentDiredtory;
    }
    
    public Student addStudent(){
        Student student = new Student();
        studentDiredtory.add(student);
        return student;
    }
}
