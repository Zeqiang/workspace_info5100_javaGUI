/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class EnterpriseDirectory {
    
    private ArrayList<Enterprise> EnterpriseList;

    public EnterpriseDirectory() {
        EnterpriseList = new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return EnterpriseList;
    }
    
    public Enterprise AddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        
        if(type == Enterprise.EnterpriseType.ResearchLab){
            enterprise = new LabEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        
        if(type == Enterprise.EnterpriseType.MedicineCompany){
            enterprise = new CompanyEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        
        if(type == Enterprise.EnterpriseType.Hospital){
            enterprise = new HospitalEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        
        return enterprise;
    }
}
