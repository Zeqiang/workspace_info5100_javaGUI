/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.role;

import Business.Business;
import Business.organization.Organization;
import Business.userAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class AdminRole extends Role{

    public AdminRole() {
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer,UserAccount userAccount, Organization organization, Business business) {
       return new AdminWorkAreaJPanel(userProcessContainer, business);
       
    } 
    
    @Override
    public String toString() {
        return "Admin";
    }
}
