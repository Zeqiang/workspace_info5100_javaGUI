/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.organization;

import Business.organization.Organization.OrganizationType;
import Business.userAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationDirectory;

    public OrganizationDirectory() {
        organizationDirectory = new ArrayList<Organization>();
    }

    public ArrayList<Organization> getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public Organization createOrganization(OrganizationType type){
        Organization organization = null;
        if(type.getValue().equals(OrganizationType.Doctor.getValue())){
            for(Organization org : organizationDirectory){
                if(org instanceof DoctorOrganization){
                    return org;
                }
            }
            organization = new LabOrganization();
            organizationDirectory.add(organization);
        }
        else if(type.getValue().equals(OrganizationType.Lab.getValue())){
            for(Organization org : organizationDirectory){
                if(org instanceof DoctorOrganization){
                    return org;
                }
            }
            organization = new LabOrganization();
            organizationDirectory.add(organization);
        }
        return organization;
    }
}
