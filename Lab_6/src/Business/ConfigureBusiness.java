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
public class ConfigureBusiness {
    
    public static Business InitializeBusiness(){
        Business business = Business.getInstance();
        
        Employee e = business.getEmployeeDirectory().addEmployee();
        e.setFirstName("Admin");
        e.setLastName("");
        e.setOrganization("NEU");
        
        UserAccount ua = business.getUserAccountDirectory().addUserAccount();
        ua.setUserName("admin");
        ua.setPassword("admin");
        ua.setPerson(e);
        ua.setRole(UserAccount.ADMIN_ROLE);
        ua.setIsActive(true);
        
        return business;
    }
}
