/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author Abhilash Wase
 */
public class UserDirectory {
    private ArrayList<UserAccount> userAccountList;

    public UserDirectory() {
        userAccountList = new ArrayList<>();
        UserAccount userAccount1 = new UserAccount("delta@gmail.com","Delta#123","Delta","Airliner");
        UserAccount userAccount2 = new UserAccount("united@gmail.com","United#123","United","Airliner");
        UserAccount userAccount3 = new UserAccount("americanairlines@gmail.com","AmericanAirlines#123","AmericanAirlines","Airliner");
        UserAccount userAccount4 = new UserAccount("southwest@gmail.com","SouthWest#123","SouthWest","Airliner");
        UserAccount userAccount5 = new UserAccount("jetblue@gmail.com","JetBlue#123","JetBlue","Airliner");
      
        UserAccount userAccount6 = new UserAccount("neutravels@gmail.com", "Neu#123", "NEU","Travel Agent" );
        
        userAccountList.add(userAccount1);
        userAccountList.add(userAccount2);
        userAccountList.add(userAccount3);
        userAccountList.add(userAccount4);
        userAccountList.add(userAccount5);
        userAccountList.add(userAccount6);
       
        
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
   public UserAccount authenticateUser(String username, String password,String name, String role){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password) && ua.getName().equals(name) && ua.getRole().equals(role)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, String airlinerName, String role){
        UserAccount userAccount = new UserAccount(username,password,airlinerName,role);
        userAccountList.add(userAccount);
        return userAccount;
    }
}
