package com.wvsu_aims.log_in;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.ImageIcon;

import java.awt.CardLayout;
import java.awt.Dimension;

public class Main extends JFrame {

  public static void main(String[] args) {
    Main main = new Main();

    CardLayout cardLayout = new CardLayout();
    JPanel contentPanel = new JPanel();

    // Do dependency injection instead
    ChooseAccount chooseAccount = new ChooseAccount();
    StudentAccount studentAccount = new StudentAccount();
    FacultyAccount facultyAccount = new FacultyAccount();

    contentPanel.setLayout(cardLayout);

    chooseAccount.setFacultyButtonEvent(contentPanel);
    chooseAccount.setStudentButtonEvent(contentPanel);
    chooseAccount.setPanelLayout(contentPanel);

    studentAccount.setPanelLayout(contentPanel);
    studentAccount.setChooseAccountButtonEvent(contentPanel);
    studentAccount.setLogInStudentButtonEvent(contentPanel);

    facultyAccount.setPanelLayout(contentPanel);
    facultyAccount.setChooseAccountButtonEvent(contentPanel);

    contentPanel.add(chooseAccount, "ChooseAccountPanel");
    contentPanel.add(studentAccount, "StudentAccountPanel");
    contentPanel.add(facultyAccount, "FacultyAccountPanel");

    main.add(contentPanel);
    main.setDimensions();
    main.setVisible(true);
  }

  private void setDimensions() {
    this.setMinimumSize(new Dimension(600, 440));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setIconImage(new ImageIcon("com/wvsu_aims/resources/wvsu_main_campus_logo.png").getImage());
    this.setTitle("Academic Information Management System");
  }
}
