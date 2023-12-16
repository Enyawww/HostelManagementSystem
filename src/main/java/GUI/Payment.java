/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import Code.payment;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dayna
 */
public class Payment extends javax.swing.JFrame {

    /**
     * Creates new form Payment
     */
    public Payment(String text) {
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

        Payment = new javax.swing.JPanel();
        NaviBar4 = new javax.swing.JPanel();
        Logo4 = new javax.swing.JLabel();
        Wednesday4 = new javax.swing.JLabel();
        MyApplication = new javax.swing.JLabel();
        AvailableRoom = new javax.swing.JLabel();
        Booking = new javax.swing.JLabel();
        payment = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        Wel = new javax.swing.JLabel();
        Username = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        check = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        paytable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Payment.setBackground(new java.awt.Color(255, 255, 255));
        Payment.setPreferredSize(new java.awt.Dimension(852, 550));
        Payment.setLayout(null);

        NaviBar4.setBackground(new java.awt.Color(74, 31, 61));
        NaviBar4.setMinimumSize(new java.awt.Dimension(852, 80));

        Logo4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/icon logo.png"))); // NOI18N
        Logo4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logo4MouseClicked(evt);
            }
        });

        Wednesday4.setBackground(new java.awt.Color(255, 255, 255));
        Wednesday4.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Wednesday4.setForeground(new java.awt.Color(255, 255, 255));
        Wednesday4.setText("WEDNESDAY");

        MyApplication.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        MyApplication.setForeground(new java.awt.Color(255, 255, 255));
        MyApplication.setText("My Application");
        MyApplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MyApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MyApplicationMouseClicked(evt);
            }
        });

        AvailableRoom.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        AvailableRoom.setForeground(new java.awt.Color(255, 255, 255));
        AvailableRoom.setText("Available Room");
        AvailableRoom.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        AvailableRoom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                AvailableRoomMouseClicked(evt);
            }
        });

        Booking.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Booking.setForeground(new java.awt.Color(255, 255, 255));
        Booking.setText("Booking");
        Booking.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Booking.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BookingMouseClicked(evt);
            }
        });

        payment.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        payment.setForeground(new java.awt.Color(255, 255, 255));
        payment.setText("Payment");
        payment.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        payment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                paymentMouseClicked(evt);
            }
        });

        Logout.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Logout.setForeground(new java.awt.Color(255, 255, 255));
        Logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        Logout.setText("Logout");
        Logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LogoutMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NaviBar4Layout = new javax.swing.GroupLayout(NaviBar4);
        NaviBar4.setLayout(NaviBar4Layout);
        NaviBar4Layout.setHorizontalGroup(
            NaviBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBar4Layout.createSequentialGroup()
                .addGroup(NaviBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NaviBar4Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Wednesday4))
                    .addGroup(NaviBar4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Logo4, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addComponent(AvailableRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(MyApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        NaviBar4Layout.setVerticalGroup(
            NaviBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBar4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NaviBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NaviBar4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(MyApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(AvailableRoom, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Booking, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(payment, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Wednesday4, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        Payment.add(NaviBar4);
        NaviBar4.setBounds(0, 0, 852, 100);

        jPanel6.setMinimumSize(new java.awt.Dimension(852, 80));

        jLabel16.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(74, 31, 61));
        jLabel16.setText("Payment");

        Wel.setText("Welcome ,");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(384, Short.MAX_VALUE)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(195, 195, 195)
                .addComponent(Wel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Username, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Wel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Username, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        Payment.add(jPanel6);
        jPanel6.setBounds(-10, 100, 860, 80);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(74, 31, 61));
        jLabel2.setText("Payment record :");
        Payment.add(jLabel2);
        jLabel2.setBounds(10, 190, 170, 20);

        jLabel7.setFont(new java.awt.Font("Lucida Sans Typewriter", 3, 12)); // NOI18N
        jLabel7.setForeground(java.awt.Color.red);
        jLabel7.setText("*** In terms of conditions, please check and verify all the information before proceeding to payment ***");
        Payment.add(jLabel7);
        jLabel7.setBounds(50, 490, 760, 30);
        Payment.add(jSeparator3);
        jSeparator3.setBounds(0, 180, 850, 20);

        check.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        check.setText("Check Payment");
        check.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkActionPerformed(evt);
            }
        });
        Payment.add(check);
        check.setBounds(520, 450, 143, 31);

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("Make Payment");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        Payment.add(jButton2);
        jButton2.setBounds(670, 450, 143, 31);

        paytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Application ID", "Student ID", "Full Name", "Gender", "Room Type", "Arrival Date", "Check Out Date", "Status", "Payment", "Amount"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(paytable);

        Payment.add(jScrollPane2);
        jScrollPane2.setBounds(0, 220, 850, 220);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Payment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AvailableRoomMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_AvailableRoomMouseClicked
        // TODO add your handling code here:
        String uname = null;
        AvailableRoom ar = new AvailableRoom(uname);
        ar.Username.setText(Username.getText());
        ar.setVisible(true);
        dispose();
    }//GEN-LAST:event_AvailableRoomMouseClicked

    private void MyApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MyApplicationMouseClicked
        // TODO add your handling code here:
        MyApplication myapp = new MyApplication(Username.getText());
       
        myapp.Username.setText(Username.getText());
        myapp.setVisible(true);
        dispose();
    }//GEN-LAST:event_MyApplicationMouseClicked

    private void BookingMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BookingMouseClicked
        // TODO add your handling code here:
        String uname = null;
        Booking book = new Booking(uname);
        book.Username.setText(Username.getText());
//        book.sid.setText(Username.getText());
        book.setVisible(true);
        dispose();
    }//GEN-LAST:event_BookingMouseClicked

    private void Logo4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logo4MouseClicked
        // TODO add your handling code here:
    
    }//GEN-LAST:event_Logo4MouseClicked

    private void LogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LogoutMouseClicked
        // TODO add your handling code here:
        int choice = JOptionPane.showConfirmDialog(null, "Do you want to logout?", "Logout Confirmation", JOptionPane.YES_NO_OPTION);

            if (choice == JOptionPane.YES_OPTION) {
                WelcomePage wp = new WelcomePage();
                wp.setVisible(true);
                dispose();
            } else {
                JOptionPane.getRootFrame().dispose();
            }
    }//GEN-LAST:event_LogoutMouseClicked

    private void paymentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_paymentMouseClicked
        // TODO add your handling code here:
        String uname = null;
        Payment p = new Payment(uname);
        p.Username.setText(Username.getText());
        p.setVisible(true);
        dispose();
    }//GEN-LAST:event_paymentMouseClicked

    private void checkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkActionPerformed
        // TODO add your handling code here:
        String U = Username.getText();
        boolean add = false;
         try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {         
            
                    DefaultTableModel dtm = (DefaultTableModel) paytable.getModel();
                       Object[] lines = reader.lines().toArray();
                       boolean add1=false;
                       dtm.setRowCount(0);
                       for(int i=0;i<lines.length;i++) {
                           String[] parts = lines[i].toString().split(">");
                            String tp = parts[1];
                            String pay = parts[8];
                           
                           if(pay.equals("Pending")&&U.equals(tp)){
                               dtm.addRow(parts);
                               add1=true;
                               }
                        }
                       if(add1==true){
                               JOptionPane.showMessageDialog(null,"Pending payment found.");
                           }else{
                               JOptionPane.showMessageDialog(null,"No pending payment.");
                           }
                } catch (IOException e) {
                   JOptionPane.showMessageDialog(null, "Error");
                }
    }//GEN-LAST:event_checkActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String[] options = {"Pay", "back"};
        int choice = 3;
        
        String input = JOptionPane.showInputDialog(null, "Enter Application ID to pay");
        
        if (input == null) {
            // Close the dialog or handle the event appropriately
            return;
        }
        if (!input.matches("\\d{5}")) {
                JOptionPane.showMessageDialog(null, "Please insert a valid Application ID.");                
            } else if(input.matches("\\d{5}")){
                
                try {
                    List<String> lines = new ArrayList<>();
                    try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            lines.add(line);
                        }
                    }
                    List<String> lines1 = new ArrayList<>();
                    try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                        String line;
                        while ((line = reader.readLine()) != null) {
                            lines1.add(line);
                        }
                    }

                    boolean applicationFound = false;

                    for (int i = 0; i < lines.size(); i++) {
                        String line = lines1.get(i);
                        String[] parts = line.split(">");
                        String AID = parts[0];
                        String SID = parts[1];
                        String FullName = parts[2];
                        String Gender = parts[3];
                        String RoomType = parts[4];
                        String ArrivalDate = parts[5];
                        String CODate = parts[6];                        
                        String Status = parts[7];
                        String payment = parts[8];
                        String price = parts[9];

                        if (AID.equals(input) && payment.equals("Pending")) {
                            applicationFound = true;
                            break;
                        }
                    }
                    
                    if (applicationFound==false) {
                        JOptionPane.showMessageDialog(null, "Pending payment not found.");
                    } else {
                        choice = JOptionPane.showOptionDialog(null, "Pay or Cancel : ", "Manage", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
                                     
                    }
                    
                    if (choice == 0) {
                        String uname = null;
                        Pay pay = new Pay(uname);
                        pay.Username.setText(Username.getText());
                        pay.setVisible(true);
                        dispose();
        
                    }
             else if(choice == 1){
                  JOptionPane.showMessageDialog(null, "transaction canceled.");
      
             }
                } catch (IOException ex) {
                    Logger.getLogger(payment.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
    
        
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Payment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                String username = null;
                new Payment(username).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AvailableRoom;
    private javax.swing.JLabel Booking;
    private javax.swing.JLabel Logo4;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel MyApplication;
    private javax.swing.JPanel NaviBar4;
    private javax.swing.JPanel Payment;
    public javax.swing.JLabel Username;
    private javax.swing.JLabel Wednesday4;
    public javax.swing.JLabel Wel;
    private javax.swing.JButton check;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel payment;
    private javax.swing.JTable paytable;
    // End of variables declaration//GEN-END:variables
}
