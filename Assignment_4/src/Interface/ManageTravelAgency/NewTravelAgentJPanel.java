/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface.ManageTravelAgency;


import Business.AirlinerDirectory;
import Business.CustomerDirectory;
import Business.UserAccount;
import Business.UserDirectory;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Abhilash Wase
 */
public class NewTravelAgentJPanel extends javax.swing.JPanel {

    /**
     * Creates new form NewTravelAgentJPanel
     */
    private JPanel panelRight;
    private AirlinerDirectory airlineDirectory;
    private CustomerDirectory customerDirectory;
    private UserDirectory userDirectory;
    
    public NewTravelAgentJPanel(JPanel panelRight, AirlinerDirectory airlineDirectory, CustomerDirectory customerDirectory, UserDirectory userDirectory) {
        initComponents();
        this.customerDirectory = customerDirectory;
        this.airlineDirectory=airlineDirectory;
        this.panelRight=panelRight;
        this.userDirectory=userDirectory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
     private boolean userNamePatternCorrect(){
    Pattern p = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
    Matcher  m =p.matcher(userNameJText.getText());
    boolean b = m.matches();
    return b;
    }
    private boolean passwordPatternCorrect() {
       Pattern p = Pattern.compile("((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,40})");
       Matcher m = p.matcher(passwordJText.getText());
       boolean b = m.matches();
       return b;
   }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        userNameJText = new javax.swing.JTextField();
        passwordJText = new javax.swing.JTextField();
        rePasswordJText = new javax.swing.JTextField();
        travelAgencyJText = new javax.swing.JTextField();
        confirmJButton = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();

        jLabel1.setText("Travel Agent Sign Up");

        jLabel2.setText("Username :");

        jLabel3.setText("Password :");

        jLabel4.setText("Re-enter Password :");

        jLabel5.setText("Travel Agency Name :");

        rePasswordJText.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rePasswordJTextActionPerformed(evt);
            }
        });

        confirmJButton.setText("Submit");
        confirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJButtonActionPerformed(evt);
            }
        });

        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(backBtn)
                        .addGap(211, 211, 211)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(travelAgencyJText)
                                    .addComponent(userNameJText)
                                    .addComponent(passwordJText)
                                    .addComponent(rePasswordJText, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(confirmJButton))))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(backBtn))
                .addGap(105, 105, 105)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(userNameJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(passwordJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rePasswordJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(travelAgencyJText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addComponent(confirmJButton)))
                .addContainerGap(176, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rePasswordJTextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rePasswordJTextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rePasswordJTextActionPerformed

    private void confirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJButtonActionPerformed
        // TODO add your handling code here:
        if(userNameJText.getText() ==  null || userNameJText.getText().equals(""))
        {
            userNameJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Username can't be empty");
            return;
        }
        if(passwordJText.getText() == null || passwordJText.getText().equals(""))
        {
            passwordJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Password can't be empty");
            return;
        }
        if(rePasswordJText.getText() == null || rePasswordJText.getText().equals(""))
        {
            rePasswordJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please Reenter your password");
            return;
        }
        if(travelAgencyJText.getText() == null || travelAgencyJText.getText().equals(""))
        {
            travelAgencyJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Travel Agency Name can't be empty");
            return;
        }
        if(!userNamePatternCorrect()){
            userNameJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel4.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "UserName Should be in the form of YYY@hgj.gfgh");
            return;
        }

        if(!passwordPatternCorrect()){
            passwordJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.red);
            JOptionPane.showMessageDialog(null, "Password Should be atleast 6 digits and a combination of number, uppercaseletter, lower case letter and special character $,#,*,&");
            return;
        }
        if(!passwordJText.getText().equals(rePasswordJText.getText())){
            JOptionPane.showMessageDialog(null, "Passwords dont match");
            passwordJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.red);
            rePasswordJText.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel3.setForeground(Color.red);
            return;
        }
        for(UserAccount userAccount : userDirectory.getUserAccountList()){
            if(userAccount.getName().equalsIgnoreCase(userNameJText.getText()) && userAccount.getRole().equals("Travel Agent")){
                JOptionPane.showMessageDialog(null, "Travel Agency Already Exists.");
                return;
            }
        }
        userDirectory.createUserAccount(userNameJText.getText(), passwordJText.getText(),travelAgencyJText.getText() , "Travel Agent");
        JOptionPane.showMessageDialog(null, "Account Created Succesfully.");

    }//GEN-LAST:event_confirmJButtonActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout)panelRight.getLayout();
        panelRight.remove(this);
        layout.previous(panelRight); 
    }//GEN-LAST:event_backBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backBtn;
    private javax.swing.JButton confirmJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField passwordJText;
    private javax.swing.JTextField rePasswordJText;
    private javax.swing.JTextField travelAgencyJText;
    private javax.swing.JTextField userNameJText;
    // End of variables declaration//GEN-END:variables
}
