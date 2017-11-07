/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

/**
 *
 * @author Eric
 */
public class Medicine {
    
    private String medicineName;
    private String function;
    private String userAgeCondition;  
    private String treatment;
    private String contraindication;
    private DrugCatalog DrugCatalog;

    public Medicine() {
        DrugCatalog = new DrugCatalog();
    }

    public DrugCatalog getDrugCatalog() {
        return DrugCatalog;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }

    public String getContraindication() {
        return contraindication;
    }

    public void setContraindication(String contraindication) {
        this.contraindication = contraindication;
    }

    public String getUserAgeCondition() {
        return userAgeCondition;
    }

    public void setUserAgeCondition(String userAgeCondition) {
        this.userAgeCondition = userAgeCondition;
    }

    public String getTreatment() {
        return treatment;
    }

    public void setTreatment(String treatment) {
        this.treatment = treatment;
    }
    
    @Override
    public String toString(){
        return medicineName;
    }
}
