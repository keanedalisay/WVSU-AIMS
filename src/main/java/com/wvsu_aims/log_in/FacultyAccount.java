package com.wvsu_aims.log_in;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.ImageIcon;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class FacultyAccount extends JPanel {

  private JPanel jPanel2 = new JPanel();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel3 = new JPanel();
  private JPanel jPanel4 = new JPanel();
  private JLabel yourIdLabel = new JLabel();
  private JTextField yourIdTextField = new JTextField();
  private JTextField yourPswdTextField = new JTextField();
  private JLabel yourPswdLabel = new JLabel();
  private JButton backToChsAcctBtn = new JButton();
  private JButton logInFacultyBtn = new JButton();
  private JPanel jPanel5 = new JPanel();
  private JLabel facultyIcon = new JLabel();
  private JLabel facultyLabel = new JLabel();
  private JLabel greetingsLabel = new JLabel();

  private void setDimensions() {
    jPanel2.setBackground(new java.awt.Color(255, 255, 255));
    jPanel2.setPreferredSize(new java.awt.Dimension(0, 370));

    jPanel1.setBackground(new java.awt.Color(0, 87, 170));
    jPanel1.setPreferredSize(new java.awt.Dimension(600, 30));

    jPanel3.setBackground(new java.awt.Color(255, 255, 255));
    jPanel3.setPreferredSize(new java.awt.Dimension(600, 370));

    jPanel4.setBackground(new java.awt.Color(255, 255, 255));
    jPanel4.setPreferredSize(new java.awt.Dimension(324, 370));

    jPanel5.setBackground(new java.awt.Color(255, 255, 255));
  }

  private void addLabels() {
    facultyIcon.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    facultyIcon.setForeground(new java.awt.Color(33, 33, 33));
    facultyIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    facultyIcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    facultyIcon.setPreferredSize(new java.awt.Dimension(200, 500));
    facultyIcon.setIcon(new ImageIcon("com/wvsu_aims/resources/fi_blue.png"));

    facultyLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    facultyLabel.setForeground(new java.awt.Color(33, 33, 33));
    facultyLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    facultyLabel.setText("Faculty");
    facultyLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    facultyLabel.setMinimumSize(new Dimension(93, 33));

    greetingsLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    greetingsLabel.setForeground(new java.awt.Color(33, 33, 33));
    greetingsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    greetingsLabel.setText("Greetings");
    greetingsLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    greetingsLabel.setPreferredSize(new java.awt.Dimension(93, 50));

    yourIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    yourIdLabel.setForeground(new java.awt.Color(33, 33, 33));
    yourIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    yourIdLabel.setText("Your ID:");
    yourIdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    yourIdLabel.setPreferredSize(new java.awt.Dimension(93, 16));

    yourPswdLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    yourPswdLabel.setForeground(new java.awt.Color(33, 33, 33));
    yourPswdLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    yourPswdLabel.setText("Your Password:");
    yourPswdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    yourPswdLabel.setPreferredSize(new java.awt.Dimension(93, 16));
  }

  private void addTextFields() {
    yourIdTextField.setBackground(new java.awt.Color(255, 255, 255));
    yourIdTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    yourIdTextField.setForeground(new java.awt.Color(33, 33, 33));
    yourIdTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        new javax.swing.border.LineBorder(new java.awt.Color(120, 120, 120), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

    yourPswdTextField.setBackground(new java.awt.Color(255, 255, 255));
    yourPswdTextField.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    yourPswdTextField.setForeground(new java.awt.Color(33, 33, 33));
    yourPswdTextField.setBorder(javax.swing.BorderFactory.createCompoundBorder(
        new javax.swing.border.LineBorder(new java.awt.Color(120, 120, 120), 1, true),
        javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5)));

  }

  private void addButtons() {
    backToChsAcctBtn.setBackground(new java.awt.Color(233, 233, 233));
    backToChsAcctBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    backToChsAcctBtn.setForeground(new java.awt.Color(33, 33, 33));
    backToChsAcctBtn.setText("Back");
    backToChsAcctBtn.setBorder(null);

    logInFacultyBtn.setBackground(new java.awt.Color(255, 255, 255));
    logInFacultyBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    logInFacultyBtn.setForeground(new java.awt.Color(0, 87, 170));
    logInFacultyBtn.setText("Log-in");
    logInFacultyBtn.setBorder(javax.swing.BorderFactory
        .createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1, true),
            null));
    logInFacultyBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
    logInFacultyBtn.setOpaque(true);
  }

  public void setPanelLayout(JPanel contentPanel) {
    javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
    jPanel1.setLayout(jPanel1Layout);
    jPanel1Layout.setHorizontalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE));
    jPanel1Layout.setVerticalGroup(
        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE));

    javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
    jPanel2.setLayout(jPanel2Layout);
    jPanel2Layout.setHorizontalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE));
    jPanel2Layout.setVerticalGroup(
        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 406, Short.MAX_VALUE));

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
                            .addComponent(yourPswdTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                66,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourIdTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 197,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourPswdLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                111,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logInFacultyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(backToChsAcctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE)));
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(yourIdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yourIdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(yourPswdLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yourPswdTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 36,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToChsAcctBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInFacultyBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE)));

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(greetingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(facultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 114,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(facultyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 137,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)));
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(facultyIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 85,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(greetingsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 27,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(facultyLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 28,
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
    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
    this.setLayout(layout);
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

    contentPanel.add(this);
  }

  public void setChooseAccountButtonEvent(JPanel contentPanel) {
    backToChsAcctBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) contentPanel.getLayout()).show(contentPanel, "ChooseAccountPanel");
      }
    });
  }

  FacultyAccount() {
    this.setDimensions();
    this.addLabels();
    this.addTextFields();
    this.addButtons();
  }
}