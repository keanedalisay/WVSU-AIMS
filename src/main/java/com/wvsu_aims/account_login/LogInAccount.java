package com.wvsu_aims.account_login;

import javax.swing.JFrame;
import javax.swing.JPanel;

import com.wvsu_aims.data.Student;

import javax.swing.ImageIcon;

import java.awt.CardLayout;
import java.awt.Dimension;
import java.util.concurrent.CountDownLatch;

public class LogInAccount extends JFrame {
  private CardLayout cardLayout = new CardLayout();
  private JPanel contentPanel = new JPanel();
  private ChooseAccount chooseAccount = new ChooseAccount();
  private LogInStudent studentAccount = new LogInStudent();
  private LogInFaculty facultyAccount = new LogInFaculty();

  public LogInAccount(CountDownLatch logInSignal) {
    contentPanel.setLayout(cardLayout);

    chooseAccount.setFacultyButtonEvent(contentPanel);
    chooseAccount.setStudentButtonEvent(contentPanel);
    chooseAccount.setPanelLayout(contentPanel);

    studentAccount.setPanelLayout(contentPanel);
    studentAccount.setChooseAccountButtonEvent(contentPanel);
    studentAccount.setLogInStudentButtonEvent(contentPanel, logInSignal);

    facultyAccount.setPanelLayout(contentPanel);
    facultyAccount.setChooseAccountButtonEvent(contentPanel);

    contentPanel.add(chooseAccount, "ChooseAccountPanel");
    contentPanel.add(studentAccount, "StudentAccountPanel");
    contentPanel.add(facultyAccount, "FacultyAccountPanel");

    this.add(contentPanel);
    this.setDimensions();
  }

  public Student getUser() {
    return this.studentAccount.getUser();
  }

  private void setDimensions() {
    this.setMinimumSize(new Dimension(600, 440));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setIconImage(new ImageIcon("com/wvsu_aims/resources/wvsu_main_campus_logo.png").getImage());
    this.setTitle("Academic Information Management System");
  }
}
