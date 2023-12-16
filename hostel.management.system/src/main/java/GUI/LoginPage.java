/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.*;
import javax.swing.JOptionPane;


/**
 *
 * @author waiho
 */
public class LoginPage extends javax.swing.JFrame {
    

    /**
     * Creates new form LoginPage
     */
    public LoginPage() {
        initComponents();
        
    }
     

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LoginPanel = new javax.swing.JPanel();
        Frame_purple = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        Frame_peach = new javax.swing.JPanel();
        USERNAME = new javax.swing.JTextField();
        PASSWORD = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        LockIcon = new javax.swing.JLabel();
        UserIcon = new javax.swing.JLabel();
        ForgotPasswordLabel = new javax.swing.JLabel();
        LoginButton = new javax.swing.JButton();
        UserOption = new javax.swing.JComboBox<>();
        LockIcon1 = new javax.swing.JLabel();
        ShowPassword = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        ForgotPasswordLabel1 = new javax.swing.JLabel();
        ForgotPasswordLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LoginPanel.setPreferredSize(new java.awt.Dimension(852, 550));

        Frame_purple.setBackground(new java.awt.Color(74, 31, 61));
        Frame_purple.setPreferredSize(new java.awt.Dimension(427, 550));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/HostelLogoSmall.png"))); // NOI18N

