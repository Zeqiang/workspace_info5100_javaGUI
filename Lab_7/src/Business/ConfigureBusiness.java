/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.employee.Employee;
import Business.organization.AdminOrganization;
import Business.role.AdminRole;
import Business.userAccount.UserAccount;

/**
 *
 * @author Eric
 */
public class ConfigureBusiness {
    
    public static Business configure()
    {
        Business business = Business.getInstance();
        AdminOrganization ao = new AdminOrganization();
        business.getOrganizationDirectory().getOrganizationDirectory().add(ao);
        
        Employee e = new Employee();
        e.setName("admin");
        UserAccount ua = new UserAccount();
        ua.setEmployee(e);
        ua.setPassword("admin");
        ua.setRole(new AdminRole());
        ua.setUserName("admin");
        
        ao.getEmployeeDirectory().getEmployeeList().add(e);
        ao.getUserAccountDirectory().getUserAccountList().add(ua);
        return business;
    }
}
