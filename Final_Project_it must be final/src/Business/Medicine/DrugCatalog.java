/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class DrugCatalog {
    
    private ArrayList<Drug> drugsList; 

    public DrugCatalog() {
        drugsList = new ArrayList<Drug>();   
    }

    public ArrayList<Drug> getDrugsList() {
        return drugsList;
    }

    public Drug addDrug(Drug drug){
        drugsList.add(drug);
        return drug;
    }
}
