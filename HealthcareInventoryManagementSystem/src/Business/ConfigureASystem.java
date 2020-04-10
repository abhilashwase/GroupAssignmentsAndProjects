/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Employee.Employee;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;

/**
 *
 * @author Abhilash Wase
 */
public class ConfigureASystem {
     public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();

        
        Employee employee = system.getEmployeeDirectory().createEmployee("abhi@gmail.com");
        String salt = PasswordUtils.getSalt(30);
        String mySecurePassword = PasswordUtils.generateSecurePassword("sysadmin", salt);
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("abhi@gmail.com", mySecurePassword, employee, new SystemAdminRole(),salt);
        
        return system;
    }
}
