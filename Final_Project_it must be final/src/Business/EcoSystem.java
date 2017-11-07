/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author Eric
 */
public class EcoSystem extends Organization {
    
    private static EcoSystem business;
    private ArrayList<Network> networkList;

    public ArrayList<Network> getNetworkList() {
        return networkList;
    }
    
    public static EcoSystem getInstance(){
        if(business == null){
            business = new EcoSystem();
        }
        return business;
    }
    
    public EcoSystem(){
        super(null);
        networkList = new ArrayList<Network>();
    }
    
    public Network createNetwork(){
        Network network = new Network();
        networkList.add(network);
        return network;
    }
    
//    public boolean checkIfUserNameIsUnique(String userName){
//        if(!this.getUserAccountDirectory().checkIfUsernameIsUnique(userName)){
//            return false;
//        }
//        for(Network network : networkList){
//            
//        }
//        return true;
//    }
    
//    @Override
//    public ArrayList<CompanyRole> getSupportedRole() {
//        ArrayList<CompanyRole> roleList = new ArrayList<CompanyRole>();
//        roleList.add(new SystemAdminRole());
//        return roleList;
//    } 

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
