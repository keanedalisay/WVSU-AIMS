package com.wvsu_aims.stud_account;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.BorderFactory;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;

public class Subjects extends JPanel {
  private JPanel jPanel9 = new JPanel();
  private JButton logOutBtn = new JButton();
  private JLabel courseLabel = new JLabel();
  private JLabel sectionLabel = new JLabel();
  private JLabel schoolYearLabel = new JLabel();
  private JLabel semesterLabel = new JLabel();
  private JLabel collegeLevelLabel = new JLabel();
  private JLabel esHeading = new JLabel();
  private JTable eSTable = new JTable();
  private JScrollPane jScrollPane1 = new JScrollPane();

  private void addStudCourse() {
    courseLabel.setFont(new Font("Roboto", 0, 16)); // NOI18N
    courseLabel.setText("<html>\n<b>Course:</b> Bachelor of Science in Computer Science\n</html>");

    sectionLabel.setFont(new Font("Roboto", 0, 16)); // NOI18N
    sectionLabel.setText("<html> <b> Section: </b> BSCS-2B </html>");

    schoolYearLabel.setFont(new Font("Roboto", 0, 16)); // NOI18N
    schoolYearLabel.setText("<html>\n<b>\nSchool Year:\n</b>\n2023-2024\n</html>");

    semesterLabel.setFont(new Font("Roboto", 0, 16)); // NOI18N
    semesterLabel.setText("<html> <b> Semester: </b> First </html>");

    collegeLevelLabel.setFont(new Font("Roboto", 0, 16)); // NOI18N
    collegeLevelLabel.setText("<html> <b> College Level: </b> Second </html>");

    jPanel9.setBackground(new Color(255, 255, 255));
    jPanel9.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));

    javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
    jPanel9.setLayout(jPanel9Layout);
    jPanel9Layout.setHorizontalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                            230, 230)
                        .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGroup(jPanel9Layout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collegeLevelLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(schoolYearLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(semesterLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectionLabel,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))));
    jPanel9Layout.setVerticalGroup(
        jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutBtn, javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(sectionLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(schoolYearLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(semesterLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(collegeLevelLabel, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, 25)));

  }

  private void addEnrolledSubjects() {
    esHeading.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    esHeading.setForeground(new Color(0, 87, 170));
    esHeading.setText("Enrolled Subjects");

    eSTable.setAutoCreateRowSorter(true);
    eSTable.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
    eSTable.setFont(new Font("Roboto", 0, 14)); // NOI18N
    eSTable.setSize(new Dimension(100, 200));
    eSTable.setShowVerticalLines(true);
    eSTable.setShowHorizontalLines(false);
    eSTable.setGridColor(new Color(120, 120, 120));
    eSTable.setRowHeight(20);
    eSTable.setModel(new DefaultTableModel(
        new Object[][] {
            { "Software Engineering II", "CCS 227", "John Deere" },
            { "Data Structures and Algorithms", "CC 204", "Jane Deere" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" },
            { "World History III (Elective)", "HIST 205", "Tally Evans" }
        },
        new String[] {
            "Subject Name", "Subject Code", "Lecturer"
        }) {
      boolean[] canEdit = new boolean[] {
          false, false, false
      };

      public boolean isCellEditable(int rowIndex, int columnIndex) {
        return canEdit[columnIndex];
      }
    });

    JTableHeader eSTableHeader = eSTable.getTableHeader();
    eSTableHeader.setFont(new Font("Roboto", Font.BOLD, 12));
    eSTableHeader.setPreferredSize(new Dimension(eSTableHeader.getWidth(), 20));
    eSTableHeader.setBackground(new Color(240, 240, 240));
    eSTableHeader.setResizingAllowed(false);
    eSTable.setTableHeader(eSTableHeader);

    jScrollPane1.setViewportView(eSTable);
    jScrollPane1.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
  }

  private void setPanelLayout() {
    javax.swing.GroupLayout thisLayout = new javax.swing.GroupLayout(this);
    this.setLayout(thisLayout);
    thisLayout.setHorizontalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addGroup(thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thisLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(thisLayout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addGroup(thisLayout
                            .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1,
                                javax.swing.GroupLayout.PREFERRED_SIZE, 675,
                                javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(esHeading))
                        .addGap(0, 31, Short.MAX_VALUE)))
                .addContainerGap()));
    thisLayout.setVerticalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(esHeading, javax.swing.GroupLayout.PREFERRED_SIZE, 34,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100,
                    javax.swing.GroupLayout.PREFERRED_SIZE)));
  }

  public Subjects() {
    this.setBackground(new Color(255, 255, 255));
    this.setPreferredSize(new Dimension(750, 750));

    logOutBtn.setFont(new Font("Roboto", Font.BOLD, 14)); // NOI18N
    logOutBtn.setForeground(new Color(0, 87, 170));
    logOutBtn.setText("Log-Out");
    logOutBtn.setBackground(new Color(255, 255, 255));
    logOutBtn.setBorder(new LineBorder(new Color(0, 87, 170), 1, true));
    logOutBtn.setPreferredSize(new Dimension(80, 30));

    this.addStudCourse();
    this.addEnrolledSubjects();

    this.setPanelLayout();
  }
}