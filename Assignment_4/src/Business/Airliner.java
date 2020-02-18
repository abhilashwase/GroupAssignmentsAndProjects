/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.List;

/**
 *
 * @author Abhilash Wase
 */
public class Airliner {
    
    private String airlinerName;
    private int totalFlightsPerDay;
    private List<Airplane> flightFleet;
    

    public Airliner(String airlinerName, int totalFlightsPerDay, List<Airplane> flightFleet) {
        this.airlinerName = airlinerName;
        this.totalFlightsPerDay = totalFlightsPerDay;
        this.flightFleet = flightFleet;
    }
   
    
    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public int getTotalFlightsPerDay() {
        return totalFlightsPerDay;
    }

    public void setTotalFlightsPerDay(int totalFlightsPerDay) {
        this.totalFlightsPerDay = totalFlightsPerDay;
    }

    public List<Airplane> getFlightFleet() {
        return flightFleet;
    }

    public void setFlightFleet(List<Airplane> flightFleet) {
        this.flightFleet = flightFleet;
    }
    
    @Override
    public String toString() {
        return  airlinerName ;
    }
    
}
