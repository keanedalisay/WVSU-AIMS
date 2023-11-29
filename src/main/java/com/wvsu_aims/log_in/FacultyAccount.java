package com.wvsu_aims.log_in;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.Dimension;

public class FacultyAccount extends JPanel {
  public static void main(String args[]) {

  }

  FacultyAccount(JFrame frame) {
    JPanel jPanel2 = new JPanel();
    JPanel jPanel1 = new JPanel();
    JPanel jPanel3 = new JPanel();
    JPanel jPanel4 = new JPanel();
    JLabel jLabel3 = new JLabel();
    JTextField jTextField1 = new JTextField();
    JTextField jTextField2 = new JTextField();
    JLabel jLabel5 = new JLabel();
    JButton jButton1 = new JButton();
    JButton jButton2 = new JButton();
    JPanel jPanel5 = new JPanel();
    JLabel jLabel4 = new JLabel();
    JLabel jLabel1 = new JLabel();
    JLabel jLabel7 = new JLabel();

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setPreferredSize(new java.awt.Dimension(0, 370));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE));

    jPanel1.setBackground(new java.awt.Color(0, 87, 170));
    jPanel1.setPreferredSize(new java.awt.Dimension(600, 30));

    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setPreferredSize(new java.awt.Dimension(600, 370));

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setPreferredSize(new java.awt.Dimension(324, 370));

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(33, 33, 33));
    jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel3.setText("Your ID:");
    jLabel3.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel3.setPreferredSize(new java.awt.Dimension(93, 16));

    jTextField1.setBackground(new java.awt.Color(255, 255, 255));
    jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jTextField1.setForeground(new java.awt.Color(33, 33, 33));
    jTextField1.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        new javax.swing.border.LineBorder(new java.awt.Color(120, 120, 120), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    jTextField2.setBackground(new java.awt.Color(255, 255, 255));
    jTextField2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jTextField2.setForeground(new java.awt.Color(33, 33, 33));
    jTextField2.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        new javax.swing.border.LineBorder(new java.awt.Color(120, 120, 120), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    jLabel5.setForeground(new java.awt.Color(33, 33, 33));
    jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel5.setText("Your Password:");
    jLabel5.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel5.setPreferredSize(new java.awt.Dimension(93, 16));

    jButton1.setBackground(new java.awt.Color(233, 233, 233));
    jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jButton1.setForeground(new java.awt.Color(33, 33, 33));
    jButton1.setText("Back");
    jButton1.setBorder(null);

    jButton2.setBackground(new java.awt.Color(255, 255, 255));
    jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    jButton2.setForeground(new java.awt.Color(0, 87, 170));
    jButton2.setText("Log-in");
    jButton2.setBorder(javax.swing.BorderFactory
        .createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1, true),
            null));
    jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
    jButton2.setOpaque(true);

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                                66,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                                111,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE)));
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE)));

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));

    jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    jLabel4.setForeground(new java.awt.Color(33, 33, 33));
    jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel4.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel4.setPreferredSize(new java.awt.Dimension(200, 500));
    jLabel4.setIcon(new ImageIcon("com/wvsu_aims/resources/fi_blue.png"));

    jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    jLabel1.setForeground(new java.awt.Color(33, 33, 33));
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Faculty");
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel1.setMinimumSize(new Dimension(93, 33));

    jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    jLabel7.setForeground(new java.awt.Color(33, 33, 33));
    jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel7.setText("Greetings");
    jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    jLabel7.setPreferredSize(new java.awt.Dimension(93, 50));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)));
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)));
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
    frame.getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                javax.swing.GroupLayout.DEFAULT_SIZE,
                javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 380,
                    javax.swing.GroupLayout.PREFERRED_SIZE)));
  }
}