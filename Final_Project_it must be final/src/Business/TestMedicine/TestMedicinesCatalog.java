/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.TestMedicine;

import Business.Medicine.Medicine;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class TestMedicinesCatalog {
    
    ArrayList<TestMedicine> testMedicineCatalog;
    
    public TestMedicinesCatalog() {
        testMedicineCatalog =new ArrayList<TestMedicine>();
    }
    
    public ArrayList<TestMedicine> getTestMedicineCatalog() {
        return testMedicineCatalog;
    }

    public TestMedicine addTestMedicine(TestMedicine testmedicine){
        testMedicineCatalog.add(testmedicine);
        return testmedicine;
    }
}
