package com.wvsu_aims.account_login;

import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;

import java.awt.CardLayout;
import java.awt.event.ActionListener;
import java.util.concurrent.CountDownLatch;
import java.awt.event.ActionEvent;

import com.wvsu_aims.data.obj_ser.ObjSer;
import com.wvsu_aims.data.verify.Verify;
import com.wvsu_aims.data.Students;
import com.wvsu_aims.data.Student;

public class LogInStudent extends JPanel {
  private Student user;

  private JPanel jPanel2 = new JPanel();
  private JPanel jPanel1 = new JPanel();
  private JPanel jPanel3 = new JPanel();
  private JPanel jPanel4 = new JPanel();
  private JLabel yourIdLabel = new JLabel();
  private JLabel yourIdErrLabel = new JLabel();
  private JTextField yourIdTextField = new JTextField();
  private JPasswordField yourPswdTextField = new JPasswordField();
  private JLabel yourPswdLabel = new JLabel();
  private JLabel yourPswdErrLabel = new JLabel();
  private JButton backToChsAcctBtn = new JButton();
  private JButton logInStudentBtn = new JButton();
  private JPanel jPanel5 = new JPanel();
  private JLabel gradHatIcon = new JLabel();
  private JLabel scholarLabel = new JLabel();
  private JLabel welcomeLabel = new JLabel();

  public Student getUser() {
    return this.user;
  }

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
    yourIdLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    yourIdLabel.setForeground(new java.awt.Color(33, 33, 33));
    yourIdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    yourIdLabel.setText("Your ID:");
    yourIdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    yourIdLabel.setPreferredSize(new java.awt.Dimension(93, 16));

    yourIdErrLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    yourIdErrLabel.setForeground(new java.awt.Color(255, 38, 38));
    yourIdErrLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    yourIdErrLabel.setText("");
    yourIdErrLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    yourIdErrLabel.setPreferredSize(new java.awt.Dimension(93, 16));
    yourIdErrLabel.setVisible(false);

    yourPswdLabel.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
    yourPswdLabel.setForeground(new java.awt.Color(33, 33, 33));
    yourPswdLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    yourPswdLabel.setText("Your Password:");
    yourPswdLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    yourPswdLabel.setPreferredSize(new java.awt.Dimension(93, 16));

    yourPswdErrLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
    yourPswdErrLabel.setForeground(new java.awt.Color(255, 38, 38));
    yourPswdErrLabel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
    yourPswdErrLabel.setText("");
    yourPswdErrLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    yourPswdErrLabel.setPreferredSize(new java.awt.Dimension(93, 16));
    yourPswdErrLabel.setVisible(false);

    gradHatIcon.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    gradHatIcon.setForeground(new java.awt.Color(33, 33, 33));
    gradHatIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    gradHatIcon.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    gradHatIcon.setPreferredSize(new java.awt.Dimension(93, 16));
    gradHatIcon.setIcon(new ImageIcon("com/wvsu_aims/resources/si_blue.png"));

    scholarLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    scholarLabel.setForeground(new java.awt.Color(33, 33, 33));
    scholarLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    scholarLabel.setText("Scholar");
    scholarLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    scholarLabel.setPreferredSize(new java.awt.Dimension(93, 16));

