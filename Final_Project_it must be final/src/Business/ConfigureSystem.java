package Business;

import Business.Employee.Employee;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Enterprise.LabEnterprise;
import Business.Medicine.Medicine;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.AssistantRole;
import Business.Role.BuyerRole;
import Business.Role.CompanyAdminRole;
import Business.Role.LabAdminRole;
import Business.Role.ManagerRole;
import Business.Role.ResearchRole;
import Business.Role.SalerRole;
import Business.Role.SystemAdminRole;
import Business.Role.VolunteerRole;
import Business.WorkQueue.MedicineTrade;
import Business.UserAccount.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureSystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //system admin
        Employee employee_sys = system.getEmployeeDirectory().createEmployee("Zeqiang Li");
        UserAccount ua_sys = system.getUserAccountDirectory().createUserAccount("sys", "sys", employee_sys, new SystemAdminRole());
        
        
        //create a network
        Network network = system.createNetwork();
        network.setName("network");
        
        //volunteer & drug
        network.setDrugCatalog(Initialization.Initialization_DrugCatalog());
        
        
        //create 3 enterprise
        Enterprise enterprise_1 = network.getEnterpriseDirectory().AddEnterprise("hospital_01", Enterprise.EnterpriseType.Hospital);
        Enterprise enterprise_2 = network.getEnterpriseDirectory().AddEnterprise("lab_01", Enterprise.EnterpriseType.ResearchLab);
        Enterprise enterprise_3 = network.getEnterpriseDirectory().AddEnterprise("company_01", Enterprise.EnterpriseType.MedicineCompany);
        Enterprise enterprise_4 = network.getEnterpriseDirectory().AddEnterprise("hospital_02", Enterprise.EnterpriseType.Hospital);
        Enterprise enterprise_5 = network.getEnterpriseDirectory().AddEnterprise("lab_02", Enterprise.EnterpriseType.ResearchLab);
        Enterprise enterprise_6 = network.getEnterpriseDirectory().AddEnterprise("company_02", Enterprise.EnterpriseType.MedicineCompany);      
        
        HospitalEnterprise hospital = (HospitalEnterprise)enterprise_1;
        LabEnterprise lab = (LabEnterprise)enterprise_2;
        CompanyEnterprise company = (CompanyEnterprise)enterprise_3;
        HospitalEnterprise hospital_1 = (HospitalEnterprise)enterprise_4;
        LabEnterprise lab_1 = (LabEnterprise)enterprise_5;
        CompanyEnterprise company_1 = (CompanyEnterprise)enterprise_6;
        
        lab.setVolunteerCatalog(Initialization.Initialization_VolunteerCatalog());
        
        //create hospital organization
        enterprise_1.getOrganizationDirectory().createOrganization(Organization.Type.Hospital_Buyer);
        
        //create research lab organization
        enterprise_2.getOrganizationDirectory().createOrganization(Organization.Type.Lab_Assistant);
        enterprise_2.getOrganizationDirectory().createOrganization(Organization.Type.Lab_Researcher);
        enterprise_2.getOrganizationDirectory().createOrganization(Organization.Type.Lab_VolunteerManager);
        
        //create medicine company organization
        enterprise_3.getOrganizationDirectory().createOrganization(Organization.Type.Company_Manager);
        enterprise_3.getOrganizationDirectory().createOrganization(Organization.Type.Company_Saler);
        
        
        //hospital admin and admin account
        String username_hop = "hos";
        String password_hop = "hos";
        String name_hos = "hospital:Eric";
        Employee employee_hos = enterprise_1.getEmployeeDirectory().createEmployee(name_hos);
        enterprise_1.getUserAccountDirectory().createUserAccount(username_hop, password_hop, employee_hos, new BuyerRole());
        
        //medicine_company admin and admin account
        String username_med = "med";
        String password_med = "med";
        String name_med = "medicine company:Eric";
        Employee employee_med = enterprise_3.getEmployeeDirectory().createEmployee(name_med);
        enterprise_3.getUserAccountDirectory().createUserAccount(username_med, password_med, employee_med, new CompanyAdminRole());
        
        //research Lab admin and admin account
        String username_lab = "lab";
        String password_lab = "lab";
        String name_lab = "research lab:Eric";
        Employee employee_lab = enterprise_2.getEmployeeDirectory().createEmployee(name_lab);
        enterprise_2.getUserAccountDirectory().createUserAccount(username_lab, password_lab, employee_lab, new LabAdminRole());
        
        
        /************************************************************************************************************************/        
        
        
        //medicine company employee
        Employee employee_med_manager = enterprise_3.getOrganizationDirectory().getOrganizationList().get(0).getEmployeeDirectory().createEmployee("Manager:Eric");
        Employee employee_med_saler = enterprise_3.getOrganizationDirectory().getOrganizationList().get(1).getEmployeeDirectory().createEmployee("Saler:Eric");
        
        //medicine company employee account
        String userName_ma = "ma";
        String password_ma = "ma";
        Organization managerOrganization = enterprise_3.getOrganizationDirectory().getOrganizationList().get(0);;
        managerOrganization.getUserAccountDirectory().createUserAccount(userName_ma, password_ma, employee_med_manager, new ManagerRole());
        String userName_sa = "se";
        String password_sa = "se";
        Organization SalerOrganization = enterprise_3.getOrganizationDirectory().getOrganizationList().get(1);;
        SalerOrganization.getUserAccountDirectory().createUserAccount(userName_sa, password_sa, employee_med_saler, new SalerRole());
        
        
        //research Lab employee
        Employee employee_lab_assistant = enterprise_2.getOrganizationDirectory().getOrganizationList().get(0).getEmployeeDirectory().createEmployee("Assistant:Eric");
        Employee employee_lab_researcher = enterprise_2.getOrganizationDirectory().getOrganizationList().get(1).getEmployeeDirectory().createEmployee("Researcher:Eric");
        Employee employee_lab_volunteer = enterprise_2.getOrganizationDirectory().getOrganizationList().get(2).getEmployeeDirectory().createEmployee("Volunteer:Eric");
        
        //research Lab employee account
        String userName_as = "as";
        String password_as = "as";
        Organization assistantOrganization = enterprise_2.getOrganizationDirectory().getOrganizationList().get(0);;
        assistantOrganization.getUserAccountDirectory().createUserAccount(userName_as, password_as, employee_lab_assistant, new AssistantRole());
        String userName_re = "re";
        String password_re = "re";
        Organization researcherOrganization = enterprise_2.getOrganizationDirectory().getOrganizationList().get(1);;
        researcherOrganization.getUserAccountDirectory().createUserAccount(userName_re, password_re, employee_lab_researcher, new ResearchRole());
        String userName_vo = "vo";
        String password_vo = "vo";
        Organization volunteerOrganization = enterprise_2.getOrganizationDirectory().getOrganizationList().get(2);;
        volunteerOrganization.getUserAccountDirectory().createUserAccount(userName_vo, password_vo, employee_lab_volunteer, new VolunteerRole());
        
        
        /************************************************************************************************************************/
        
        
        //create MedicineTrade
        Medicine Medicine_1 = new Medicine();
        Medicine_1.setMedicineName("Med_01");
        Medicine_1.setFunction("cough");
        Medicine_1.setUserAgeCondition("18+");
        Medicine_1.setTreatment("once per day");
        Medicine_1.setContraindication("not for pregnancy");
        MedicineTrade MedicineT_1 = new MedicineTrade();
        MedicineT_1.setMedicine(Medicine_1);
        MedicineT_1.setFloorPrice(40);
        MedicineT_1.setSalePrice(100);
        MedicineT_1.setAvailability(100);
        MedicineT_1.setLabName("Lab01");
        MedicineT_1.setStatus("successful");
        MedicineT_1.setCost("10w");
        
        Medicine Medicine_2 = new Medicine();
        Medicine_2.setMedicineName("Med_02");
        Medicine_2.setFunction("fever");
        Medicine_2.setUserAgeCondition("6+");
        Medicine_2.setTreatment("twice per day");
        Medicine_2.setContraindication("not for pregnancy");
        MedicineTrade MedicineT_2 = new MedicineTrade();
        MedicineT_2.setMedicine(Medicine_2);
        MedicineT_2.setFloorPrice(10);
        MedicineT_2.setSalePrice(50);
        MedicineT_2.setAvailability(100);
        MedicineT_2.setLabName("Lab01");
        MedicineT_2.setStatus("successful");
        MedicineT_2.setCost("10w");
        
        company.addMedicine(MedicineT_1);
        company.addMedicine(MedicineT_2);
        
        
        /************************************************************************************************************************/
        
        
        return system;
    }
    
}
