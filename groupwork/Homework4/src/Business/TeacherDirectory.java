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
public class TeacherDirectory {
    
    private ArrayList<Teacher> teacherDirectory;
    
    public TeacherDirectory() {
        teacherDirectory = new ArrayList<Teacher>(); 
    }

    public ArrayList<Teacher> getTeacherDirectory() {
        return teacherDirectory;
    }
    
    public Teacher addTeacher(){
        Teacher teacher = new Teacher();
        teacherDirectory.add(teacher);
        return teacher;
    }
    
}
