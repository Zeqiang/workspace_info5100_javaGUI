/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Volunteer;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class VolunteerCatalog {
    
    private ArrayList<Volunteer> VolunteerList;

    public VolunteerCatalog() {
        VolunteerList = new ArrayList<Volunteer>();
    }

    public ArrayList<Volunteer> getVolunteerList() {
        return VolunteerList;
    }
    
    public Volunteer addVolunteer(Volunteer volunteer){
        VolunteerList.add(volunteer);
        return volunteer;
    }
    
    public void removeVolunteer(Volunteer volunteer){
        VolunteerList.remove(volunteer);
    }
}