    welcomeLabel.setFont(new java.awt.Font("Segoe UI", 0, 30)); // NOI18N
    welcomeLabel.setForeground(new java.awt.Color(33, 33, 33));
    welcomeLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    welcomeLabel.setText("Welcome");
    welcomeLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
    welcomeLabel.setPreferredSize(new java.awt.Dimension(93, 16));
  }

  private void addButtons() {
    backToChsAcctBtn.setBackground(new java.awt.Color(233, 233, 233));
    backToChsAcctBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    backToChsAcctBtn.setForeground(new java.awt.Color(33, 33, 33));
    backToChsAcctBtn.setText("Back");
    backToChsAcctBtn.setBorder(null);

    logInStudentBtn.setBackground(new java.awt.Color(255, 255, 255));
    logInStudentBtn.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
    logInStudentBtn.setForeground(new java.awt.Color(0, 87, 170));
    logInStudentBtn.setText("Log-in");
    logInStudentBtn.setBorder(javax.swing.BorderFactory
        .createCompoundBorder(
            new javax.swing.border.LineBorder(new java.awt.Color(0, 87, 170), 1,
                true),
            null));
    logInStudentBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
    logInStudentBtn.setOpaque(true);
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

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addGroup(jPanel5Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(welcomeLabel,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        137,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout
                        .createSequentialGroup()
                        .addComponent(scholarLabel,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            114,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(11, 11, 11))
                    .addComponent(gradHatIcon,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        137,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45)));
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(gradHatIcon,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    85,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(welcomeLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    27,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(scholarLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    28,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap()));

    javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
    jPanel3.setLayout(jPanel3Layout);
    jPanel3Layout.setHorizontalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jPanel5,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addGap(0, 0, 0)
                .addComponent(jPanel4,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)));
    jPanel3Layout.setVerticalGroup(
        jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout
                    .createParallelGroup(
                        javax.swing.GroupLayout.Alignment.LEADING,
                        false)
                    .addComponent(jPanel4,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE)
                    .addComponent(jPanel5,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)));
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
                .addComponent(jPanel3,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    380,
                    javax.swing.GroupLayout.PREFERRED_SIZE)));

    javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
    jPanel4.setLayout(jPanel4Layout);
    jPanel4Layout.setHorizontalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout
                        .createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(jPanel4Layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yourPswdTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                197,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourIdLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                66,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourIdErrLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                240,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourIdTextField,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                197,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourPswdLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                111,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yourPswdErrLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                200,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout
                        .createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(logInStudentBtn,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(backToChsAcctBtn,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            100,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(65, Short.MAX_VALUE)));
    jPanel4Layout.setVerticalGroup(
        jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(yourIdLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    25,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yourIdTextField,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    36,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(yourIdErrLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    30,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(yourPswdLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    25,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(yourPswdTextField,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    36,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(yourPswdErrLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    30,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addGroup(jPanel4Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backToChsAcctBtn,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        40,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logInStudentBtn,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        40,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(61, Short.MAX_VALUE)));

    contentPanel.add(this);
  }

  public void setChooseAccountButtonEvent(JPanel contentPanel) {
    backToChsAcctBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) contentPanel.getLayout()).show(contentPanel, "ChooseAccountPanel");
      }
    });
  }

  public void setLogInStudentButtonEvent(JPanel contentPanel, CountDownLatch logInSignal) {
    logInStudentBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        Students students = (Students) ObjSer.deserialize("com/wvsu_aims/data/obj_ser/students.ser");
        String textFieldId = yourIdTextField.getText();

        yourPswdErrLabel.setText("");
        yourPswdErrLabel.setVisible(false);

        if (Verify.textFieldIsEmpty(yourIdTextField)) {
          yourIdErrLabel.setText("Please enter your registered ID");
          yourIdErrLabel.setVisible(true);
          return;
        }

        Student student = students.getStudent(yourIdTextField.getText().trim());
        yourIdErrLabel.setText("");
        yourIdErrLabel.setVisible(false);

        if (student == null) {
          yourIdErrLabel.setText(
              "Account with ID '"
                  + textFieldId.substring(0, textFieldId.length() < 9 ? textFieldId.length() : 9)
                  + "' does not exist");
          yourIdErrLabel.setVisible(true);
          return;
        }

        yourIdErrLabel.setText("");
        yourIdErrLabel.setVisible(false);

        if (Verify.pswdFieldIsEmpty(yourPswdTextField)) {
          yourPswdErrLabel.setText("Please enter a password");
          yourPswdErrLabel.setVisible(true);
          return;
        } else if (Verify.pswdMatches(student, yourPswdTextField)) {
          yourPswdErrLabel.setText("Your password is incorrect");
          yourPswdErrLabel.setVisible(true);
          return;
        }

        user = student;
        logInSignal.countDown();
        JFrame main = (JFrame) SwingUtilities.getWindowAncestor(contentPanel);
        main.dispose();
      }
    });
  }

  LogInStudent() {
    this.setDimensions();
    this.addLabels();
    this.addButtons();
    this.addTextFields();
  }
}
