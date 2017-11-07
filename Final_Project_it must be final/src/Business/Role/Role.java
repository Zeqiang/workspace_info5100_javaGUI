/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Organization.Organization;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public abstract class Role {
    
    public enum RoleType{
        
        Company_Admin("Company_Admin"),
        Company_Manager("Company_Manager"),
        Company_Saler("Company_Saler"),
        Hospital_Buyer("Hospital_Buyer"),
        Lab_Admin("Lab_Admin"),
        Lab_Researcher("Lab_Researcher"),
        Lab_Assistant("Lab_Assistant"),
        Lab_VolunteerManager("Lab_VolunteerManager");
        
        private String value;
        
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel processContainer, 
            UserAccount account, 
            Organization organization,
            Enterprise enterprise, 
            Network network, 
            EcoSystem business);

    @Override
    public String toString() {
        return this.getClass().getName();
    }
}
