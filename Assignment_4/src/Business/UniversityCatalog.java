/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import com.sun.istack.internal.FinalArrayList;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class UniversityCatalog {
    
    private ArrayList<University> universityCatalog;

    public UniversityCatalog() {
        universityCatalog = new FinalArrayList<University>();
    }

    public ArrayList<University> getUniversityCatalog() {
        return universityCatalog;
    }
    
    public University addUniversity(){
        University university = new University();
        universityCatalog.add(university);
        return university;
    }
}
