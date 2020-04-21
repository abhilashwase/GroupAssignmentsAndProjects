/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.LabAssistant;


import Business.EcoSystem;
import Business.Organization.LabOrganization;
import Business.WorkQueue.LabTestWorkRequest;
import Business.WorkQueue.PrimaryTestingKit;
import Business.WorkQueue.ManufactureringTestWorkrequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Keshav
 */
public class LabAssistantWorkAreaJPanel extends javax.swing.JPanel {

    JPanel userProcessContainer;
    LabTestWorkRequest request;
    EcoSystem business;
    private LabOrganization labOrganization;
    ArrayList<WorkRequest> result =new ArrayList<WorkRequest>();
    /**
     * Creates new form LabAssistantWorkAreaJPanel
     */
    public LabAssistantWorkAreaJPanel(JPanel userProcessContainer, EcoSystem business,LabTestWorkRequest request,LabOrganization labOrganization) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.request = request;
        this.business = business;
        this.labOrganization = labOrganization;
        result = labOrganization.getWorkQueue().getWorkRequestList();
        populateDetails();
    }
    
    public void populateDetails(){
     
      for (int i=0; i<result.size();i++) {
        LabTestWorkRequest labTestWorkRequest = (LabTestWorkRequest) result.get(i);
        PrimaryTestingKit primaryTestingKit =  labTestWorkRequest.getPrimaryTestingKit();
        if(primaryTestingKit.getStatus()=="Pending"){
        throatSwabTotalJText.setText(String.valueOf(primaryTestingKit.getNumberOfThroatSwab()));
        nasopharyngealSwabTotalJText.setText(String.valueOf(primaryTestingKit.getNumberOfNasopharyngealSwab()));
        pcrMachineTotalJText.setText(String.valueOf(primaryTestingKit.getNumberOfPCRMachine()));
        ecgMachineTotalJText.setText(String.valueOf(primaryTestingKit.getNumberOfECGMachine()));
        break;
        }
      }
    }
