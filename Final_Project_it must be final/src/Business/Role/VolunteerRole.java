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
import Business.Enterprise.LabEnterprise;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Interface.Company.Saler.SalerWorkArea;
import Interface.Lab.VolunteerManager.VolunteerManagerWorkArea;
import javax.swing.JPanel;

/**
 *
 * @author Eric
 */
public class VolunteerRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel processContainer, UserAccount account, Organization organization, Enterprise enterprise, Network network, EcoSystem business) {
        return new VolunteerManagerWorkArea(processContainer, (LabEnterprise)enterprise, account);
    }
}
