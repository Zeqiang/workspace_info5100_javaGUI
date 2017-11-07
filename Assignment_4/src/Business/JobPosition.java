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
public class JobPosition {
    
    private String JobName;
    private ArrayList<Teacher> teacherList;
    private Role role;

    public JobPosition() {
        teacherList = new ArrayList<Teacher>();
        role = new Role();
    }

    public ArrayList<Teacher> getTeacherList() {
        return teacherList;
    }

    public Teacher addTeacher(){
        Teacher teacher = new Teacher();
        teacherList.add(teacher);
        return teacher;
    }
    
    
    public String getJobName() {
        return JobName;
    }

    public void setJobName(String JobName) {
        this.JobName = JobName;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }
    
}
