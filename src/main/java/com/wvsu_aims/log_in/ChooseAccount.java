package com.wvsu_aims.log_in;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JFrame;

public class ChooseAccount extends JPanel {

  public static void main(String args[]) {

  }

  ChooseAccount(JFrame frame) {
    JPanel jPanel2 = new javax.swing.JPanel();
    JLabel jLabel1 = new javax.swing.JLabel();
    JButton jButton1 = new javax.swing.JButton();
    JButton jButton2 = new javax.swing.JButton();
    JLabel jLabel2 = new javax.swing.JLabel();
    JLabel jLabel3 = new javax.swing.JLabel();

    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED),
        javax.swing.BorderFactory.createMatteBorder(30, 0, 0, 0, new java.awt.Color(0, 87, 170))));
    jPanel2.setPreferredSize(new java.awt.Dimension(600, 440));

    jLabel1.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
    jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel1.setText("Log-in as?");
    jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(33, 33, 33)));
    jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    jLabel1.setPreferredSize(new java.awt.Dimension(169, 44));

    jButton1.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    jButton1.setIcon(
        new javax.swing.ImageIcon("com/wvsu_aims/resources/faculty_icon.png")); // NOI18N
    jButton1.setBackground(new java.awt.Color(255, 255, 255));
    jButton1.setForeground(new java.awt.Color(33, 33, 33));
    jButton1.setIconTextGap(10);
    jButton1.setText("Faculty");
    jButton1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1, true));
    jButton1.setPreferredSize(new java.awt.Dimension(150, 50));

    jButton2.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    jButton2.setIcon(
        new javax.swing.ImageIcon("com/wvsu_aims/resources/scholar_icon.png")); // NOI18N
    jButton2.setBackground(new java.awt.Color(255, 255, 255));
    jButton2.setForeground(new java.awt.Color(33, 33, 33));
    jButton2.setIconTextGap(10);
    jButton2.setText("Student");
    jButton2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1, true));
    jButton2.setPreferredSize(new java.awt.Dimension(150, 50));

    jLabel2.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
    jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    jLabel2.setText("<html><center>West Visayas<br/>State University</html>");
    jLabel2.setPreferredSize(new java.awt.Dimension(229, 83));

    jLabel3.setIcon(new javax.swing.ImageIcon("com/wvsu_aims/resources/wvsu_main_campus_logo.png")); // NOI18N
    jLabel3.setPreferredSize(new java.awt.Dimension(120, 120));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)))));

    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 75,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(110, 110, 110)));

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(frame.getContentPane());
    frame.getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)));
    layout.setVerticalGroup(
        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)));

  }

}
