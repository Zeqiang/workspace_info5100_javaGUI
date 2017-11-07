/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Role.Role;
import Business.TestMedicine.TestMedicinesCatalog;
import Business.Volunteer.VolunteerCatalog;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class LabEnterprise extends Enterprise{
    
    private TestMedicinesCatalog testMedicineCatalog;
    private VolunteerCatalog volunteerCatalog;
    
    public LabEnterprise(String name) {
        super(name, Enterprise.EnterpriseType.ResearchLab);
        testMedicineCatalog = new TestMedicinesCatalog();
        volunteerCatalog = new VolunteerCatalog();
    }

    public TestMedicinesCatalog getTestMedicineCatalog() {
        return testMedicineCatalog;
    }

    public void setVolunteerCatalog(VolunteerCatalog volunteerCatalog) {
        this.volunteerCatalog = volunteerCatalog;
    }

    public VolunteerCatalog getVolunteerCatalog() {
        return volunteerCatalog;
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        return null;
    }
}
