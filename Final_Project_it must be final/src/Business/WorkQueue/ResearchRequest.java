/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

import Business.Employee.Employee;
import Business.Enterprise.CompanyEnterprise;
import Business.Enterprise.Enterprise;
import Business.Volunteer.VolunteerCatalog;

/**
 *
 * @author Eric
 */
public class ResearchRequest extends WorkRequest{
    
    private Employee assistantEmployee;
    private Employee volunteermanagerEmployee;
    private int volunteersAmount;
    private VolunteerCatalog volunteersList;
    private String testCaution;
    private int budget;
    private String researchCycle;
    private int moneyReceive;
    private String sponsor;
    private String labName;
    private String result;
    
    public ResearchRequest() {
//        super(WorkRequest.WorkRequestType.ResearchRequest);
        volunteersList = new VolunteerCatalog();
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getLabName() {
        return labName;
    }

    public void setLabName(String labName) {
        this.labName = labName;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public int getMoneyReceive() {
        return moneyReceive;
    }

    public void setMoneyReceive(int moneyReceive) {
        this.moneyReceive = moneyReceive;
    }

    public String getResearchCycle() {
        return researchCycle;
    }

    public void setResearchCycle(String researchCycle) {
        this.researchCycle = researchCycle;
    }

    public int getBudget() {
        return budget;
    }

    public String getTestCaution() {
        return testCaution;
    }

    public void setTestCaution(String testCaution) {
        this.testCaution = testCaution;
    }

    public void setBudget(int budget) {
        this.budget = budget;
    }
    
    public int getVolunteersAmount() {
        return volunteersAmount;
    }

    public void setVolunteersAmount(int volunteersAmount) {
        this.volunteersAmount = volunteersAmount;
    }

    public VolunteerCatalog getVolunteersList() {
        return volunteersList;
    }

    public Employee getAssistantEmployee() {
        return assistantEmployee;
    }

    public void setAssistantEmployee(Employee assistantEmployee) {
        this.assistantEmployee = assistantEmployee;
    }

    public Employee getVolunteermanagerEmployee() {
        return volunteermanagerEmployee;
    }

    public void setVolunteermanagerEmployee(Employee volunteermanagerEmployee) {
        this.volunteermanagerEmployee = volunteermanagerEmployee;
    }
    
    @Override
    public String toString() {
        return this.getMedicine().getMedicineName();
    }
}
