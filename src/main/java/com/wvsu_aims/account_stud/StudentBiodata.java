package com.wvsu_aims.account_stud;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.border.LineBorder;

import com.wvsu_aims.data.Student;

import javax.swing.BorderFactory;

import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

public class StudentBiodata extends JPanel {
  private Student user;

  private JLabel studAgeLabel = new JLabel();
  private JLabel dateOfBirthLabel = new JLabel();
  private JLabel sexLabel = new JLabel();
  private JLabel emailLabel = new JLabel();
  private JLabel mBioHeading = new JLabel();
  private JLabel mMaidenLabel = new JLabel();
  private JLabel mFirstNameLabel = new JLabel();
  private JLabel mMidInitLabel = new JLabel();
  private JLabel mLastNameLabel = new JLabel();
  private JLabel fBioHeading = new JLabel();
  private JLabel fFirstNameLabel = new JLabel();
  private JLabel fMidInitLabel = new JLabel();
  private JLabel fLastNameLabel = new JLabel();
  private JButton logOutBtn = new JButton();

  private JPanel studBioPanel = new JPanel();
  private JPanel jPanel5 = new JPanel();
  private JPanel jPanel8 = new JPanel();

  private void addStudBio() {
    studBioPanel.setBackground(new java.awt.Color(255, 255, 255));
    studBioPanel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));

    studAgeLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    studAgeLabel.setText("<html>\n<b>Age:</b> " + user.getBiodata().getAge() + "\n</html>");

    dateOfBirthLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    dateOfBirthLabel.setText("<html> <b> Date of Birth: </b>" + user.getBiodata().getDateOfBirth() + "</html>");

    sexLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    sexLabel.setText("<html>\n<b>\nSex:\n</b>\nMale\n</html>");

    emailLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    emailLabel.setText("<html> <b> Email: </b> PrinceMaki@kuroshio.gov </html>");

    javax.swing.GroupLayout studBioPanelLayout = new javax.swing.GroupLayout(studBioPanel);
    studBioPanel.setLayout(studBioPanelLayout);
    studBioPanelLayout.setHorizontalGroup(
        studBioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studBioPanelLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(studBioPanelLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studBioPanelLayout.createSequentialGroup()
                        .addComponent(studAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(studBioPanelLayout.createSequentialGroup()
                        .addGroup(studBioPanelLayout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(emailLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dateOfBirthLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))));
    studBioPanelLayout.setVerticalGroup(
        studBioPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studBioPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(studBioPanelLayout
                    .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studAgeLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addComponent(dateOfBirthLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(sexLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(emailLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, 30)));
  }

  private void addMothersBio() {
    jPanel5.setBackground(new java.awt.Color(255, 255, 255));

    mBioHeading.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    mBioHeading.setForeground(new Color(0, 87, 170));
    mBioHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    mBioHeading.setText("Mother's Biodata");

    mMaidenLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    mMaidenLabel
        .setText("<html><i>Name corresponds to maiden name (with exception to titles of nobility)</i></html>");

    mFirstNameLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    mFirstNameLabel.setText("<html>\n<b>\nFirst Name:\n</b>\nShiroko, Empress of Kuroshio\n</html>");

    mMidInitLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    mMidInitLabel.setText("<html>\n<b>\nMiddle Initial:\n</b>\nN/A\n</html>");

    mLastNameLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    mLastNameLabel.setText("<html> <b> Last Name: </b> Sunaookami - Kuronami </html>");

    javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
    jPanel5.setLayout(jPanel5Layout);
    jPanel5Layout.setHorizontalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(mBioHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 209,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(mMaidenLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel5Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mMidInitLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mFirstNameLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mLastNameLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
    jPanel5Layout.setVerticalGroup(
        jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(mBioHeading)
                .addGap(10, 10, 10)
                .addComponent(mMaidenLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(mFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mMidInitLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(mLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, 30)));

  }

  private void addFathersBio() {
    jPanel8.setBackground(new java.awt.Color(255, 255, 255));

    fBioHeading.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    fBioHeading.setForeground(new Color(0, 87, 170));
    fBioHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    fBioHeading.setText("Father's Biodata");

    fFirstNameLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    fFirstNameLabel.setText("<html> <b> First Name: </b> Junichi, Emperor of Kuroshio </html>");

    fMidInitLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    fMidInitLabel.setText("<html>\n<b>\nMiddle Initial:\n</b>\nN/A\n</html>");

    fLastNameLabel.setFont(new java.awt.Font("Roboto", 0, 16)); // NOI18N
    fLastNameLabel.setText("<html> <b> Last Name: </b> Kuronami </html>");

    javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
    jPanel8.setLayout(jPanel8Layout);
    jPanel8Layout.setHorizontalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(fBioHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 180,
                            javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel8Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fMidInitLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fFirstNameLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fLastNameLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(632, Short.MAX_VALUE)));
    jPanel8Layout.setVerticalGroup(
        jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addComponent(fBioHeading)
                .addGap(15, 15, 15)
                .addComponent(fFirstNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fMidInitLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fLastNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE)));
  }

  private void setPanelLayout() {
    javax.swing.GroupLayout thisLayout = new javax.swing.GroupLayout(this);
    this.setLayout(thisLayout);
    thisLayout.setHorizontalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(studBioPanel, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap()));
    thisLayout.setVerticalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(studBioPanel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE)));
  }

  StudentBiodata(Student user) {
    this.user = user;
    this.setBackground(new java.awt.Color(255, 255, 255));
    this.setPreferredSize(new Dimension(750, 750));

    logOutBtn.setFont(new Font("Roboto", Font.BOLD, 14)); // NOI18N
    logOutBtn.setForeground(new Color(0, 87, 170));
    logOutBtn.setBackground(new Color(255, 255, 255));
    logOutBtn.setText("Log-Out");
    logOutBtn.setBorder(new LineBorder(new Color(0, 87, 170), 1, true));
    logOutBtn.setPreferredSize(new Dimension(80, 30));

    this.addStudBio();
    this.addMothersBio();
    this.addFathersBio();
    this.setPanelLayout();
  }
}