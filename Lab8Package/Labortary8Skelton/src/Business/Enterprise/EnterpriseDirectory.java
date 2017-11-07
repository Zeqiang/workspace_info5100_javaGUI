/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import com.db4o.collections.ActivatableArrayList;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class EnterpriseDirectory {
    
    
    private ArrayList<Enterprise> EnterpriseList;

    public EnterpriseDirectory() {
        EnterpriseList = new ActivatableArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return EnterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> EnterpriseList) {
        this.EnterpriseList = EnterpriseList;
    }
    
    public Enterprise createAndAddEnterprise(String name, Enterprise.EnterpriseType type){
        Enterprise enterprise = null;
        if(type == Enterprise.EnterpriseType.Hostipal){
            enterprise = new HostipalEnterprise(name);
            EnterpriseList.add(enterprise);
        }
        return enterprise;
    }
}
