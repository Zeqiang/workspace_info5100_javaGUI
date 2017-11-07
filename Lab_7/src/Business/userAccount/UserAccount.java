/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userAccount;

import Business.employee.Employee;
import Business.role.Role;
import Business.workQueue.WorkQueue;

/**
 *
 * @author Eric
 */
public class UserAccount {
    
    private static int count = 1000;
    private int userID;
    
    private String userName;
    private String password;
    
    private Employee employee;
    private Role role;
    private WorkQueue workQueue;

    public UserAccount() {
        userID = count++;
        workQueue = new WorkQueue();
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }
    
    @Override
    public String toString(){
        return userName;
    }
}
