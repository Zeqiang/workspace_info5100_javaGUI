/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public OrganizationDirectory() {
        organizationList = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }
    
    public Organization createOrganization(Organization.Type type){
        
        Organization organization = null;
        
        if (type.getValue().equals(Organization.Type.Company_Admin.getValue())){
            organization = new CompanyAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Company_Manager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Company_Saler.getValue())){
            organization = new SaleOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Hospital_Buyer.getValue())){
            organization = new BuyerOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab_Admin.getValue())){
            organization = new LabAdminOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab_Researcher.getValue())){
            organization = new ResearcherOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab_Assistant.getValue())){
            organization = new AssistantOrganization();
            organizationList.add(organization);
        }
        else if (type.getValue().equals(Organization.Type.Lab_VolunteerManager.getValue())){
            organization = new VolunteerOrganization();
            organizationList.add(organization);
        }
        return organization;
    }
}
