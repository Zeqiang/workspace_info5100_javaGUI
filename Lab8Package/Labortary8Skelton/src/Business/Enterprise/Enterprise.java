/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;

/**
 *
 * @author Eric
 */
public abstract class Enterprise extends Organization{

    private EnterpriseType EnterpriseType;
    
    private OrganizationDirectory organizationDirectory;

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }
    
    public enum EnterpriseType{
        Hostipal("Hostipal");
        private String value;

        private EnterpriseType(String value) {
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

    public EnterpriseType getEnterpriseType() {
        return EnterpriseType;
    }

    public void setEnterpriseType(EnterpriseType EnterpriseType) {
        this.EnterpriseType = EnterpriseType;
    }
    
    public Enterprise(String name, EnterpriseType type) {
        super(name);
        this.EnterpriseType = type;
        organizationDirectory = new OrganizationDirectory();
    }
}
