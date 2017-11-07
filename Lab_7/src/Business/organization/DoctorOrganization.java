/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.role.DoctorRole;
import Business.role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class DoctorOrganization extends Organization{
    
    public DoctorOrganization(){
        super(Organization.OrganizationType.Doctor.getValue());
    }
    
    @Override
    public ArrayList<Role> getEmployeeRole() {
       ArrayList<Role> getEmployeeRole = new ArrayList<Role>();
       Role role = new DoctorRole();
       getEmployeeRole.add(role);
       return getEmployeeRole;
    }
}
