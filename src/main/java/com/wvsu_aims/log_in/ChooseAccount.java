package com.wvsu_aims.log_in;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;

import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;

public class ChooseAccount extends JPanel {

  private JLabel logInLabel = new JLabel();
  private JLabel wvsuLabel = new JLabel();
  private JLabel wvsuLogoIcon = new JLabel();
  private JButton facultyAccountBtn = new JButton();
  private JButton studentAccountBtn = new JButton();

  private void addLabels() {
    logInLabel.setFont(new java.awt.Font("Roboto", 0, 20)); // NOI18N
    logInLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    logInLabel.setText("Log-in as?");
    logInLabel.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0,
        new java.awt.Color(33, 33, 33)));
    logInLabel.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
    logInLabel.setPreferredSize(new java.awt.Dimension(169, 44));

    wvsuLabel.setFont(new java.awt.Font("Roboto", 0, 30)); // NOI18N
    wvsuLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    wvsuLabel.setText("<html><center>West Visayas<br/>State University</html>");
    wvsuLabel.setPreferredSize(new java.awt.Dimension(229, 83));

    wvsuLogoIcon.setIcon(new javax.swing.ImageIcon("com/wvsu_aims/resources/wvsu_main_campus_logo.png")); // NOI18N
    wvsuLogoIcon.setPreferredSize(new java.awt.Dimension(120, 120));
  }

  private void addButtons() {
    facultyAccountBtn.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    facultyAccountBtn.setIcon(
        new javax.swing.ImageIcon("com/wvsu_aims/resources/faculty_icon.png")); // NOI18N
    facultyAccountBtn.setBackground(new java.awt.Color(255, 255, 255));
    facultyAccountBtn.setForeground(new java.awt.Color(33, 33, 33));
    facultyAccountBtn.setIconTextGap(10);
    facultyAccountBtn.setText("Faculty");
    facultyAccountBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1, true));
    facultyAccountBtn.setPreferredSize(new java.awt.Dimension(150, 50));

    studentAccountBtn.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    studentAccountBtn.setIcon(
        new javax.swing.ImageIcon("com/wvsu_aims/resources/scholar_icon.png")); // NOI18N
    studentAccountBtn.setBackground(new java.awt.Color(255, 255, 255));
    studentAccountBtn.setForeground(new java.awt.Color(33, 33, 33));
    studentAccountBtn.setIconTextGap(10);
    studentAccountBtn.setText("Student");
    studentAccountBtn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1, true));
    studentAccountBtn.setPreferredSize(new java.awt.Dimension(150, 50));
  }

  public void setFacultyButtonEvent(JPanel contentPanel) {
    facultyAccountBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) contentPanel.getLayout()).show(contentPanel, "FacultyAccountPanel");
      }
    });

  }

  public void setStudentButtonEvent(JPanel contentPanel) {
    studentAccountBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) contentPanel.getLayout()).show(contentPanel, "StudentAccountPanel");
      }
    });
  }

  private void setDimensions() {
    this.setBackground(new java.awt.Color(255, 255, 255));
    this.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        null,
        javax.swing.BorderFactory.createMatteBorder(30, 0, 0, 0,
            new java.awt.Color(0, 87, 170))));
    this.setPreferredSize(new java.awt.Dimension(600, 440));
  }

  public void setPanelLayout(JPanel contentPanel) {

    javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(this);
    this.setLayout(panelLayout);
    panelLayout.setHorizontalGroup(
        panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(79, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        panelLayout.createSequentialGroup()
                            .addComponent(wvsuLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(50, 50, 50))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        panelLayout.createSequentialGroup()
                            .addComponent(wvsuLogoIcon,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(100, 100,
                                100)))
                .addGroup(panelLayout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        panelLayout
                            .createSequentialGroup()
                            .addGroup(panelLayout
                                .createParallelGroup(
                                    javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(facultyAccountBtn,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(studentAccountBtn,
                                    javax.swing.GroupLayout.PREFERRED_SIZE,
                                    javax.swing.GroupLayout.DEFAULT_SIZE,
                                    javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(80, 80, 80))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                        panelLayout
                            .createSequentialGroup()
                            .addComponent(logInLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(72, 72, 72)))));

    panelLayout.setVerticalGroup(
        panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(99, 99, 99)
                .addComponent(logInLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(facultyAccountBtn,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(studentAccountBtn,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(wvsuLogoIcon,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(wvsuLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    75,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)));

    contentPanel.add(this);
  }

  ChooseAccount() {
    this.addLabels();
    this.addButtons();
    this.setDimensions();
  }

}
