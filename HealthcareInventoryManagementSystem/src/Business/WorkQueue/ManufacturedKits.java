/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Abhilash Wase
 */
public class ManufacturedKits {
    private int numberOfCovidKits = 0;
    private String status;

    public int getNumberOfCovidKits() {
        return numberOfCovidKits;
    }

    public void setNumberOfCovidKits(int numberOfCovidKits) {
        this.numberOfCovidKits = numberOfCovidKits;
    }

    
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
}
