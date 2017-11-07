/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.Role;
import Business.Role.SalerRole;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class SaleOrganization extends Organization{
    
    public SaleOrganization() {
        super(Organization.Type.Company_Saler.getValue());
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
        roles.add(new SalerRole());
        return roles;
    }
}
