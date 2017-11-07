/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.AdminRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class AdminOrganization extends Organization{
    
    public AdminOrganization(){
        super(Organization.OrganizationType.Admin.getValue());
    }
    
    @Override
    public ArrayList<Role> getEmployeeRole() {
       ArrayList<Role> getEmployeeRole = new ArrayList<Role>();
       Role role = new AdminRole();
       getEmployeeRole.add(role);
       return getEmployeeRole;
    }
}