static boolean isNumberValid(String number)
    {
        String regex = "[\\\\s]*[0-9]*[0-9]+";
        return number.matches(regex);
    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ecgMachineApprovedJText = new javax.swing.JTextField();
        ecgMachineTotalJText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nasopharyngealSwabTotalJText = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        pcrMachineTotalJText = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        throatSwabTotalJText = new javax.swing.JTextField();
        throatSwabApprovedJText = new javax.swing.JTextField();
        nasopharyngealSwabApprovedJText = new javax.swing.JTextField();
        pcrMachineApprovedJText = new javax.swing.JTextField();
        submitJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        ecgMachineTotalJText.setEnabled(false);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel2.setText("No. Of Throat Swab :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel3.setText("No. Of Nasopharyngeal Swab : ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        jLabel4.setText("No. Of PCR Machine : ");

        nasopharyngealSwabTotalJText.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("No. Of ECG Machine :  ");

        pcrMachineTotalJText.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Total Quantity");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Approved Quantity");

        throatSwabTotalJText.setEnabled(false);

        submitJButton.setBackground(new java.awt.Color(0, 102, 204));
        submitJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        submitJButton.setForeground(new java.awt.Color(255, 255, 255));
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });

        backJButton.setBackground(new java.awt.Color(0, 102, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<<Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(0, 102, 204));

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(240, 240, 240));
        jLabel17.setText(" x");
        jLabel17.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel17))
        );

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/logo.png"))); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("TESTING APPROVAL");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(backJButton)
                .addGap(215, 215, 215)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10))
            .addGroup(layout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76)
                        .addComponent(jLabel6))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitJButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(1, 1, 1)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(throatSwabTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(nasopharyngealSwabTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(pcrMachineTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ecgMachineTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pcrMachineApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nasopharyngealSwabApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ecgMachineApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(throatSwabApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(backJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel7)))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel3)
                        .addGap(16, 16, 16)
                        .addComponent(jLabel4)
                        .addGap(20, 20, 20)
                        .addComponent(jLabel5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(throatSwabTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nasopharyngealSwabTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(pcrMachineTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ecgMachineTotalJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(throatSwabApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nasopharyngealSwabApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16)
                        .addComponent(pcrMachineApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(ecgMachineApprovedJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(submitJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed
        throatSwabApprovedJText.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel2.setForeground(Color.BLACK);
        
        nasopharyngealSwabApprovedJText.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel3.setForeground(Color.BLACK);
        
        pcrMachineApprovedJText.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel4.setForeground(Color.BLACK);
        
        ecgMachineApprovedJText.setBorder(new LineBorder(new Color(128,128,128)));
        jLabel5.setForeground(Color.BLACK);
        
        
        if(isNumberValid(throatSwabApprovedJText.getText()) == false || throatSwabApprovedJText.getText() == null || throatSwabApprovedJText.getText().equals(""))
        {
            throatSwabApprovedJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter a valid number for No. of Throat Swab");
        }
        else if(isNumberValid(nasopharyngealSwabApprovedJText.getText()) == false || nasopharyngealSwabApprovedJText.getText() == null || nasopharyngealSwabApprovedJText.getText().equals(""))
        {
            nasopharyngealSwabApprovedJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter a valid number for No. Of Nasopharyngeal Swab");
        }
        else if(isNumberValid(pcrMachineApprovedJText.getText()) == false || pcrMachineApprovedJText.getText() == null || pcrMachineApprovedJText.getText().equals(""))
        {
            pcrMachineApprovedJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter a valid number for No. Of PCR Machine");
        }
        else if(isNumberValid(ecgMachineApprovedJText.getText()) == false || ecgMachineApprovedJText.getText() == null || ecgMachineApprovedJText.getText().equals(""))
        {
            ecgMachineApprovedJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel5.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter a valid number for No. Of ECG Machine");
        }
        else
        {
        ArrayList<WorkRequest> result = business.getWorkQueue().getWorkRequestList();    
         for (int i=0; i<result.size();i++) {
            ManufactureringTestWorkrequest manufactureringTestWorkrequest = (ManufactureringTestWorkrequest) result.get(i);
       
            int numberOfThroatSwab = Integer.parseInt(throatSwabApprovedJText.getText());
            int numberOfNasopharyngealSwab = Integer.parseInt(nasopharyngealSwabApprovedJText.getText());
            int numberOfPCRMachine = Integer.parseInt(pcrMachineApprovedJText.getText());
            int numberOfECGMachine = Integer.parseInt(ecgMachineApprovedJText.getText());
            
            int totalNumberOfThroatSwab = Integer.parseInt(throatSwabTotalJText.getText());
            int totalNumberOfNasopharyngealSwab = Integer.parseInt(nasopharyngealSwabTotalJText.getText());
            int totalNumberOfPCRMachine = Integer.parseInt(pcrMachineTotalJText.getText());
            int totalNumberOfECGMachine = Integer.parseInt(ecgMachineTotalJText.getText());
            
            if(totalNumberOfThroatSwab<numberOfThroatSwab){
                JOptionPane.showMessageDialog(null, "Please enter quantity less than Total Quantity");
                return;
            }
            if(totalNumberOfNasopharyngealSwab<numberOfNasopharyngealSwab){
                JOptionPane.showMessageDialog(null, "Please enter quantity less than Total Quantity");
                return;
            }
            if(totalNumberOfPCRMachine<numberOfPCRMachine){
                JOptionPane.showMessageDialog(null, "Please enter quantity less than Total Quantity");
                return;
            }
            if(totalNumberOfECGMachine<numberOfECGMachine){
                JOptionPane.showMessageDialog(null, "Please enter quantity less than Total Quantity");
                return;
            }
            double decomposingQuantity =  (totalNumberOfThroatSwab-numberOfThroatSwab)+(totalNumberOfNasopharyngealSwab-numberOfNasopharyngealSwab)+(totalNumberOfPCRMachine-numberOfPCRMachine)+(totalNumberOfECGMachine-numberOfECGMachine);
            PrimaryTestingKit primaryTestingKit = manufactureringTestWorkrequest.getPrimaryTestingKit();
            if(primaryTestingKit==null){
                primaryTestingKit = new PrimaryTestingKit();
            }
            numberOfThroatSwab = numberOfThroatSwab+((String.valueOf(primaryTestingKit.getNumberOfThroatSwab()))==null?0:primaryTestingKit.getNumberOfThroatSwab());
            primaryTestingKit.setNumberOfThroatSwab(numberOfThroatSwab);
            
            numberOfNasopharyngealSwab = numberOfNasopharyngealSwab+((String.valueOf(primaryTestingKit.getNumberOfNasopharyngealSwab()))==null?0:primaryTestingKit.getNumberOfNasopharyngealSwab());
            primaryTestingKit.setNumberOfNasopharyngealSwab(numberOfNasopharyngealSwab);
            
            numberOfPCRMachine = numberOfPCRMachine+((String.valueOf(primaryTestingKit.getNumberOfPCRMachine()))==null?0:primaryTestingKit.getNumberOfPCRMachine());
            primaryTestingKit.setNumberOfPCRMachine(numberOfPCRMachine);
            
            numberOfECGMachine = numberOfECGMachine+((String.valueOf(primaryTestingKit.getNumberOfECGMachine()))==null?0:primaryTestingKit.getNumberOfECGMachine());
            primaryTestingKit.setNumberOfECGMachine(numberOfECGMachine);
            
            primaryTestingKit.setStatus("Completed");
            manufactureringTestWorkrequest.setDecomposableQuantity(manufactureringTestWorkrequest.getDecomposableQuantity()+decomposingQuantity);
            manufactureringTestWorkrequest.setPrimaryTestingKit(primaryTestingKit);
            JOptionPane.showMessageDialog(null, "Primary Kits added Succesfully");
            request.setStatus("Completed");
         }
        
         throatSwabApprovedJText.setText("");
         nasopharyngealSwabApprovedJText.setText("");
         pcrMachineApprovedJText.setText("");
         ecgMachineApprovedJText.setText("");
         
         throatSwabTotalJText.setText("");
         nasopharyngealSwabTotalJText.setText("");
         pcrMachineTotalJText.setText("");
         ecgMachineTotalJText.setText("");
         }
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_backJButtonActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JTextField ecgMachineApprovedJText;
    private javax.swing.JTextField ecgMachineTotalJText;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nasopharyngealSwabApprovedJText;
    private javax.swing.JTextField nasopharyngealSwabTotalJText;
    private javax.swing.JTextField pcrMachineApprovedJText;
    private javax.swing.JTextField pcrMachineTotalJText;
    private javax.swing.JButton submitJButton;
    private javax.swing.JTextField throatSwabApprovedJText;
    private javax.swing.JTextField throatSwabTotalJText;
    // End of variables declaration//GEN-END:variables
}
