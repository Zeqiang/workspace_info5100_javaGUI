/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class DegreeCatalog {
    
    private ArrayList<Degree> degreeCatalog;

    public DegreeCatalog() {
        degreeCatalog = new ArrayList<Degree>();
    }

    public ArrayList<Degree> getDegreeCatalog() {
        return degreeCatalog;
    }
    
    public Degree addDegree(){
        Degree degree = new Degree();
        degreeCatalog.add(degree);
        return degree;
    }
    
    public void removeDegree(Degree degree){
        degreeCatalog.remove(degree);
    }
}
