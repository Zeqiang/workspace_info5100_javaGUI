/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bussiness;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class VitalSignHistory {
    
    private ArrayList<VitalSign> vitalSignHistory;
    
    public VitalSignHistory()
    {
        vitalSignHistory = new ArrayList<VitalSign>();
    }

    public ArrayList<VitalSign> getVitalSignHistory() {
        return vitalSignHistory;
    }

    public void setVitalSignHistory(ArrayList<VitalSign> VitalSignHistory) {
        this.vitalSignHistory = VitalSignHistory;
    }
    
    public VitalSign addVitalSign()
    {
        VitalSign vs = new VitalSign();
        vitalSignHistory.add(vs);
        return vs;
    }
    
    public void deleteVitalSign(VitalSign vs)
    {
        vitalSignHistory.remove(vs); 
    }
    
}
