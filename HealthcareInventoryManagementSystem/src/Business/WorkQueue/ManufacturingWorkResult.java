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
public class ManufacturingWorkResult extends WorkRequest{
    private String kitType;
    private ManufacturedKits manufacturedKits;

    public String getKitType() {
        return kitType;
    }

    public void setKitType(String kitType) {
        this.kitType = kitType;
    }

    public ManufacturedKits getManufacturedKits() {
        return manufacturedKits;
    }

    public void setManufacturedKits(ManufacturedKits manufacturedKits) {
        this.manufacturedKits = manufacturedKits;
    }

    @Override
    public String toString() {
        return  kitType ;
    }
    
    
    
}
