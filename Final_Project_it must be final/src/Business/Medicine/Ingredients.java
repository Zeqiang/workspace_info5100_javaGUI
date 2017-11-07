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
public class Ingredients {
    
    private String name;
    private String function;
    private String ActiveDose;

    public String getActiveDose() {
        return ActiveDose;
    }

    public void setActiveDose(String ActiveDose) {
        this.ActiveDose = ActiveDose;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFunction() {
        return function;
    }

    public void setFunction(String function) {
        this.function = function;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
