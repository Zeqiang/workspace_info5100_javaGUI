/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Enterprise.EnterpriseDirectory;
import Business.Medicine.DrugCatalog;

/**
 *
 * @author Eric
 */
public class Network {
    
    private String name;
    private EnterpriseDirectory enterpriseDirectory;
    private DrugCatalog DrugCatalog;

    public Network() {
        enterpriseDirectory = new EnterpriseDirectory();
        DrugCatalog = new DrugCatalog();
    }

    public String getName() {
        return name;
    }

    public DrugCatalog getDrugCatalog() {
        return DrugCatalog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public EnterpriseDirectory getEnterpriseDirectory() {
        return enterpriseDirectory;
    }

    public void setDrugCatalog(DrugCatalog DrugCatalog) {
        this.DrugCatalog = DrugCatalog;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
