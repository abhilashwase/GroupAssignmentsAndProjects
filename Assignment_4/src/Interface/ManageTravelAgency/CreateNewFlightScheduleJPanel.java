/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageTravelAgency;

import Business.Airliner;
import Business.AirlinerDirectory;
import Business.Airplane;
import Business.UserDirectory;
import Interface.ManageAirliners.ViewAirlinerJPanel;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author kesha
 */
public class CreateNewFlightScheduleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateNewFlightScheduleJPanel
     */
    private JPanel panelRight;
    private AirlinerDirectory airlineDirectory;
    private String airlinerName;
    private UserDirectory userDirectory;
    public CreateNewFlightScheduleJPanel(JPanel panelRight,AirlinerDirectory airlineDirectory, String airlinerName, UserDirectory userDirectory) {
        initComponents();
        this.panelRight = panelRight;
        this.airlineDirectory = airlineDirectory;
        this.airlinerName = airlinerName;
        this.userDirectory = userDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        flightIdJText = new javax.swing.JTextField();
        fromLocationJText = new javax.swing.JTextField();
        priceJText = new javax.swing.JTextField();
        toLocationJText = new javax.swing.JTextField();
        backBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        spinnerHour = new javax.swing.JSpinner();
        spinnerMinute = new javax.swing.JSpinner();
        spinnerAmPm = new javax.swing.JSpinner();

        jLabel1.setText("Create New Flight Schedule");

        jLabel2.setText("Flight ID : ");

        jLabel3.setText("From Location : ");

        jLabel4.setText("To Location : ");

        jLabel5.setText("Scheduled Time : ");

        jLabel6.setText("Price : ");

        backBtn.setText("Back");

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });

        spinnerHour.setModel(new javax.swing.SpinnerListModel(new String[] {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"}));

        spinnerMinute.setModel(new javax.swing.SpinnerListModel(new String[] {"00", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59"}));

        spinnerAmPm.setModel(new javax.swing.SpinnerListModel(new String[] {"AM", "PM"}));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(248, 248, 248)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(spinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(spinnerAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(flightIdJText)
                            .addComponent(fromLocationJText)
                            .addComponent(toLocationJText)
                            .addComponent(priceJText, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(createBtn)))
                .addContainerGap(326, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(backBtn))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(flightIdJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(fromLocationJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(toLocationJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(spinnerHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerMinute, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spinnerAmPm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(priceJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(createBtn)
                .addContainerGap(277, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        flightIdJText.setBorder(new LineBorder(new Color(128,128,128)));
     fromLocationJText.setBorder(new LineBorder(new Color(128,128,128)));
     toLocationJText.setBorder(new LineBorder(new Color(128,128,128)));
     spinnerAmPm.setBorder(new LineBorder(new Color(128,128,128)));
     spinnerHour.setBorder(new LineBorder(new Color(128,128,128)));
     spinnerMinute.setBorder(new LineBorder(new Color(128,128,128)));     
        
        jLabel2.setForeground(Color.black);
        jLabel3.setForeground(Color.black);
        jLabel4.setForeground(Color.black);
        jLabel5.setForeground(Color.black);
        if(flightIdJText.getText()==null || flightIdJText.getText().equals("")){
            flightIdJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Id cant be empty");
            return;
     }
     if(fromLocationJText.getText()==null || fromLocationJText.getText().equals("")){
            fromLocationJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "From Location cant be empty");
            return;
     }
     if(toLocationJText.getText()==null || toLocationJText.getText().equals("")){
            toLocationJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "To Location cant be empty");
            return;
     }
     if(priceJText.getText()==null || priceJText.getText().equals("")){
            priceJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel6.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Price cant be empty");
            return;
     }
    
     
     int flightId = 0;
     try{
     flightId = Integer.parseInt(flightIdJText.getText());
     }
     catch(NumberFormatException e){
         JOptionPane.showMessageDialog(null, "Please enter Valid number for No Of Flights");
         return;
     }
      int totalNoOfSeats = 150;
      double price = 0;
     try{
      price = Double.parseDouble(priceJText.getText());
     }
     catch(NumberFormatException e){
        JOptionPane.showMessageDialog(null, "Please enter Valid Price");
         return; 
     }
     
     
     for(Airliner airliner : airlineDirectory.getAirlinerList()){
             if(airliner.getAirlinerName().equalsIgnoreCase(airlinerName)){
                  List<Airplane> flightFleet  = airliner.getFlightFleet();
                Airplane airplane = new Airplane(flightId,fromLocationJText.getText(),toLocationJText.getText(),spinnerHour.getValue()+":"+spinnerMinute.getValue()+" "+spinnerAmPm.getValue(),totalNoOfSeats,airlinerName,0,price);
                 flightFleet.add(airplane);
                 JOptionPane.showMessageDialog(null, "Flight Added Successfully.");
                 airliner.setTotalFlightsPerDay(flightFleet.size());
                 ViewAirlinerJPanel manageFlightSchedule = new ViewAirlinerJPanel(panelRight,airlineDirectory,airliner,userDirectory);
                 this.panelRight.remove(this);
                 this.panelRight.add("ManageAirlinerFlightScheduleJPanel", manageFlightSchedule);
                 CardLayout layout = (CardLayout)this.panelRight.getLayout();
                 layout.previous(panelRight);
                  break;
         }
     }
    }//GEN-LAST:event_createBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JTextField flightIdJText;
    private javax.swing.JTextField fromLocationJText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField priceJText;
    private javax.swing.JSpinner spinnerAmPm;
    private javax.swing.JSpinner spinnerHour;
    private javax.swing.JSpinner spinnerMinute;
    private javax.swing.JTextField toLocationJText;
    // End of variables declaration//GEN-END:variables
}
