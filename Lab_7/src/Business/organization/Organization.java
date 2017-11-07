/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.userAccount.UserAccountDirectory;
import Business.employee.EmployeeDirectory;
import Business.role.Role;
import Business.workQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public abstract class Organization {
    
    private static int count=0;
    private int organizationID;
    
    private String name;
    
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private UserAccountDirectory userAccountDirectory;

    public enum OrganizationType{
        Admin("Admin Organization"){},
        Doctor("Doctor Organization"){},
        Lab("Lab Organization"){};
        
        private String value;
        
        private OrganizationType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }
    }
    
    public abstract ArrayList<Role> getEmployeeRole();
    
    
    public Organization(String name)
    {
        count++;
        organizationID = count;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        this.name = name;
    }

    public int getOrganizationID() {
        return organizationID;
    }

    public void setOrganizationID(int organizationID) {
        this.organizationID = organizationID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

    public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }
    
    @Override
    public String toString()
    {
        return name;
    } 
}
