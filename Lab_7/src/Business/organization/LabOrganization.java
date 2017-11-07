/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.LabAssistantRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class LabOrganization extends Organization{
    
    public LabOrganization(){
        super(Organization.OrganizationType.Lab.getValue());
    }
    
    @Override
    public ArrayList<Role> getEmployeeRole() {
       ArrayList<Role> getEmployeeRole = new ArrayList<Role>();
       Role role = new LabAssistantRole();
       getEmployeeRole.add(role);
       return getEmployeeRole;
    }
}
