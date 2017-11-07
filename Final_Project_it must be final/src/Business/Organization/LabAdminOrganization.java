/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CompanyAdminRole;
import Business.Role.LabAdminRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class LabAdminOrganization extends Organization{
    
    public LabAdminOrganization() {
        super(Type.Lab_Admin.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new LabAdminRole());
        return roles;
    }
}
