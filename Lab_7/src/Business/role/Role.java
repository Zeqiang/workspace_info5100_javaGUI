/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.role;

import Business.Business;
import Business.userAccount.UserAccount;
import Business.organization.Organization;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public abstract class Role {
    
    public enum RoleType{
        
    Admin("Admin"),
    Doctor("Doctor"),
    LabAssistant("Lab Assistant");
    
    private String value;
    
    private RoleType(String value){
        this.value = value;
    }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        @Override
        public String toString(){
            return value;
        }
    }
        
        public abstract JPanel createWorkArea(JPanel userProcessContainer, UserAccount account,
                Organization organization,Business business);
}
