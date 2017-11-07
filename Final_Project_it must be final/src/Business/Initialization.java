/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Medicine.Drug;
import Business.Medicine.DrugCatalog;
import Business.Medicine.Ingredients;
import Business.Medicine.IngredientsCatalog;
import Business.Volunteer.Volunteer;
import Business.Volunteer.VolunteerCatalog;

/**
 *
 * @author Eric
 */
public class Initialization {
    
    public static VolunteerCatalog Initialization_VolunteerCatalog(){
        VolunteerCatalog volunteerCatalog = new VolunteerCatalog();
        
        Volunteer v1 = new Volunteer();
        v1.setName("Paul");
        v1.setGender("M");
        v1.setBirthday("1/5/1988");
        v1.setAddress("11 Tremont St, Boston, MA");
        v1.setMobile("6175951110");
        v1.setEmail("6175951110@gmail.com");
        v1.setHealthReport("Health Level: 1");
        v1.setStatus("Available");
        volunteerCatalog.addVolunteer(v1);
        
        Volunteer v2 = new Volunteer();
        v2.setName("Bosh");
        v2.setGender("M");
        v2.setBirthday("1/9/1988");
        v2.setAddress("13 Tremont St, Boston, MA");
        v2.setMobile("6175951111");
        v2.setEmail("6175951111@gmail.com");
        v2.setHealthReport("Health Level: 1");
        v2.setStatus("Available");
        volunteerCatalog.addVolunteer(v2);
        
        Volunteer v3 = new Volunteer();
        v3.setName("James");
        v3.setGender("M");
        v3.setBirthday("1/15/1988");
        v3.setAddress("20 Tremont St, Boston, MA");
        v3.setMobile("6175951112");
        v3.setEmail("6175951112@gmail.com");
        v3.setHealthReport("Health Level: 2");
        v3.setStatus("Available");
        volunteerCatalog.addVolunteer(v3);
        
        Volunteer v4 = new Volunteer();
        v4.setName("George");
        v4.setGender("M");
        v4.setBirthday("3/5/1988");
        v4.setAddress("125 Tremont St, Boston, MA");
        v4.setMobile("6175951113");
        v4.setEmail("6175951113@gmail.com");
        v4.setHealthReport("Health Level: 1");
        v4.setStatus("Available");
        volunteerCatalog.addVolunteer(v4);
        
        Volunteer v5 = new Volunteer();
        v5.setName("Tim");
        v5.setGender("M");
        v5.setBirthday("9/5/1986");
        v5.setAddress("19 Tremont St, Boston, MA");
        v5.setMobile("6175951115");
        v5.setEmail("6175951115@gmail.com");
        v5.setHealthReport("Health Level: 3");
        v5.setStatus("Available");
        volunteerCatalog.addVolunteer(v5);
        
        Volunteer v6 = new Volunteer();
        v6.setName("Jenny");
        v6.setGender("F");
        v6.setBirthday("7/9/1988");
        v6.setAddress("65 Tremont St, Boston, MA");
        v6.setMobile("6175951116");
        v6.setEmail("6175951116@gmail.com");
        v6.setHealthReport("Health Level: 1");
        v6.setStatus("Available");
        volunteerCatalog.addVolunteer(v6);
        
        Volunteer v7 = new Volunteer();
        v7.setName("Marry");
        v7.setGender("F");
        v7.setBirthday("7/15/1988");
        v7.setAddress("65 Tremont St, Boston, MA");
        v7.setMobile("6175951117");
        v7.setEmail("6175951117@gmail.com");
        v7.setHealthReport("Health Level: 5");
        v7.setStatus("Available");
        volunteerCatalog.addVolunteer(v7);
        
        Volunteer v8 = new Volunteer();
        v8.setName("Sunnie");
        v8.setGender("F");
        v8.setBirthday("7/9/1991");
        v8.setAddress("66 Tremont St, Boston, MA");
        v8.setMobile("6175951118");
        v8.setEmail("6175951118@gmail.com");
        v8.setHealthReport("Health Level: 1");
        v8.setStatus("Available");
        volunteerCatalog.addVolunteer(v8);
        
        Volunteer v9 = new Volunteer();
        v9.setName("Laury");
        v9.setGender("F");
        v9.setBirthday("11/9/1988");
        v9.setAddress("73 Tremont St, Boston, MA");
        v9.setMobile("6175951119");
        v9.setEmail("6175951119@gmail.com");
        v9.setHealthReport("Health Level: 2");
        v9.setStatus("Available");
        volunteerCatalog.addVolunteer(v9);
        
        return volunteerCatalog;
    }
    
