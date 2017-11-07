/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.organization.OrganizationDirectory;
/**
 *
 * @author Eric
 */
public class Business {
    
    private static Business business;
    
    private OrganizationDirectory organizationDirectory;

    public Business() {
        organizationDirectory = new OrganizationDirectory();
    }
    
    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    public void setOrganizationDirectory(OrganizationDirectory organizationDirectory) {
        this.organizationDirectory = organizationDirectory;
    }
    
}
