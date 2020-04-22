/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface;

import Business.DB4OUtil.DB4OUtil;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.PasswordUtils;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Properties;
import java.util.Random;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

/**
 *
 * @author Abhilash Wase
 */
public class ForgotPasswordJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ForgotPasswordJPanel
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private String pin = "";
    private JPanel container;

    public ForgotPasswordJPanel(EcoSystem system, JPanel container) {
        this.system = system;
        this.container = container;
        initComponents();
        jLabel2.setVisible(false);
        passwordJTextField.setVisible(false);
        confirmJButton.setVisible(true);
        confirmPINJButton.setVisible(false);
        confirmPasswordJButton.setVisible(false);
        nameJTextField.setEnabled(true);
    }

    private String sendEmail(String emailAdd) {
        final String to = emailAdd;
        boolean sessionDebug = false;
        String from = "klkeshav08@gmail.com";
        String host = "smtp.gmail.com";
        String user = "klkeshav08@gmail.com";
        String pass = "Alpha_123";
        Properties properties = System.getProperties();
        properties.setProperty("mail.smtp.host", host);
        properties.put("mail.smtp.starttls.required", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", host);
        properties.put("mail.smtp.port", "587");
        properties.put("mail.smtp.auth", "true");
        java.security.Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
        Session session;
        session = Session.getDefaultInstance(properties, null);
        session.setDebug(sessionDebug);
        Random r = new Random();
        pin = String.format("%04d", r.nextInt(10000));
        try {
            MimeMessage message = new MimeMessage(session);
            message.setFrom(new InternetAddress(from));
            message.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            InternetAddress address;
            address = new InternetAddress(to);
            message.setSubject("CDC System Alert - New Password Generation");

            message.setText("Your Secret pin is " + pin + " . Please do not share your pin.");
            Transport transport = session.getTransport("smtp");
            transport.connect(host, user, pass);
            transport.sendMessage(message, message.getAllRecipients());
            transport.close();
            //JOptionPane.showMessageDialog(null, "Please check your email for further details!");
        } catch (Exception e) {
            System.out.println(e);
            pin = "";
        }
        return pin;
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
        nameJTextField = new javax.swing.JTextField();
        passwordJTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        confirmJButton = new javax.swing.JButton();
        confirmPINJButton = new javax.swing.JButton();
        confirmPasswordJButton = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        backJButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("User Name");

        nameJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameJTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Password");

        confirmJButton.setBackground(new java.awt.Color(0, 102, 204));
        confirmJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmJButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmJButton.setText("Confirm");
        confirmJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmJButtonActionPerformed(evt);
            }
        });

        confirmPINJButton.setBackground(new java.awt.Color(0, 102, 204));
        confirmPINJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmPINJButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmPINJButton.setText("Confirm Your PIN");
        confirmPINJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPINJButtonActionPerformed(evt);
            }
        });

        confirmPasswordJButton.setBackground(new java.awt.Color(0, 102, 204));
        confirmPasswordJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        confirmPasswordJButton.setForeground(new java.awt.Color(255, 255, 255));
        confirmPasswordJButton.setText("Confirm Your Password");
        confirmPasswordJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmPasswordJButtonActionPerformed(evt);
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

        backJButton.setBackground(new java.awt.Color(0, 102, 204));
        backJButton.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backJButton.setForeground(new java.awt.Color(255, 255, 255));
        backJButton.setText("<< Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 102, 204));
        jLabel8.setText("PASSWORD RECOVERY");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(backJButton)
                        .addGap(152, 152, 152)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 190, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(confirmPINJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(confirmJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(confirmPasswordJButton))
                                        .addGap(42, 42, 42)))
                                .addGap(273, 273, 273))))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(backJButton)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(passwordJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(confirmJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPINJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(confirmPasswordJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addComponent(jLabel10))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void nameJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameJTextFieldActionPerformed

    private void confirmJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmJButtonActionPerformed
        String userName = nameJTextField.getText();
        if (userName == null || userName.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter your userid");
            return;
        }
        int count = 0;
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (userName.equals(ua.getUsername())) {
                        pin = sendEmail("klkeshav08@gmail.com");
                        if (pin == null || pin.equals("")) {
                            JOptionPane.showMessageDialog(null, "ERROR : Password Change Failed. Please try again.");
                            return;
                        }
                        JOptionPane.showMessageDialog(null, "Please enter the pin that you got in your mail.");
                        jLabel2.setText("PIN");
                        jLabel2.setVisible(true);
                        passwordJTextField.setVisible(true);
                        confirmJButton.setVisible(false);
                        confirmPINJButton.setVisible(true);
                        nameJTextField.setEnabled(false);
                        count = 1;
                        break;
                    }
                }
            }
        }
        if (count == 0) {
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                            if (userName.equals(ua.getUsername())) {
                                pin = sendEmail("klkeshav08@gmail.com");
                                if (pin == null || pin.equals("")) {
                                    JOptionPane.showMessageDialog(null, "ERROR : Password Change Failed. Please try again.");
                                    return;
                                }
                                JOptionPane.showMessageDialog(null, "Please enter the pin that you got in your mail.");
                                jLabel2.setText("PIN");
                                jLabel2.setVisible(true);
                                passwordJTextField.setVisible(true);
                                confirmJButton.setVisible(false);
                                confirmPINJButton.setVisible(true);
                                nameJTextField.setEnabled(false);
                                count = 1;
                                break;
                            }
                        }
                    }
                }
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Please enter Valid UserId.");
            return;
        }
        dB4OUtil.storeSystem(system);
    }//GEN-LAST:event_confirmJButtonActionPerformed

    private void confirmPINJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPINJButtonActionPerformed
        String enteredPin = passwordJTextField.getText();
        if (enteredPin == null || enteredPin.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the pin that you got in your mail.");
            return;
        }
        if (enteredPin.equals(pin)) {
            JOptionPane.showMessageDialog(null, "PIN you have entered is correct. Please change your password.");
            jLabel2.setText("Password");
            passwordJTextField.setText("");
            jLabel2.setVisible(true);
            passwordJTextField.setVisible(true);
            confirmJButton.setVisible(false);
            confirmPINJButton.setVisible(false);
            confirmPasswordJButton.setVisible(true);
            nameJTextField.setEnabled(false);
            return;
        } else {
            JOptionPane.showMessageDialog(null, "PIN you have entered doesn't match.");
            return;
        }


    }//GEN-LAST:event_confirmPINJButtonActionPerformed
    private boolean isPasswordValid(String password) {
        String regex = "((?=.*[a-z])(?=.*\\d)(?=.*[A-Z])(?=.*[@#$%!]).{6,40})";
        return password.matches(regex);
    }
    private void confirmPasswordJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmPasswordJButtonActionPerformed
        String userName = nameJTextField.getText();
        String enteredPassword = passwordJTextField.getText();
        passwordJTextField.setBorder(new LineBorder(new Color(128, 128, 128)));
        jLabel2.setForeground(Color.BLACK);
        if (enteredPassword == null || enteredPassword.equals("")) {
            JOptionPane.showMessageDialog(null, "Please enter the password.");
            return;
        }
        if (isPasswordValid(enteredPassword) == false) {
            passwordJTextField.setBorder(BorderFactory.createLineBorder(Color.RED));
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "The password should consist of atleast 1 Uppercase, 1 Lowercase, 1 Digit, 1 special character and should of length between 6 and 40");
            return;
        }
        int count = 0;
        String salt = PasswordUtils.getSalt(30);
        String mySecurePassword = PasswordUtils.generateSecurePassword(enteredPassword, salt);
        for (Network network : system.getNetworkList()) {
            for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                for (UserAccount ua : enterprise.getUserAccountDirectory().getUserAccountList()) {
                    if (userName.equals(ua.getUsername())) {
                        ua.setPassword(mySecurePassword);
                        ua.setSalt(salt);
                        JOptionPane.showMessageDialog(null, "Your Password has been changed successfully");
                        passwordJTextField.setText("");
                        confirmPasswordJButton.setVisible(false);
                        count = 1;
                    }
                }
            }
        }
        if (count == 0) {
            for (Network network : system.getNetworkList()) {
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    for (Organization org : enterprise.getOrganizationDirectory().getOrganizationList()) {
                        for (UserAccount ua : org.getUserAccountDirectory().getUserAccountList()) {
                            if (userName.equals(ua.getUsername())) {
                                ua.setPassword(mySecurePassword);
                                ua.setSalt(salt);
                                JOptionPane.showMessageDialog(null, "Your Password has been changed successfully");
                                passwordJTextField.setText("");
                                confirmPasswordJButton.setVisible(false);
                                count = 1;
                            }
                        }
                    }
                }
            }
        }
        if (count == 0) {
            JOptionPane.showMessageDialog(null, "Please enter Valid UserId.");
            return;
        }

    }//GEN-LAST:event_confirmPasswordJButtonActionPerformed

    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jLabel17MouseClicked
    int xx, xy;
    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed

        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_backJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backJButton;
    private javax.swing.JButton confirmJButton;
    private javax.swing.JButton confirmPINJButton;
    private javax.swing.JButton confirmPasswordJButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField nameJTextField;
    private javax.swing.JTextField passwordJTextField;
    // End of variables declaration//GEN-END:variables
}
