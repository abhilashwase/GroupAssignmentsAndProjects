/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Abhilash Wase
 */
public class Customer {
    private int customerId;
    private int flightId;
    private String customerName;
    private int bookingId;
    private String journeyDate;
    private String seatNo;
    private double price;
    private String fromLocation;
    private String toLocation;
    private String scheduleTime;

    public Customer(int customerId, int flightId, String customerName, int bookingId, String journeyDate, String seatNo, double price,String fromLocation,String toLocation, String scheduleTime) {
        this.customerId=customerId;
        this.flightId=flightId;
        this.customerName=customerName;
        this.bookingId=bookingId;
        this.journeyDate=journeyDate;
        this.seatNo=seatNo;
        this.price = price;
        this.fromLocation =fromLocation;
        this.toLocation = toLocation;
        this.scheduleTime = scheduleTime;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getFlightId() {
        return flightId;
    }

    public void setFlightId(int flightId) {
        this.flightId = flightId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public String getJourneyDate() {
        return journeyDate;
    }

    public void setJourneyDate(String journeyDate) {
        this.journeyDate = journeyDate;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
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

    public String getScheduleTime() {
        return scheduleTime;
    }

    public void setScheduleTime(String scheduleTime) {
        this.scheduleTime = scheduleTime;
    }
    
    
    @Override
    public String toString() {
        return  String.valueOf(customerId) ;
    }
}
