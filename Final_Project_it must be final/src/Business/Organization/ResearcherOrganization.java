/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.ResearchRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class ResearcherOrganization extends Organization{
    
    public ResearcherOrganization() {
        super(Organization.Type.Lab_Researcher.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new ResearchRole());
        return roles;
    }
}
