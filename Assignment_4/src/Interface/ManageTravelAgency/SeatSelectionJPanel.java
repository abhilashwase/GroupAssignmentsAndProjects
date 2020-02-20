/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageTravelAgency;

import Business.AirlinerDirectory;
import Business.Airplane;
import Business.Customer;
import Business.CustomerDirectory;
import java.text.DateFormat;
import java.text.NumberFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import org.jdesktop.swingx.JXDatePicker;


/**
 *
 * @author kesha
 */
public class SeatSelectionJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SeatSelectionJPanel
     */
    private JPanel panelRight;
    private AirlinerDirectory airlinerDirectory;
    private Airplane airplane;
    private List<Airplane> flightFleet;
     private CustomerDirectory customerList;
     private String seatNo = "";
    public SeatSelectionJPanel(JPanel panelRight,AirlinerDirectory airlinerDirectory,Airplane airplane,List<Airplane> flightFleet,CustomerDirectory customerList) {
        initComponents();
        this.panelRight = panelRight;
        this.airlinerDirectory = airlinerDirectory;
        this.airplane = airplane;
        this.flightFleet = flightFleet;
        this.customerList = customerList;
        
        flightIdJText.setText(String.valueOf(airplane.getFlightId()));
        fromLocationJText.setText(airplane.getFromLocation());
        toLocationJText.setText(airplane.getToLocation());
        String scheduledTime = airplane.getFlightSchedule();
        String[] row = scheduledTime.split(":");
        spinnerHour.setValue(row[0]);
        String min = row[1];
        spinnerMinute.setValue(min.substring(0, 2));
        spinnerAmPm.setValue(scheduledTime.matches("PM")?"PM":"AM");
        spinnerHour.setEnabled(false);
        spinnerMinute.setEnabled(false);
        spinnerAmPm.setEnabled(false);
        
        
    }
    public void rescheduleBooking(Customer cust){
      bookingIDJText.setText(String.valueOf(cust.getBookingId()));
      String stringDate = cust.getJourneyDate();
         try {
             Date date = new SimpleDateFormat("yyyy-MM-dd").parse(stringDate);
              jXDatePicker1.setDate(date);
         } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "Invalid Date");
         }
        String scheduledTime = airplane.getFlightSchedule();
        String[] row = scheduledTime.split(":");
        spinnerHour.setValue(row[0]);
         String min = row[1];
        spinnerMinute.setValue(min.substring(0, 2));
        spinnerAmPm.setValue(scheduledTime.matches("PM")?"PM":"AM");
        customerIdJText.setText(String.valueOf(cust.getCustomerId()));
        seatNoJText.setText(cust.getSeatNo());
        customerNameJText.setText(cust.getCustomerName());
        priceJText.setText(String.valueOf(cust.getPrice()));
        customerIdJText.setEnabled(false);
        spinnerHour.setEnabled(false);
        spinnerMinute.setEnabled(false);
        spinnerAmPm.setEnabled(false);
         
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        flightIdJText = new javax.swing.JTextField();
        fromLocationJText = new javax.swing.JTextField();
        toLocationJText = new javax.swing.JTextField();
        spinnerHour = new javax.swing.JSpinner();
        spinnerMinute = new javax.swing.JSpinner();
        spinnerAmPm = new javax.swing.JSpinner();
        seatPreferenceComboBox = new javax.swing.JComboBox<>();
        seatSelectionComboBox = new javax.swing.JComboBox<>();
        jLabel12 = new javax.swing.JLabel();
        customerIdJText = new javax.swing.JTextField();
        customerNameJText = new javax.swing.JTextField();
        bookingIDJText = new javax.swing.JTextField();
        seatNoJText = new javax.swing.JTextField();
        priceJText = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jXDatePicker1 = new org.jdesktop.swingx.JXDatePicker();

        jButton1.setText("Book Your Flight");

        jLabel1.setText("Flight ID :");

        jLabel2.setText("From Location :");

        jLabel3.setText("To Location :");

        jLabel4.setText("Travel Date :");

        jLabel5.setText("Seat Preference :");

        jLabel6.setText("Schedule Time :");

        jLabel7.setText("Customer Name :");

        jLabel8.setText("Customer ID :");

        jLabel9.setText("Booking ID :");

        jLabel10.setText("Seat Number :");

        jLabel11.setText("Price :");

        spinnerHour.setModel(new javax.swing.SpinnerListModel(new String[] {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"}));

        spinnerMinute.setModel(new javax.swing.SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

        spinnerAmPm.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));

        seatPreferenceComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Window", "Middle", "Aisle" }));

        seatSelectionComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Row 1", "Row 2", "Row 3", "Row 4", "Row 5", "Row 6", "Row 7", "Row 8", "Row 9", "Row 10", "Row 11", "Row 12", "Row 13", "Row 14", "Row 15", "Row 16", "Row 17", "Row 18", "Row 19", "Row 20", "Row 21", "Row 22", "Row 23", "Row 24", "Row 25" }));

        jLabel12.setText("Row Number :");

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        confirmButton.setText("Confirm");
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(confirmButton)
                        .addGap(46, 46, 46))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(162, 162, 162)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(seatPreferenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(5, 5, Short.MAX_VALUE)
                                            .addComponent(spinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(spinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(spinnerAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jLabel3)
                                            .addGap(153, 153, 153))
                                        .addGroup(layout.createSequentialGroup()
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel8)
                                                .addComponent(jLabel7)
                                                .addComponent(jLabel9)
                                                .addComponent(jLabel10)
                                                .addComponent(jLabel11))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(priceJText, javax.swing.GroupLayout.DEFAULT_SIZE, 99, Short.MAX_VALUE)
                                                .addComponent(seatNoJText)
                                                .addComponent(bookingIDJText)
                                                .addComponent(customerNameJText)
                                                .addComponent(customerIdJText)))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel1))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(flightIdJText)
                                            .addComponent(fromLocationJText, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(toLocationJText, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(backBtn)
                            .addGap(210, 210, 210)
                            .addComponent(jButton1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addGap(60, 60, 60)
                .addComponent(seatSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(backBtn))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(flightIdJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(fromLocationJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(toLocationJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jXDatePicker1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(spinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(seatPreferenceComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel12)
                        .addComponent(seatSelectionComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(customerIdJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(customerNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(bookingIDJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(seatNoJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(priceJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
        int flightId = Integer.parseInt(flightIdJText.getText());
        int customerId = 0;
        String selectedTime = "";
        String fromLocation = fromLocationJText.getText();
        String toLocation = toLocationJText.getText();
        Date oDate = jXDatePicker1.getDate();
        if(oDate == null){
            JOptionPane.showMessageDialog(null, "Please Select Date to Travel");
            return;
        }
       DateFormat oDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String szDate = oDateFormat.format(oDate);
             
        String seat = seatPreferenceComboBox.getSelectedItem().toString();
        String row = seatSelectionComboBox.getSelectedItem().toString();

        if(seat.equals("")||seat == null){
            JOptionPane.showMessageDialog(null, "Please Select a seat");
           return;
        }
        if(row.equals("")||row == null){
            JOptionPane.showMessageDialog(null, "Please Select a row");
            return;
        }
        if(szDate.equals("")||szDate == null){
            JOptionPane.showMessageDialog(null, "Please Select a Date to Book a Flight");
            throw new NumberFormatException("Please select a Date to book a Flight");
        }
        if(customerIdJText.getText().equals("")||customerIdJText.getText() == null){
            JOptionPane.showMessageDialog(null, "Please enter Customer Id");
                  return;      
        }
        try{
         customerId = Integer.parseInt(customerIdJText.getText());
        }
        catch(NumberFormatException e){
             JOptionPane.showMessageDialog(null, "Please enter valid customer id");
             return;
        }
        
        if(customerNameJText.getText().equals("")||customerNameJText.getText() == null){
            JOptionPane.showMessageDialog(null, "Please enter Customer Name");
            return;
        }
       SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm a");
         try {
             Date date1 = sdf.parse(szDate+" "+spinnerHour.getValue()+":"+spinnerMinute.getValue()+" "+spinnerAmPm.getValue());
             Date date2 = new Date();
             String date = sdf.format(date2);
             date2 = sdf.parse(date);
            if (date1.compareTo(date2) <= 0) {
             JOptionPane.showMessageDialog(null, "Please enter Valid Date");
             return;
            }
         } catch (ParseException ex) {
            JOptionPane.showMessageDialog(null, "No Flights available for selected Date. Please enter Valid Date");
             return;
         }
       
        
        int rowNo = 0;
        int bookingId = 0;
        
        List<String> seatList = new ArrayList<String>();
        for(Customer customer : customerList.getCustomerList()){
           
            
            if(bookingIDJText.getText()==null||bookingIDJText.getText().equals("")){
                 bookingId = ThreadLocalRandom.current().nextInt(10000, 99999);
                if(customer.getBookingId()==bookingId){
                bookingId = ThreadLocalRandom.current().nextInt(10000, 99999);
                }
            }else{
               try{
                 bookingId = Integer.parseInt(bookingIDJText.getText());
                  }
               catch(NumberFormatException e){
               JOptionPane.showMessageDialog(null, "Invalid Booking Id");
                return;
              } 
            }
            if(customer.getBookingId()==bookingId){
                customerList.getCustomerList().remove(customer);
                break;
            }
             try {
               rowNo = ((Number)NumberFormat.getInstance().parse(customer.getSeatNo())).intValue();
            } catch (ParseException ex) {
                 JOptionPane.showMessageDialog(null, "Invalid Seat");
                return;
            }
            if(customer.getFlightId()==flightId && customer.getJourneyDate().equals(szDate)){
                if(seatSelectionComboBox.getSelectedIndex()+1==rowNo){
                    seatList.add(customer.getSeatNo());
                }
            }
             
        }
                 if(seatPreferenceComboBox.getSelectedIndex()==0 ){
                  if(((seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"A"))&&seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"F"))){
                    JOptionPane.showMessageDialog(null, "Selected Seat is not Available. Please Select another seat.");  
                    return;
                    }
                  else{
                        if(seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"A")){
                             this.seatNo = String.valueOf((seatSelectionComboBox.getSelectedIndex()+1)+"F");
                        }
                        else{
                           this.seatNo = String.valueOf((seatSelectionComboBox.getSelectedIndex()+1)+"A");  
                        }
                    }
                }
                if(seatPreferenceComboBox.getSelectedIndex()==1 ){
                  if(((seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"B"))&&seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"E"))){
                    JOptionPane.showMessageDialog(null, "Selected Seat is not Available. Please Select another seat.");  
                    return;
                    }
                  else{
                        if(seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"B")){
                             this.seatNo = String.valueOf((seatSelectionComboBox.getSelectedIndex()+1)+"E");
                        }
                        else{
                           this.seatNo = String.valueOf((seatSelectionComboBox.getSelectedIndex()+1)+"B");  
                        }
                    }
                }
                if(seatPreferenceComboBox.getSelectedIndex()==2 ){
                    if(((seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"C"))&&seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"D"))){
                    JOptionPane.showMessageDialog(null, "Selected Seat is not Available. Please Select another seat.");  
                    return;
                    }
                  else{
                        if(seatList.contains(seatPreferenceComboBox.getSelectedIndex()+1+"C")){
                             this.seatNo = String.valueOf((seatSelectionComboBox.getSelectedIndex()+1)+"D");
                        }
                        else{
                           this.seatNo = String.valueOf((seatSelectionComboBox.getSelectedIndex()+1)+"C");  
                        }
                    }
          
    }
                double price =0;
        for (Airplane airplane : flightFleet) {
            if(flightId==airplane.getFlightId()){
                airplane.setNoOfSeatsAvalaible(airplane.getNoOfSeatsAvalaible()+1);
                seatNoJText.setText(this.seatNo);
                priceJText.setText(String.valueOf(airplane.getPrice()));
                price = airplane.getPrice();
               if(!this.seatNo.equals("")){
               JOptionPane.showMessageDialog(null, "Successfully booked a Seat! "+"Have a nice Journey.");
               } 
            }
        }
        bookingIDJText.setText(String.valueOf(bookingId));
        flightIdJText.setEnabled(false);
        fromLocationJText.setEnabled(false);
        toLocationJText.setEnabled(false);
        jXDatePicker1.setEnabled(false);
        seatPreferenceComboBox.setEnabled(false);
        seatSelectionComboBox.setEnabled(false);
        customerIdJText.setEnabled(false);
        customerNameJText.setEnabled(false);
        spinnerHour.setEnabled(false);
        spinnerMinute.setEnabled(false);
        spinnerAmPm.setEnabled(false);
        
        List<Customer> custList = customerList.getCustomerList();
       
        Customer customer = new Customer(customerId,flightId,customerNameJText.getText(),bookingId,szDate,this.seatNo,price,fromLocation,toLocation,spinnerHour.getValue()+":"+spinnerMinute.getValue()+" "+spinnerAmPm.getValue());
        custList.add(customer);
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JTextField bookingIDJText;
    private javax.swing.JButton confirmButton;
    private javax.swing.JTextField customerIdJText;
    private javax.swing.JTextField customerNameJText;
    private javax.swing.JTextField flightIdJText;
    private javax.swing.JTextField fromLocationJText;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.jdesktop.swingx.JXDatePicker jXDatePicker1;
    private javax.swing.JTextField priceJText;
    private javax.swing.JTextField seatNoJText;
    private javax.swing.JComboBox<String> seatPreferenceComboBox;
    private javax.swing.JComboBox<String> seatSelectionComboBox;
    private javax.swing.JSpinner spinnerAmPm;
    private javax.swing.JSpinner spinnerHour;
    private javax.swing.JSpinner spinnerMinute;
    private javax.swing.JTextField toLocationJText;
    // End of variables declaration//GEN-END:variables
}