        jLabel7.setBackground(new java.awt.Color(186, 79, 84));
        jLabel7.setFont(new java.awt.Font("Imprint MT Shadow", 0, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(186, 79, 84));
        jLabel7.setText("WEDNESDAY");

        javax.swing.GroupLayout Frame_purpleLayout = new javax.swing.GroupLayout(Frame_purple);
        Frame_purple.setLayout(Frame_purpleLayout);
        Frame_purpleLayout.setHorizontalGroup(
            Frame_purpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_purpleLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel3)
                .addContainerGap(49, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Frame_purpleLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(78, 78, 78))
        );
        Frame_purpleLayout.setVerticalGroup(
            Frame_purpleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_purpleLayout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Frame_peach.setBackground(new java.awt.Color(186, 79, 84));
        Frame_peach.setForeground(new java.awt.Color(186, 79, 84));
        Frame_peach.setPreferredSize(new java.awt.Dimension(430, 550));

        USERNAME.setBackground(new java.awt.Color(186, 79, 84));
        USERNAME.setForeground(new java.awt.Color(255, 255, 255));
        USERNAME.setText("USERNAME");
        USERNAME.setBorder(null);
        USERNAME.setCaretColor(new java.awt.Color(255, 255, 255));
        USERNAME.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        USERNAME.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        USERNAME.setSelectionColor(new java.awt.Color(255, 255, 255));
        USERNAME.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                USERNAMEFocusGained(evt);
            }
        });
        USERNAME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                USERNAMEActionPerformed(evt);
            }
        });

        PASSWORD.setBackground(new java.awt.Color(186, 79, 84));
        PASSWORD.setForeground(new java.awt.Color(255, 255, 255));
        PASSWORD.setText("PASSWORD");
        PASSWORD.setBorder(null);
        PASSWORD.setCaretColor(new java.awt.Color(255, 255, 255));
        PASSWORD.setDisabledTextColor(new java.awt.Color(255, 255, 255));
        PASSWORD.setSelectedTextColor(new java.awt.Color(255, 255, 255));
        PASSWORD.setSelectionColor(new java.awt.Color(255, 255, 255));
        PASSWORD.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                PASSWORDFocusGained(evt);
            }
        });
        PASSWORD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PASSWORDActionPerformed(evt);
            }
        });

        LockIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_lock_30px.png"))); // NOI18N

        UserIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_user_30px.png"))); // NOI18N

        ForgotPasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ForgotPasswordLabel.setForeground(new java.awt.Color(204, 204, 204));
        ForgotPasswordLabel.setText("Forgot password ?");
        ForgotPasswordLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordLabelMouseClicked(evt);
            }
        });

        LoginButton.setText("Login");
        LoginButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LoginButtonActionPerformed(evt);
            }
        });

        UserOption.setBackground(new java.awt.Color(186, 79, 84));
        UserOption.setForeground(new java.awt.Color(186, 79, 84));
        UserOption.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Admin", "Student" }));
        UserOption.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UserOptionActionPerformed(evt);
            }
        });

        LockIcon1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icons8_User_Menu_Female_30px.png"))); // NOI18N

        ShowPassword.setBackground(new java.awt.Color(255, 255, 255));
        ShowPassword.setForeground(new java.awt.Color(255, 255, 255));
        ShowPassword.setText("Show Password");
        ShowPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPasswordActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Login Page");

        jSeparator3.setForeground(new java.awt.Color(204, 204, 204));

        ForgotPasswordLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ForgotPasswordLabel1.setForeground(new java.awt.Color(204, 204, 204));
        ForgotPasswordLabel1.setText("New User? ");

        ForgotPasswordLabel2.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        ForgotPasswordLabel2.setForeground(new java.awt.Color(0, 0, 204));
        ForgotPasswordLabel2.setText("Register now!!!");
        ForgotPasswordLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ForgotPasswordLabel2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout Frame_peachLayout = new javax.swing.GroupLayout(Frame_peach);
        Frame_peach.setLayout(Frame_peachLayout);
        Frame_peachLayout.setHorizontalGroup(
            Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_peachLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ForgotPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Frame_peachLayout.createSequentialGroup()
                        .addComponent(ForgotPasswordLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ForgotPasswordLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jSeparator3)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Frame_peachLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LockIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserIcon, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LockIcon1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(UserOption, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(Frame_peachLayout.createSequentialGroup()
                            .addComponent(PASSWORD, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(ShowPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jSeparator1)
                        .addComponent(jSeparator2)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(75, 75, 75))
        );
        Frame_peachLayout.setVerticalGroup(
            Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Frame_peachLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(56, 56, 56)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(UserIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(USERNAME, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(LockIcon, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(PASSWORD)
                        .addComponent(ShowPassword)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(LockIcon1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(Frame_peachLayout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(UserOption, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(LoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(Frame_peachLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ForgotPasswordLabel2)
                    .addComponent(ForgotPasswordLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ForgotPasswordLabel)
                .addGap(91, 91, 91))
        );

        javax.swing.GroupLayout LoginPanelLayout = new javax.swing.GroupLayout(LoginPanel);
        LoginPanel.setLayout(LoginPanelLayout);
        LoginPanelLayout.setHorizontalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LoginPanelLayout.createSequentialGroup()
                .addComponent(Frame_purple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(Frame_peach, javax.swing.GroupLayout.DEFAULT_SIZE, 475, Short.MAX_VALUE))
        );
        LoginPanelLayout.setVerticalGroup(
            LoginPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Frame_purple, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
            .addComponent(Frame_peach, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 902, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(LoginPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ShowPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPasswordActionPerformed
        // TODO add your handling code here:
        if(ShowPassword.isSelected()){
            PASSWORD.setEchoChar((char)0);
        }else if(!ShowPassword.isSelected()){
            PASSWORD.setEchoChar('\u2022');
        }
    }//GEN-LAST:event_ShowPasswordActionPerformed

    private void LoginButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LoginButtonActionPerformed
        // TODO add your handling code here:
        String username = USERNAME.getText();
        String password = new String(PASSWORD.getPassword());
        String useroption = UserOption.getSelectedItem().toString();
 
        switch (useroption) {
            case "Admin":
            if (authenticateAdmin(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                // Perform further actions after successful login
                AdminPage ap = new AdminPage();
                ap.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null ,"Invalid username or password. Please try again.");
            }
            break;
            case "Student":
            if (authenticateStudent(username, password)) {
                JOptionPane.showMessageDialog(null, "Login successful!");
                // Perform further actions after successful login
                AvailableRoom ar = new AvailableRoom(USERNAME.getText());
                MyApplication ma = new MyApplication(USERNAME.getText());
                AvailableRoomSearch ars = new AvailableRoomSearch(USERNAME.getText());
                Booking b = new Booking(USERNAME.getText());
                Payment p = new Payment(USERNAME.getText());
                ar.Username.setText(username);
                ma.Username.setText(username);
                b.Username.setText(username);
                ars.Username.setText(username);
                p.Username.setText(username);
                
                ar.setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(null ,"Invalid username or password. Please try again.");
            }
            break;
            default:
            JOptionPane.showMessageDialog(null ,"Please select user type.");
            break;
        }

    }//GEN-LAST:event_LoginButtonActionPerformed

    private void PASSWORDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PASSWORDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_PASSWORDActionPerformed

    private void PASSWORDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_PASSWORDFocusGained
        // TODO add your handling code here:
        PASSWORD.setText("");
    }//GEN-LAST:event_PASSWORDFocusGained

    private void USERNAMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_USERNAMEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_USERNAMEActionPerformed

    private void USERNAMEFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_USERNAMEFocusGained
        // TODO add your handling code here:

    }//GEN-LAST:event_USERNAMEFocusGained

    private void UserOptionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UserOptionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UserOptionActionPerformed

    private void ForgotPasswordLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordLabelMouseClicked
        // TODO add your handling code here:
        String useroption = UserOption.getSelectedItem().toString();
        String forgotPassword = JOptionPane.showInputDialog("Please enter your username to retrieve password : ");
        switch (useroption) {
            case "Admin":
                try (BufferedReader reader = new BufferedReader(new FileReader("AdminDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(">");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (forgotPassword.equals(storedUsername)) {
                    JOptionPane.showMessageDialog(null,"Your password is : " + storedPassword);
                    break;
                }else{
                    JOptionPane.showMessageDialog(null,"Username not found!");
                    break;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
            break;
            case "Student":
                try (BufferedReader reader = new BufferedReader(new FileReader("StudentDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(">");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (forgotPassword.equals(storedUsername)) {
                    JOptionPane.showMessageDialog(null,"Your password is : " + storedPassword);
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
            
            break;
            default:
            JOptionPane.showMessageDialog(null ,"Please select user type.");
            break;
        }
        
    }//GEN-LAST:event_ForgotPasswordLabelMouseClicked

    private void ForgotPasswordLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ForgotPasswordLabel2MouseClicked
        // TODO add your handling code here:
        Registration reg = new Registration();
        reg.setVisible(true);
        dispose();
    }//GEN-LAST:event_ForgotPasswordLabel2MouseClicked
     
    private boolean authenticateAdmin(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("AdminDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(">");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }return false;
    }
    
    private boolean authenticateStudent(String username, String password) {
        try (BufferedReader reader = new BufferedReader(new FileReader("StudentDetails.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(">");
                String storedUsername = parts[0];
                String storedPassword = parts[1];

                if (username.equals(storedUsername) && password.equals(storedPassword)) {
                    return true;
                }
            }
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Error");
        }return false;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginPage().setVisible(true);
                            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ForgotPasswordLabel;
    private javax.swing.JLabel ForgotPasswordLabel1;
    private javax.swing.JLabel ForgotPasswordLabel2;
    private javax.swing.JPanel Frame_peach;
    private javax.swing.JPanel Frame_purple;
    private javax.swing.JLabel LockIcon;
    private javax.swing.JLabel LockIcon1;
    private javax.swing.JButton LoginButton;
    private javax.swing.JPanel LoginPanel;
    private javax.swing.JPasswordField PASSWORD;
    private javax.swing.JCheckBox ShowPassword;
    private javax.swing.JTextField USERNAME;
    private javax.swing.JLabel UserIcon;
    private javax.swing.JComboBox<String> UserOption;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    // End of variables declaration//GEN-END:variables
}
