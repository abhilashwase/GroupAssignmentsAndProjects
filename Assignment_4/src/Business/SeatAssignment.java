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
public class SeatAssignment {

    private String seatNo;
    private String seatPreference;

    public SeatAssignment(String seatNo, String seatPreference) {
        this.seatNo = seatNo;
        this.seatPreference = seatPreference;
    }

    public String getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(String seatNo) {
        this.seatNo = seatNo;
    }

    public String getSeatPreference() {
        return seatPreference;
    }

    public void setSeatPreference(String seatPreference) {
        this.seatPreference = seatPreference;
    }

}
