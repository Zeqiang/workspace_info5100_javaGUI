/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.ManagerRole;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class ManagerOrganization extends Organization{
    
    public ManagerOrganization() {
        super(Organization.Type.Company_Manager.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ManagerRole());
        return roles;
    }
}
