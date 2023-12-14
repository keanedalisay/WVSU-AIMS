package com.wvsu_aims.account_stud;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.BorderFactory;
import javax.swing.border.Border;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.CardLayout;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;

import com.wvsu_aims.account_navbar.AccountNavbar;
import com.wvsu_aims.data.Student;

public class StudentAccount extends JFrame {

  AccountNavbar studAccountNav = new AccountNavbar();
  JPanel contentPanel = new JPanel();

  public StudentAccount(Student user) {
    contentPanel.setBackground(new Color(255, 255, 255));
    Border contentPanelMargin = BorderFactory.createEmptyBorder(30, 0, 0, 0);
    contentPanel.setBorder(contentPanelMargin);
    contentPanel.add(studAccountNav);

    JPanel infoPanel = new JPanel();
    infoPanel.setBackground(new Color(255, 255, 255));
    infoPanel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    infoPanel.setLayout(new CardLayout());

    StudentBiodata biodataPanel = new StudentBiodata(user);
    StudentSubjects subjectsPanel = new StudentSubjects();
    StudentGrades gradesPanel = new StudentGrades();
    infoPanel.add(biodataPanel, "StudentBiodataPanel");
    infoPanel.add(subjectsPanel, "StudentSubjectsPanel");
    infoPanel.add(gradesPanel, "StudentGradesPanel");

    studAccountNav.setBiodataButtonEvent(infoPanel, "StudentBiodataPanel");
    studAccountNav.setSubjectsButtonEvent(infoPanel, "StudentSubjectsPanel");
    studAccountNav.setGradesButtonEvent(infoPanel, "StudentGradesPanel");

    contentPanel.add(infoPanel);

    this.setDimensions();
    this.add(contentPanel);
  }

  public void setDimensions() {
    GraphicsDevice gd = GraphicsEnvironment.getLocalGraphicsEnvironment().getDefaultScreenDevice();
    int height = gd.getDisplayMode().getHeight();

    this.setMinimumSize(new Dimension(1000, height));
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setResizable(false);
    this.setIconImage(new ImageIcon("com/wvsu_aims/resources/wvsu_main_campus_logo.png").getImage());
    this.setTitle("Academic Information Management System");
  }
}