/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.userAccount;

import Business.employee.Employee;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String userName, String password){
        for(UserAccount ua : userAccountList){
            if(ua.getUserName().equals(userName) && ua.getPassword().equals(password)){
                return ua;
            }
        }
        return null;
    }
    
    public UserAccount createUserAccount(String userName, String password, Employee emlpoyee, Role role){
        UserAccount ua = new UserAccount();
        ua.setUserName(userName);
        ua.setPassword(password);
        ua.setRole(role);
        ua.setEmployee(emlpoyee);
        userAccountList.add(ua);
        return ua;
    }
    
    public void removeUserAccount(UserAccount userAccount){
        userAccountList.remove(userAccount);
    }
}
