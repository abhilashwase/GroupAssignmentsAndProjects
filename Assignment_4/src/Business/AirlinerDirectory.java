/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Abhilash Wase
 */
public class AirlinerDirectory {
    
    private List<Airliner> airlinerList ;
    public AirlinerDirectory(){
        airlinerList = new ArrayList<>();
      
        Airplane airplane1 =  new Airplane(123,"BOS","NHS","8:00 PM",150,"Delta",9,100);
        Airplane airplane2 = new Airplane(111,"SF","BOS","10:00 AM",150,"United",2,500);
        Airplane airplane3 = new Airplane(143,"DAL","SMF","8:30 PM",150,"Delta",1,200);
        Airplane airplane4 = new Airplane(456,"OAK","SFO","8:00 PM",150,"United",2,100);
        Airplane airplane5 = new Airplane(874,"DEN","SJC","6:30 AM",150,"Delta",3,60);
        Airplane airplane6 = new Airplane(285,"SF","NHS","8:00 PM",150,"United",5,150);
        Airplane airplane7 = new Airplane(753,"DAL","SFO","8:00 PM",150,"AmericanAirlines",6,75);
        Airplane airplane8 = new Airplane(125,"SF","OAK","9:00 AM",150,"AmericanAirlines",4,450);
        Airplane airplane9 = new Airplane(896,"SJC","SMF","6:00 PM",150,"AmericanAirlines",8,100);
        Airplane airplane10 =new Airplane(412,"OAK","NHS","3:00 AM",150,"AmericanAirlines",7,150);
        Airplane airplane11= new Airplane(753,"DAL","SFO","2:00 AM",150,"SouthWest",6,100);
        Airplane airplane12= new Airplane(743,"DEN","OAK","8:00 PM",150,"SouthWest",2,100);
        Airplane airplane13 =new Airplane(896,"SMF","SJC","9:00 AM",150,"SouthWest",1,150);
        Airplane airplane14 =new Airplane(437,"SF","NHS","6:00 AM",150,"United",7,800);
        Airplane airplane15 =new Airplane(963,"OAK","SFO","9:00 PM",150,"JetBlue",4,100);
        Airplane airplane16= new Airplane(145,"DEN","SJC","12:00 AM",150,"JetBlue",3,75);
        Airplane airplane17= new Airplane(489,"SF","NHS","4:00 PM",150,"JetBlue",5,120);
        List<Airplane>flightFleet = new ArrayList<>();
       
        List<Airplane> flightFleet1 = new ArrayList<>();
        
        List<Airplane> flightFleet2 = new ArrayList<>();
       
        List<Airplane> flightFleet3 = new ArrayList<>();
        List<Airplane> flightFleet4 = new ArrayList<>();
        
        
        flightFleet.add(airplane1);
        flightFleet.add(airplane3);
        flightFleet.add(airplane5);
        flightFleet1.add(airplane2);
        flightFleet1.add(airplane4);
        flightFleet1.add(airplane6);
        flightFleet1.add(airplane14);
        flightFleet2.add(airplane7);
        flightFleet2.add(airplane8);
        flightFleet2.add(airplane9);
        flightFleet2.add(airplane10);
        flightFleet3.add(airplane11);
        flightFleet3.add(airplane12);
        flightFleet3.add(airplane13);
        flightFleet4.add(airplane15);
        flightFleet4.add(airplane16);
        flightFleet4.add(airplane17);
        
        Airliner airliner1 = new Airliner("Delta",flightFleet.size(),flightFleet);
        Airliner airliner2 = new Airliner("United",flightFleet1.size(),flightFleet1);
        Airliner airliner3 = new Airliner("AmericanAirlines",flightFleet2.size(),flightFleet2);
        Airliner airliner4 = new Airliner("SouthWest",flightFleet3.size(),flightFleet3);
        Airliner airliner5 = new Airliner("JetBlue",flightFleet4.size(),flightFleet4);
         
        airlinerList.add(airliner1);
        airlinerList.add(airliner2);
        airlinerList.add(airliner3);
        airlinerList.add(airliner4);
        airlinerList.add(airliner5);
        
    }
    public List<Airliner> getAirlinerList() {
        return airlinerList;
    }

    public void setAirlinerList(List<Airliner> airlinerList) {
        this.airlinerList = airlinerList;
    }
    public Airliner addAirline(Airliner airliner){
         airlinerList.add(airliner);
         return airliner;
     } 
    public void deleteAirliner(Airliner airliner){
         airlinerList.remove(airliner);
     }
    
}
