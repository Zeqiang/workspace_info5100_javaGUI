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
public class Drug {
    
    private String name;
    private String durgUsage;
    private String type;
    private IngredientsCatalog ingredientslist;

    public Drug() {
        ingredientslist = new IngredientsCatalog();
    }

    public void setIngredientslist(IngredientsCatalog ingredientslist) {
        this.ingredientslist = ingredientslist;
    }

    public IngredientsCatalog getIngredientslist() {
        return ingredientslist;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDurgUsage() {
        return durgUsage;
    }

    public void setDurgUsage(String durgUsage) {
        this.durgUsage = durgUsage;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
