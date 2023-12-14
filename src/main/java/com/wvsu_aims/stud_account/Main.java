package com.wvsu_aims.stud_account;

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

import com.wvsu_aims.account_nav.AccountNav;

public class Main extends JFrame {

  public static void main(String args[]) {
    Main main = new Main();
    AccountNav studAccountNav = new AccountNav();

    JPanel contentPanel = new JPanel();
    contentPanel.setBackground(new Color(255, 255, 255));
    Border contentPanelMargin = BorderFactory.createEmptyBorder(30, 0, 0, 0);
    contentPanel.setBorder(contentPanelMargin);
    contentPanel.add(studAccountNav);

    JPanel infoPanel = new JPanel();
    infoPanel.setBackground(new Color(255, 255, 255));
    infoPanel.setBorder(BorderFactory.createEmptyBorder(1, 1, 1, 1));
    infoPanel.setLayout(new CardLayout());

    Biodata biodataPanel = new Biodata();
    Subjects subjectsPanel = new Subjects();
    Grades gradesPanel = new Grades();
    infoPanel.add(biodataPanel, "stud_biodata");
    infoPanel.add(subjectsPanel, "stud_subjects");
    infoPanel.add(gradesPanel, "stud_grades");

    contentPanel.add(infoPanel);

    main.setDimensions();
    main.add(contentPanel);
    main.setVisible(true);
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