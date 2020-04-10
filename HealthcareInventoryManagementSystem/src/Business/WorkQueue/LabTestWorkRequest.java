/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.WorkQueue;

/**
 *
 * @author Abhilash Wase
 */
public class LabTestWorkRequest extends WorkRequest{
    
    private String testResult;
    private ManufacturedKits manufacturedKits;

    public String getTestResult() {
        return testResult;
    }

    public void setTestResult(String testResult) {
        this.testResult = testResult;
    }

    public ManufacturedKits getManufacturedKits() {
        return manufacturedKits;
    }

    public void setManufacturedKits(ManufacturedKits manufacturedKits) {
        this.manufacturedKits = manufacturedKits;
    }

    

    

    
    
    
}
