/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.SystemAdmin.SystemAdminWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class SystemAdminRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel processContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem system) {
        return new SystemAdminWorkArea(processContainer, system);
    }
    
}
