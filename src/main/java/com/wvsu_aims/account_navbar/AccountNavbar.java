package com.wvsu_aims.account_navbar;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.CardLayout;
import java.awt.Color;

public class AccountNavbar extends JPanel {
  private JLabel userProfileIcon = new JLabel();
  private JLabel userProfileLabel = new JLabel();
  private JButton biodataBtn = new JButton();
  private JButton subjectsBtn = new JButton();
  private JButton gradesBtn = new JButton();

  private void addLabels() {
    userProfileIcon.setIcon(new ImageIcon("com/wvsu_aims/resources/user_profile_icon.png"));
    userProfileIcon.setSize(new Dimension(45, 45));

    userProfileLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    userProfileLabel.setText("<html> Kazumaki Kuronami, Prince of Kuroshio<br> <i>2021M0660</i> </html>");
  }

  private void addButtons() {
    biodataBtn.setFont(new java.awt.Font("Roboto", Font.BOLD, 16)); // NOI18N
    biodataBtn.setText("Biodata");
    biodataBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 87, 170)));
    biodataBtn.setPreferredSize(new java.awt.Dimension(100, 40));
    biodataBtn.setBackground(new Color(255, 255, 255));

    subjectsBtn.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    subjectsBtn.setText("Subjects");
    subjectsBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(120, 120, 120)));
    subjectsBtn.setMaximumSize(new java.awt.Dimension(100, 40));
    subjectsBtn.setPreferredSize(new java.awt.Dimension(100, 40));
    subjectsBtn.setBackground(new Color(255, 255, 255));

    gradesBtn.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    gradesBtn.setText("Grades");
    gradesBtn.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(120, 120, 120)));
    gradesBtn.setPreferredSize(new java.awt.Dimension(100, 40));
    gradesBtn.setBackground(new Color(255, 255, 255));
  }

  private void setPanelLayout() {
    this.setPreferredSize(new Dimension(750, 100));
    javax.swing.GroupLayout thisLayout = new javax.swing.GroupLayout(this);
    this.setLayout(thisLayout);
    thisLayout.setHorizontalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(userProfileIcon)
                .addGap(20, 20, 20)
                .addComponent(userProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 281,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(biodataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(subjectsBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(gradesBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, 25)));
    thisLayout.setVerticalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
            .addGroup(thisLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(userProfileLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userProfileIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 47,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(thisLayout
                        .createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(biodataBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(subjectsBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(gradesBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(29, Short.MAX_VALUE)));
  }

  public void setBiodataButtonEvent(JPanel infoPanel, String constraints) {
    biodataBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) infoPanel.getLayout()).show(infoPanel, constraints);
        biodataBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 87, 170)));
        biodataBtn.setFont(new Font("Roboto", Font.BOLD, 16));
        subjectsBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));
        subjectsBtn.setFont(new Font("Roboto", Font.PLAIN, 16));
        gradesBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));
        gradesBtn.setFont(new Font("Roboto", Font.PLAIN, 16));
      }
    });
  }

  public void setSubjectsButtonEvent(JPanel infoPanel, String constraints) {
    subjectsBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) infoPanel.getLayout()).show(infoPanel, constraints);
        biodataBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));
        biodataBtn.setFont(new Font("Roboto", Font.PLAIN, 16));
        subjectsBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 87, 170)));
        subjectsBtn.setFont(new Font("Roboto", Font.BOLD, 16));
        gradesBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));
        gradesBtn.setFont(new Font("Roboto", Font.PLAIN, 16));
      }
    });
  }

  public void setGradesButtonEvent(JPanel infoPanel, String constraints) {
    gradesBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ev) {
        ((CardLayout) infoPanel.getLayout()).show(infoPanel, constraints);
        biodataBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));
        biodataBtn.setFont(new Font("Roboto", Font.PLAIN, 16));
        subjectsBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));
        subjectsBtn.setFont(new Font("Roboto", Font.PLAIN, 16));
        gradesBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 87, 170)));
        gradesBtn.setFont(new Font("Roboto", Font.BOLD, 16));
      }
    });
  }

  public AccountNavbar() {
    this.setBackground(new Color(255, 255, 255));
    this.addButtons();
    this.addLabels();
    this.setPanelLayout();
    this.setBorder(new LineBorder(new Color(0, 87, 170), 2, true));
  }
}