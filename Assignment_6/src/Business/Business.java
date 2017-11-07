/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Eric
 */
public class Business {
    
    private static Business business;
    
    private Territory territory;
    private UserAccountDirectory userAccountDirectory;

    public Business() {
        territory = new Territory();
        userAccountDirectory = new UserAccountDirectory();
    }
    
    public static Business getInstance(){
        if(business == null){
            business = new Business();
        }
        return business;
    }
    
    public Territory getTerritory() {
        return territory;
    }

    public void setTerritory(Territory territory) {
        this.territory = territory;
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    } 
}
