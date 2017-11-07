/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.role;

import Business.Business;
import Business.organization.DoctorOrganization;
import Business.organization.Organization;
import Business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class DoctorRole extends Role{

    public DoctorRole() {
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Business business) {
        return new DoctorWorkAreaJPanel(userProcessContainer,userAccount,(DoctorOrganization) organization, business);
    }
    
    @Override
     public String toString() {
        return "Doctor";
    } 
}