    public static DrugCatalog Initialization_DrugCatalog(){
        DrugCatalog drugCatalog = new DrugCatalog();
        
        Drug drug_01 = new Drug();
        drug_01.setName("Atorvastatin Calcium");
        drug_01.setType("Rx");
        drug_01.setDurgUsage("");
        drug_01.setIngredientslist(Initialization.Initialization_IngredientsCatalog_1());
        drugCatalog.addDrug(drug_01);
        
        Drug drug_02 = new Drug();
        drug_02.setName("Budesonide");
        drug_02.setType("Rx");
        drug_02.setDurgUsage("");
        drug_02.setIngredientslist(Initialization.Initialization_IngredientsCatalog_2());
        drugCatalog.addDrug(drug_02);
        
        Drug drug_03 = new Drug();
        drug_03.setName("Celecoxib");
        drug_03.setType("Rx");
        drug_03.setDurgUsage("");
        drug_03.setIngredientslist(Initialization.Initialization_IngredientsCatalog_3());
        drugCatalog.addDrug(drug_03);
        
        Drug drug_04 = new Drug();
        drug_04.setName("Ciprofloxacin Hydrochloride");
        drug_04.setType("Rx");
        drug_04.setDurgUsage("");
        drug_04.setIngredientslist(Initialization.Initialization_IngredientsCatalog_4());
        drugCatalog.addDrug(drug_04);
        
        Drug drug_05 = new Drug();
        drug_05.setName("Ciprofloxacin USP");
        drug_05.setType("Rx");
        drug_05.setDurgUsage("");
        drug_05.setIngredientslist(Initialization.Initialization_IngredientsCatalog_5());
        drugCatalog.addDrug(drug_05);
        
        Drug drug_06 = new Drug();
        drug_06.setName("Esomeprazole Magnesium Trihydrate");
        drug_06.setType("Rx");
        drug_06.setDurgUsage("");
        drug_06.setIngredientslist(Initialization.Initialization_IngredientsCatalog_6());
        drugCatalog.addDrug(drug_06);
        
        Drug drug_07 = new Drug();
        drug_07.setName("Fenofibrate");
        drug_07.setType("Rx");
        drug_07.setDurgUsage("");
        drug_07.setIngredientslist(Initialization.Initialization_IngredientsCatalog_7());
        drugCatalog.addDrug(drug_07);
        
        Drug drug_08 = new Drug();
        drug_08.setName("Fluticasone Propionate");
        drug_08.setType("OTC");
        drug_08.setDurgUsage("");
        drug_08.setIngredientslist(Initialization.Initialization_IngredientsCatalog_8());
        drugCatalog.addDrug(drug_08);
        
        Drug drug_09 = new Drug();
        drug_09.setName("Furosemide");
        drug_09.setType("OTC");
        drug_09.setDurgUsage("");
        drug_09.setIngredientslist(Initialization.Initialization_IngredientsCatalog_9());
        drugCatalog.addDrug(drug_09);
        
        Drug drug_10 = new Drug();
        drug_10.setName("Gabapentin");
        drug_10.setType("OTC");
        drug_10.setDurgUsage("");
        drug_10.setIngredientslist(Initialization.Initialization_IngredientsCatalog_10());
        drugCatalog.addDrug(drug_10);
        
        Drug drug_11 = new Drug();
        drug_11.setName("Heparin Sodium");
        drug_11.setType("OTC");
        drug_11.setDurgUsage("");
        drug_11.setIngredientslist(Initialization.Initialization_IngredientsCatalog_11());
        drugCatalog.addDrug(drug_11);
        
        Drug drug_12 = new Drug();
        drug_12.setName("Hydrochlorothiazide USP");
        drug_12.setType("OTC");
        drug_12.setDurgUsage("");
        drug_12.setIngredientslist(Initialization.Initialization_IngredientsCatalog_12());
        drugCatalog.addDrug(drug_12);
        
        Drug drug_13 = new Drug();
        drug_13.setName("Ibuprofen");
        drug_13.setType("OTC");
        drug_13.setDurgUsage("");
        drug_13.setIngredientslist(Initialization.Initialization_IngredientsCatalog_13());
        drugCatalog.addDrug(drug_13);
        
        Drug drug_14 = new Drug();
        drug_14.setName("Levetiracetam");
        drug_14.setType("OTC");
        drug_14.setDurgUsage("");
        drug_14.setIngredientslist(Initialization.Initialization_IngredientsCatalog_14());
        drugCatalog.addDrug(drug_14);
        
        Drug drug_15 = new Drug();
        drug_15.setName("Lidocaine HCl");
        drug_15.setType("OTC");
        drug_15.setDurgUsage("");
        drug_15.setIngredientslist(Initialization.Initialization_IngredientsCatalog_15());
        drugCatalog.addDrug(drug_15);
        
        return drugCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_1(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_4());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_7());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_2(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_4());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_6());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_3(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_4());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_5());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_4(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_15());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_5(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_14());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_6(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_13());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_7(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_12());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_8(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_11());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_9(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_10());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_10(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_9());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_11(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_8());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_12(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_7());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_13(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_6());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_14(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_5());
        
        return ingredientsCatalog;
    }
    
    public static IngredientsCatalog Initialization_IngredientsCatalog_15(){
        IngredientsCatalog ingredientsCatalog = new IngredientsCatalog();
        ingredientsCatalog.addIngredients(Initialization_Ingredients_1());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_2());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_3());
        ingredientsCatalog.addIngredients(Initialization_Ingredients_4());
        
        return ingredientsCatalog;
    }
  
    //***********************************************************************************
    
    public static Ingredients Initialization_Ingredients_1(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Cellulose sodium");
        ingredients.setFunction("Thickener");
        ingredients.setActiveDose("0.5mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_2(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Sorbitol");
        ingredients.setFunction("Moisturize");
        ingredients.setActiveDose("0.02mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_3(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Glycerinum");
        ingredients.setFunction("Moisturize");
        ingredients.setActiveDose("0.02mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_4(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Gelatin");
        ingredients.setFunction("Thickener");
        ingredients.setActiveDose("0.5mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_5(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Aspirin");
        ingredients.setFunction("Antipyretic,Analgesia,Anticancer");
        ingredients.setActiveDose("10mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_6(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Penicillin");
        ingredients.setFunction("Antiphlogosis");
        ingredients.setActiveDose("10mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_7(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Ceftazidime");
        ingredients.setFunction("Antiphlogosis");
        ingredients.setActiveDose("8mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_8(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Morphine");
        ingredients.setFunction("Antipyretic,Analgesia");
        ingredients.setActiveDose("2mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_9(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Pseudo ephedrine");
        ingredients.setFunction("Relieve a cold");
        ingredients.setActiveDose("3mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_10(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Diphenhydramine");
        ingredients.setFunction("Antiallergic");
        ingredients.setActiveDose("6mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_11(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Chlorpheniramine");
        ingredients.setFunction("Antiallergic");
        ingredients.setActiveDose("5mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_12(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Codeine");
        ingredients.setFunction("relieve a cough");
        ingredients.setActiveDose("1mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_13(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Pilocarpine");
        ingredients.setFunction("Treat glaucoma");
        ingredients.setActiveDose("3mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_14(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Amantadine");
        ingredients.setFunction("Antiviral");
        ingredients.setActiveDose("3mg");
        
        return ingredients;
    }
    
    public static Ingredients Initialization_Ingredients_15(){
        Ingredients ingredients = new Ingredients();
        ingredients.setName("Aluminium Hydroxide");
        ingredients.setFunction("Hyperacidity");
        ingredients.setActiveDose("1.5mg");
        
        return ingredients;
    }
}
