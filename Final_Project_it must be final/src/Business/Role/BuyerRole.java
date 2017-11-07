/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import Interface.Hospital.Buyer.BuyerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class BuyerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel processContainer, UserAccount account, Organization CompanyOrganization, Enterprise enterprise, Network network, EcoSystem business) {
        return new BuyerWorkArea(processContainer, network, (HospitalEnterprise)enterprise);
    }
    
}
