/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package GUI;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author waiho
 */
public class Report extends javax.swing.JFrame {

    /**
     * Creates new form Report
     */
    public Report() {
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

        ReportPanel = new javax.swing.JPanel();
        NaviBar = new javax.swing.JPanel();
        Logo = new javax.swing.JLabel();
        Wednesday = new javax.swing.JLabel();
        ManageInfo = new javax.swing.JLabel();
        ManageApplication = new javax.swing.JLabel();
        CheckRecord = new javax.swing.JLabel();
        Report = new javax.swing.JLabel();
        Logout = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        ReportTitle = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ReportPanel1 = new javax.swing.JPanel();
        NaviBar1 = new javax.swing.JPanel();
        Logo1 = new javax.swing.JLabel();
        Wednesday1 = new javax.swing.JLabel();
        ManageInfo1 = new javax.swing.JLabel();
        ManageApplication1 = new javax.swing.JLabel();
        CheckRecord1 = new javax.swing.JLabel();
        Report1 = new javax.swing.JLabel();
        Logout1 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        ReportTitle1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        PA = new javax.swing.JLabel();
        AA = new javax.swing.JLabel();
        DA = new javax.swing.JLabel();
        AR = new javax.swing.JLabel();
        UR = new javax.swing.JLabel();
        PI = new javax.swing.JLabel();
        TI = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ReportPanel.setBackground(new java.awt.Color(74, 31, 61));
        ReportPanel.setPreferredSize(new java.awt.Dimension(852, 550));
        ReportPanel.setLayout(null);

        NaviBar.setBackground(new java.awt.Color(74, 31, 61));
        NaviBar.setMinimumSize(new java.awt.Dimension(852, 80));

        Logo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        Wednesday.setBackground(new java.awt.Color(255, 255, 255));
        Wednesday.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Wednesday.setForeground(new java.awt.Color(255, 255, 255));
        Wednesday.setText("WEDNESDAY");

        ManageInfo.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageInfo.setForeground(new java.awt.Color(255, 255, 255));
        ManageInfo.setText("Manage Info");
        ManageInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageInfo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageInfoMouseClicked(evt);
            }
        });

        ManageApplication.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageApplication.setForeground(new java.awt.Color(255, 255, 255));
        ManageApplication.setText("Manage Application");
        ManageApplication.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageApplication.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageApplicationMouseClicked(evt);
            }
        });

        CheckRecord.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        CheckRecord.setForeground(new java.awt.Color(255, 255, 255));
        CheckRecord.setText("Check Record");
        CheckRecord.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckRecord.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckRecordMouseClicked(evt);
            }
        });

        Report.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Report.setForeground(new java.awt.Color(255, 255, 255));
        Report.setText("Report");
        Report.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Report.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ReportMouseClicked(evt);
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

        javax.swing.GroupLayout NaviBarLayout = new javax.swing.GroupLayout(NaviBar);
        NaviBar.setLayout(NaviBarLayout);
        NaviBarLayout.setHorizontalGroup(
            NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBarLayout.createSequentialGroup()
                .addGroup(NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NaviBarLayout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Wednesday))
                    .addGroup(NaviBarLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(ManageApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageInfo)
                .addGap(18, 18, 18)
                .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Logout, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        NaviBarLayout.setVerticalGroup(
            NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NaviBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ManageInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ManageApplication, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckRecord, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Report, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Wednesday, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        ReportPanel.add(NaviBar);
        NaviBar.setBounds(0, 0, 852, 100);
        ReportPanel.add(jSeparator1);
        jSeparator1.setBounds(0, 180, 850, 20);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setMinimumSize(new java.awt.Dimension(852, 80));

        ReportTitle.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        ReportTitle.setForeground(new java.awt.Color(74, 31, 61));
        ReportTitle.setText("Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(391, Short.MAX_VALUE)
                .addComponent(ReportTitle)
                .addGap(384, 384, 384))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(ReportTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        ReportPanel.add(jPanel2);
        jPanel2.setBounds(0, 100, 852, 80);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Income :");
        ReportPanel.add(jLabel1);
        jLabel1.setBounds(570, 210, 100, 30);

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Application :");
        ReportPanel.add(jLabel2);
        jLabel2.setBounds(60, 210, 100, 30);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Room :");
        ReportPanel.add(jLabel3);
        jLabel3.setBounds(320, 210, 130, 30);

        jButton1.setText("Generate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        ReportPanel.add(jButton1);
        jButton1.setBounds(690, 490, 110, 30);

        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Available Room : ");
        ReportPanel.add(jLabel8);
        jLabel8.setBounds(320, 260, 120, 16);

        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Unavailable Room : ");
        ReportPanel.add(jLabel10);
        jLabel10.setBounds(320, 300, 130, 16);

        ReportPanel1.setBackground(new java.awt.Color(74, 31, 61));
        ReportPanel1.setPreferredSize(new java.awt.Dimension(852, 550));
        ReportPanel1.setLayout(null);

        NaviBar1.setBackground(new java.awt.Color(74, 31, 61));
        NaviBar1.setMinimumSize(new java.awt.Dimension(852, 80));

        Logo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logo.png"))); // NOI18N

        Wednesday1.setBackground(new java.awt.Color(255, 255, 255));
        Wednesday1.setFont(new java.awt.Font("Imprint MT Shadow", 0, 12)); // NOI18N
        Wednesday1.setForeground(new java.awt.Color(255, 255, 255));
        Wednesday1.setText("WEDNESDAY");

        ManageInfo1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageInfo1.setForeground(new java.awt.Color(255, 255, 255));
        ManageInfo1.setText("Manage Info");
        ManageInfo1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageInfo1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageInfo1MouseClicked(evt);
            }
        });

        ManageApplication1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        ManageApplication1.setForeground(new java.awt.Color(255, 255, 255));
        ManageApplication1.setText("Manage Application");
        ManageApplication1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ManageApplication1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ManageApplication1MouseClicked(evt);
            }
        });

        CheckRecord1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        CheckRecord1.setForeground(new java.awt.Color(255, 255, 255));
        CheckRecord1.setText("Check Record");
        CheckRecord1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        CheckRecord1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckRecord1MouseClicked(evt);
            }
        });

        Report1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Report1.setForeground(new java.awt.Color(255, 255, 255));
        Report1.setText("Report");
        Report1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Report1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Report1MouseClicked(evt);
            }
        });

        Logout1.setFont(new java.awt.Font("Maiandra GD", 1, 18)); // NOI18N
        Logout1.setForeground(new java.awt.Color(255, 255, 255));
        Logout1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Logout.png"))); // NOI18N
        Logout1.setText("Logout");
        Logout1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Logout1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout NaviBar1Layout = new javax.swing.GroupLayout(NaviBar1);
        NaviBar1.setLayout(NaviBar1Layout);
        NaviBar1Layout.setHorizontalGroup(
            NaviBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBar1Layout.createSequentialGroup()
                .addGroup(NaviBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(NaviBar1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(Wednesday1))
                    .addGroup(NaviBar1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(Logo1, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26)
                .addComponent(ManageApplication1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CheckRecord1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(ManageInfo1)
                .addGap(18, 18, 18)
                .addComponent(Report1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addComponent(Logout1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );
        NaviBar1Layout.setVerticalGroup(
            NaviBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(NaviBar1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(NaviBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Logo1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, NaviBar1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ManageInfo1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(ManageApplication1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CheckRecord1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Report1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Logout1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Wednesday1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9))
        );

        ReportPanel1.add(NaviBar1);
        NaviBar1.setBounds(0, 0, 852, 100);
        ReportPanel1.add(jSeparator2);
        jSeparator2.setBounds(0, 180, 850, 20);

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setMinimumSize(new java.awt.Dimension(852, 80));

        ReportTitle1.setFont(new java.awt.Font("Maiandra GD", 1, 24)); // NOI18N
        ReportTitle1.setForeground(new java.awt.Color(74, 31, 61));
        ReportTitle1.setText("Report");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(371, 371, 371)
                .addComponent(ReportTitle1)
                .addContainerGap(404, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(ReportTitle1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        ReportPanel1.add(jPanel3);
        jPanel3.setBounds(0, 100, 852, 80);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Income :");
        ReportPanel1.add(jLabel11);
        jLabel11.setBounds(570, 210, 100, 30);

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Application :");
        ReportPanel1.add(jLabel12);
        jLabel12.setBounds(60, 210, 100, 30);

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Room :");
        ReportPanel1.add(jLabel13);
        jLabel13.setBounds(320, 210, 130, 30);

        jButton2.setText("Generate");
        ReportPanel1.add(jButton2);
        jButton2.setBounds(690, 490, 110, 30);

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Declined Application : ");
        ReportPanel1.add(jLabel14);
        jLabel14.setBounds(60, 340, 130, 16);

        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Pending Application : ");
        ReportPanel1.add(jLabel15);
        jLabel15.setBounds(60, 260, 120, 16);

        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Approved Application : ");
        ReportPanel1.add(jLabel16);
        jLabel16.setBounds(60, 300, 130, 16);

        PA.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(PA);
        PA.setBounds(190, 260, 90, 20);

        AA.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(AA);
        AA.setBounds(190, 340, 90, 20);

        DA.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(DA);
        DA.setBounds(200, 300, 90, 20);

        AR.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(AR);
        AR.setBounds(430, 260, 90, 20);

        UR.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(UR);
        UR.setBounds(430, 300, 90, 20);

        PI.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(PI);
        PI.setBounds(700, 300, 90, 20);

        TI.setForeground(new java.awt.Color(255, 255, 255));
        ReportPanel1.add(TI);
        TI.setBounds(690, 260, 90, 20);

        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Total Income (RM) :");
        ReportPanel1.add(jLabel28);
        jLabel28.setBounds(570, 260, 120, 16);

        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("Pending Income (RM) :");
        ReportPanel1.add(jLabel29);
        jLabel29.setBounds(570, 300, 120, 16);

        jLabel18.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ReportPanel1.add(jLabel18);
        jLabel18.setBounds(550, 200, 250, 270);

        jLabel19.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ReportPanel1.add(jLabel19);
        jLabel19.setBounds(50, 200, 250, 270);

        jLabel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ReportPanel1.add(jLabel7);
        jLabel7.setBounds(300, 200, 250, 270);

        ReportPanel.add(ReportPanel1);
        ReportPanel1.setBounds(0, 0, 852, 550);

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Pending Application : ");
        ReportPanel.add(jLabel20);
        jLabel20.setBounds(320, 260, 120, 16);

        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Approved Application : ");
        ReportPanel.add(jLabel21);
        jLabel21.setBounds(320, 300, 130, 16);

        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("Declined Application : ");
        ReportPanel.add(jLabel22);
        jLabel22.setBounds(320, 340, 130, 16);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("Pending Application : ");
        ReportPanel.add(jLabel23);
        jLabel23.setBounds(570, 260, 120, 16);

        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Approved Application : ");
        ReportPanel.add(jLabel24);
        jLabel24.setBounds(570, 300, 130, 16);

        jLabel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        ReportPanel.add(jLabel5);
        jLabel5.setBounds(550, 200, 250, 270);

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("Declined Application : ");
        ReportPanel.add(jLabel25);
        jLabel25.setBounds(570, 340, 130, 16);

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("Pending Application : ");
        ReportPanel.add(jLabel26);
        jLabel26.setBounds(330, 260, 120, 16);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ReportPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ManageInfoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInfoMouseClicked
        // TODO add your handling code here:
        AdminPage ap = new AdminPage();
        ap.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageInfoMouseClicked

    private void ManageApplicationMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageApplicationMouseClicked
        // TODO add your handling code here:
        ManageApplication ma = new ManageApplication();
        ma.setVisible(true);
        dispose();
    }//GEN-LAST:event_ManageApplicationMouseClicked

    private void CheckRecordMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckRecordMouseClicked
        // TODO add your handling code here:
        CheckRecord cr = new CheckRecord();
        cr.setVisible(true);
        dispose();
    }//GEN-LAST:event_CheckRecordMouseClicked

    private void ReportMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ReportMouseClicked
        // TODO add your handling code here:
        Report r = new Report();
        r.setVisible(true);
        dispose();
    }//GEN-LAST:event_ReportMouseClicked

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

    private void ManageInfo1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageInfo1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageInfo1MouseClicked

    private void ManageApplication1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ManageApplication1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ManageApplication1MouseClicked

    private void CheckRecord1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckRecord1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckRecord1MouseClicked

    private void Report1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Report1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Report1MouseClicked

    private void Logout1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Logout1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Logout1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
                String line;
                try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                   int maxNumber = 0; 
                   int AmaxNumber = 0;
                   int DmaxNumber = 0;
                   while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(">");
                        String status = parts[7];
                        if(status.equals("Pending")){                        
                            maxNumber += 1;
                        }
                        if(status.equals("Approved")){                        
                            AmaxNumber += 1;
                        }
                        if(status.equals("Declined")){                        
                            DmaxNumber += 1;
                        }
                    }
                    
                    PA.setText(String.valueOf(maxNumber));
                    AA.setText(String.valueOf(AmaxNumber));
                    DA.setText(String.valueOf(DmaxNumber));
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                try (BufferedReader reader = new BufferedReader(new FileReader("AvailableRoom.txt"))) {
                   int maxNumber = 0; 
                   int UmaxNumber = 0;

                   while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(">");
                        String status = parts[3];
                        if(status.equals("Available")){                        
                            maxNumber += 1;
                        }
                        if(status.equals("Unavailable")){                        
                            UmaxNumber += 1;
                        }
                        
                    }
                    
                    AR.setText(String.valueOf(maxNumber));
                    UR.setText(String.valueOf(UmaxNumber));
                    
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
                
                try (BufferedReader reader = new BufferedReader(new FileReader("Application.txt"))) {
                   int maxNumber = 0; 
                   int UmaxNumber = 0;

                   while ((line = reader.readLine()) != null) {
                        String[] parts = line.split(">");
                        String payment = parts[8];
                        String amount = parts[9];
                        int intValue = Integer.parseInt(amount);
                        if(payment.equals("Done")){                        
                            maxNumber += intValue;
                        }
                        if(payment.equals("Pending")){                        
                            UmaxNumber += intValue;
                        }
                        
                    }
                    
                    TI.setText(String.valueOf(maxNumber));
                    PI.setText(String.valueOf(UmaxNumber));
                    
                    } catch (FileNotFoundException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Report.class.getName()).log(Level.SEVERE, null, ex);
        }
 

                
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Report.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Report().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AA;
    private javax.swing.JLabel AR;
    private javax.swing.JLabel CheckRecord;
    private javax.swing.JLabel CheckRecord1;
    private javax.swing.JLabel DA;
    private javax.swing.JLabel Logo;
    private javax.swing.JLabel Logo1;
    private javax.swing.JLabel Logout;
    private javax.swing.JLabel Logout1;
    private javax.swing.JLabel ManageApplication;
    private javax.swing.JLabel ManageApplication1;
    private javax.swing.JLabel ManageInfo;
    private javax.swing.JLabel ManageInfo1;
    private javax.swing.JPanel NaviBar;
    private javax.swing.JPanel NaviBar1;
    private javax.swing.JLabel PA;
    private javax.swing.JLabel PI;
    private javax.swing.JLabel Report;
    private javax.swing.JLabel Report1;
    private javax.swing.JPanel ReportPanel;
    private javax.swing.JPanel ReportPanel1;
    private javax.swing.JLabel ReportTitle;
    private javax.swing.JLabel ReportTitle1;
    private javax.swing.JLabel TI;
    private javax.swing.JLabel UR;
    private javax.swing.JLabel Wednesday;
    private javax.swing.JLabel Wednesday1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration//GEN-END:variables
}
