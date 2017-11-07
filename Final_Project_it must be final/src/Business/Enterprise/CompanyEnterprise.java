/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Medicine.Medicine;
import Business.Role.Role;
import Business.WorkQueue.MedicineTrade;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class CompanyEnterprise extends Enterprise{
    
    private ArrayList<MedicineTrade> medicineList;
    
    public CompanyEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.MedicineCompany);
        medicineList = new ArrayList<MedicineTrade>();
    }

    public ArrayList<MedicineTrade> getMedicineList() {
        return medicineList;
    }

    public MedicineTrade addMedicine(MedicineTrade medicineTrade){
        medicineList.add(medicineTrade);
        return medicineTrade;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
