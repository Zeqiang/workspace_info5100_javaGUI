/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Medicine;

import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class IngredientsCatalog {
    
    ArrayList<Ingredients> ingredientsList;
      

    public IngredientsCatalog() {
        ingredientsList = new ArrayList<Ingredients>();
    }
    
    public Ingredients addIngredients(Ingredients ingredients){
        ingredientsList.add(ingredients);
        return ingredients;
    }

    public ArrayList<Ingredients> getIngredientsList() {
        return ingredientsList;
    }
}
