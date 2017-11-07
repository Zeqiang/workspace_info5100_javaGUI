/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Organization.Organization;
import Business.EcoSystem;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.Company.Manager.ManagerWorkArea;
import Interface.Company.Saler.SalerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class ManagerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel processContainer, UserAccount account, Organization CompanyOrganization, Enterprise enterprise, Network network, EcoSystem business) {
        return new ManagerWorkArea(processContainer, (CompanyEnterprise)enterprise, network);
    }

}
