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
public class Airplane {
    
    private int flightId;
    private String fromLocation;
    private String toLocation;
    private String flightSchedule;
    private int totalNoOfSeats;
    private String airlinerName;
    private int noOfSeatsAvalaible;
    private List<SeatAssignment> seatingList = new ArrayList<>();
    private String seatNumber;
    private double price;

    public Airplane(int flightId, String fromLocation, String toLocation, String flightSchedule, int totalNoOfSeats, String airlinerName, int noOfSeatsAvalaible, double price) {
        this.flightId = flightId;
        this.fromLocation = fromLocation;
        this.toLocation = toLocation;
        this.flightSchedule = flightSchedule;
        this.totalNoOfSeats = totalNoOfSeats;
        this.airlinerName = airlinerName;
        this.noOfSeatsAvalaible = noOfSeatsAvalaible;
        this.price = price;
        
    }
    
    
    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getFromLocation() {
        return fromLocation;
    }

    public void setFromLocation(String fromLocation) {
        this.fromLocation = fromLocation;
    }

    public String getToLocation() {
        return toLocation;
    }

    public void setToLocation(String toLocation) {
        this.toLocation = toLocation;
    }

    public String getFlightSchedule() {
        return flightSchedule;
    }

    public void setFlightSchedule(String flightSchedule) {
        this.flightSchedule = flightSchedule;
    }

    public int getTotalNoOfSeats() {
        return totalNoOfSeats;
    }

    public void setTotalNoOfSeats(int totalNoOfSeats) {
        this.totalNoOfSeats = totalNoOfSeats;
    }

    public String getAirlinerName() {
        return airlinerName;
    }

    public void setAirlinerName(String airlinerName) {
        this.airlinerName = airlinerName;
    }

    public List<SeatAssignment> getSeatingList() {
        return seatingList;
    }

    public void setSeatingList(List<SeatAssignment> seatingList) {
        this.seatingList = seatingList;
    }

    public int getNoOfSeatsAvalaible() {
        return noOfSeatsAvalaible;
    }

    public void setNoOfSeatsAvalaible(int noOfSeatsAvalaible) {
        this.noOfSeatsAvalaible = noOfSeatsAvalaible;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    
    @Override
    public String toString() {
        return  String.valueOf(flightId);
    }
    
}
