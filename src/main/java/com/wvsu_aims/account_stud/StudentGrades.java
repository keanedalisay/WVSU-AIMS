package com.wvsu_aims.account_stud;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.SwingUtilities;
import javax.swing.table.JTableHeader;
import javax.swing.JLayeredPane;
import javax.swing.JScrollPane;
import javax.swing.BorderFactory;

import java.awt.Dimension;
import java.awt.Color;
import java.awt.Font;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StudentGrades extends JPanel {
  JPanel jPanel10 = new JPanel();
  JPanel jPanel11 = new JPanel();
  JPanel jPanel12 = new JPanel();
  JButton logOutBtn = new JButton();
  JLabel courseLabel = new JLabel();
  JLabel sectionLabel = new JLabel();
  JLabel schoolYearLabel = new JLabel();
  JLabel semesterLabel = new JLabel();
  JLabel collegeLevelLabel = new JLabel();
  JLabel jLabel28 = new JLabel();
  JLabel jLabel29 = new JLabel();
  JLabel jLabel30 = new JLabel();
  JLabel jLabel31 = new JLabel();
  JLabel collegeLevelBtnLabel = new JLabel();
  JButton collegeScdBtn = new JButton();
  JButton collegeFstBtn = new JButton();
  JTable jTable2 = new JTable();
  JTable jTable3 = new JTable();
  JTable jTable4 = new JTable();
  JTable jTable5 = new JTable();
  JLayeredPane jLayeredPane2 = new JLayeredPane();
  JLayeredPane jLayeredPane3 = new JLayeredPane();
  JScrollPane jScrollPane2 = new JScrollPane();
  JScrollPane jScrollPane3 = new JScrollPane();
  JScrollPane jScrollPane4 = new JScrollPane();
  JScrollPane jScrollPane5 = new JScrollPane();

  private void addStudCourse() {
    jPanel10.setBackground(new Color(255, 255, 255));
    jPanel10.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new Color(120, 120, 120)));

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

    javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
    jPanel10.setLayout(jPanel10Layout);
    jPanel10Layout.setHorizontalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel10Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout
                        .createSequentialGroup()
                        .addComponent(courseLabel,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(
                            javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                            230,
                            230)
                        .addComponent(logOutBtn,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))
                    .addGroup(jPanel10Layout
                        .createSequentialGroup()
                        .addGroup(jPanel10Layout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
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
    jPanel10Layout.setVerticalGroup(
        jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel10Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(courseLabel,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logOutBtn,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        javax.swing.GroupLayout.DEFAULT_SIZE,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addComponent(sectionLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(schoolYearLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(semesterLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(collegeLevelLabel,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, 25)));
  }

  private void addFstYearGrades() {
    jPanel11.setBackground(new Color(255, 255, 255));

    jLabel28.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    jLabel28.setForeground(new Color(0, 87, 170));
    jLabel28.setText("First Semester");

    jTable2.setAutoCreateRowSorter(true);
    jTable2.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
    jTable2.setFont(new Font("Roboto", 0, 14)); // NOI18N
    jTable2.setSize(new Dimension(100, 200));
    jTable2.setShowVerticalLines(true);
    jTable2.setShowHorizontalLines(false);
    jTable2.setGridColor(new Color(120, 120, 120));
    jTable2.setRowHeight(20);
    jTable2.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {
            { "Software Engineering II", "CCS 227", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "World History III (Elective)", "HIST 205", "1.0" }
        },
        new String[] {
            "Course Name", "Code", "Final Grade"
        }));
    JTableHeader jTable2Header = jTable2.getTableHeader();
    jTable2Header.setResizingAllowed(false);
    jTable2Header.setFont(new Font("Roboto", Font.BOLD, 12));
    jTable2Header.setBackground(new Color(240, 240, 240));

    jTable2.setTableHeader(jTable2Header);

    jScrollPane2.setViewportView(jTable2);
    jScrollPane2.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    jLabel29.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    jLabel29.setForeground(new Color(0, 87, 170));
    jLabel29.setText("Second Semester");

    jTable3.setAutoCreateRowSorter(true);
    jTable3.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
    jTable3.setFont(new Font("Roboto", 0, 14)); // NOI18N
    jTable3.setSize(new Dimension(100, 200));
    jTable3.setShowVerticalLines(true);
    jTable3.setShowHorizontalLines(false);
    jTable3.setGridColor(new Color(120, 120, 120));
    jTable3.setRowHeight(20);
    jTable3.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {
            { "Software Engineering II", "CCS 227", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "World History III (Elective)", "HIST 205", "1.0" }
        },
        new String[] {
            "Course Name", "Code", "Final Grade"
        }));

    JTableHeader jTable3Header = jTable3.getTableHeader();
    jTable3Header.setResizingAllowed(false);
    jTable3Header.setFont(new Font("Roboto", Font.BOLD, 12));
    jTable3Header.setBackground(new Color(240, 240, 240));

    jScrollPane3.setViewportView(jTable3);
    jScrollPane3.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
    jPanel11.setLayout(jPanel11Layout);
    jPanel11Layout.setHorizontalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGroup(jPanel11Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        675,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel29)
                    .addComponent(jScrollPane2,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        675,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel28))
                .addContainerGap(0, 0)));
    jPanel11Layout.setVerticalGroup(
        jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel28)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    100,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel29)
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    100,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(125, Short.MAX_VALUE)));

    jLayeredPane2.add(jPanel11, "fst_year_grades");
  }

  private void addScdYearGrades() {
    jPanel12.setBackground(new Color(255, 255, 255));

    jLabel30.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    jLabel30.setForeground(new Color(0, 87, 170));
    jLabel30.setText("First Semester");

    jTable4.setAutoCreateRowSorter(true);
    jTable4.setFont(new Font("Roboto", 0, 14)); // NOI18N
    jTable4.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
    jTable4.setFont(new Font("Roboto", 0, 14)); // NOI18N
    jTable4.setSize(new Dimension(100, 200));
    jTable4.setShowVerticalLines(true);
    jTable4.setShowHorizontalLines(false);
    jTable4.setGridColor(new Color(120, 120, 120));
    jTable4.setRowHeight(20);
    jTable4.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {
            { "Software Engineering II", "CCS 227", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "World History III (Elective)", "HIST 205", "1.0" }
        },
        new String[] {
            "Course Name", "Code", "Final Grade"
        }));

    JTableHeader jTable4Header = jTable4.getTableHeader();
    jTable4Header.setResizingAllowed(false);
    jTable4Header.setFont(new Font("Roboto", Font.BOLD, 12));
    jTable4Header.setBackground(new Color(240, 240, 240));

    jScrollPane4.setViewportView(jTable4);
    jScrollPane4.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    jLabel31.setFont(new Font("Roboto", Font.BOLD, 20)); // NOI18N
    jLabel31.setForeground(new Color(0, 87, 170));
    jLabel31.setText("Second Semester");

    jTable5.setAutoCreateRowSorter(true);
    jTable5.setFont(new Font("Roboto", 0, 14)); // NOI18N
    jTable5.setBorder(BorderFactory.createLineBorder(new Color(0, 0, 0)));
    jTable5.setFont(new Font("Roboto", 0, 14)); // NOI18N
    jTable5.setSize(new Dimension(100, 200));
    jTable5.setShowVerticalLines(true);
    jTable5.setShowHorizontalLines(false);
    jTable5.setGridColor(new Color(120, 120, 120));
    jTable5.setRowHeight(20);
    jTable5.setModel(new javax.swing.table.DefaultTableModel(
        new Object[][] {
            { "Software Engineering II", "CCS 227", "1.0" },
            { "Data Structures and Algorithms", "CC 204", "1.0" },
            { "World History III (Elective)", "HIST 205", "1.0" }
        },
        new String[] {
            "Course Name", "Code", "Final Grade"
        }));

    JTableHeader jTable5Header = jTable5.getTableHeader();
    jTable5Header.setResizingAllowed(false);
    jTable5Header.setFont(new Font("Roboto", Font.BOLD, 12));
    jTable5Header.setBackground(new Color(240, 240, 240));

    jScrollPane5.setViewportView(jTable5);
    jScrollPane5.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);

    javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
    jPanel12.setLayout(jPanel12Layout);
    jPanel12Layout.setHorizontalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGroup(jPanel12Layout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel31)
                    .addComponent(jScrollPane5,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        675,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        675,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel30))
                .addContainerGap(0, 0)));
    jPanel12Layout.setVerticalGroup(
        jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel30)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane4,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    108,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                    30,
                    30)
                .addComponent(jLabel31)
                .addGap(10, 10, 10)
                .addComponent(jScrollPane5,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    108,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(134, 134, 134)));

    jLayeredPane2.add(jPanel12, "scd_year_grades");
  }

  public void setLogOutButtonEvent(JPanel contentPanel) {
    logOutBtn.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        JFrame main = (JFrame) SwingUtilities.getWindowAncestor(contentPanel);
        main.dispose();
      }
    });
  }

  private void setPanelLayout() {
    jLayeredPane2.setPreferredSize(new Dimension(675, 600));
    jLayeredPane2.setLayout(new CardLayout());

    javax.swing.GroupLayout thisLayout = new javax.swing.GroupLayout(this);
    this.setLayout(thisLayout);
    thisLayout.setHorizontalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(thisLayout.createSequentialGroup()
                .addGroup(thisLayout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(thisLayout
                        .createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(thisLayout
                            .createParallelGroup(
                                javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(collegeLevelBtnLabel)
                            .addComponent(jLayeredPane2,
                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(thisLayout
                        .createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(collegeFstBtn,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            javax.swing.GroupLayout.DEFAULT_SIZE,
                            javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(collegeScdBtn,
                            javax.swing.GroupLayout.PREFERRED_SIZE,
                            125,
                            javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE,
                    Short.MAX_VALUE)));
    thisLayout.setVerticalGroup(
        thisLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(thisLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel10,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    javax.swing.GroupLayout.DEFAULT_SIZE,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(collegeLevelBtnLabel)
                .addGap(15, 15, 15)
                .addGroup(thisLayout.createParallelGroup(
                    javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(collegeScdBtn,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        31,
                        javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(collegeFstBtn,
                        javax.swing.GroupLayout.PREFERRED_SIZE,
                        31,
                        javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(
                    javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLayeredPane2,
                    javax.swing.GroupLayout.PREFERRED_SIZE,
                    544,
                    javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE)));

    jPanel11.setVisible(false);
    jPanel12.setVisible(true);
  }

  StudentGrades() {
    this.setPreferredSize(new Dimension(750, 750));
    this.setBackground(new Color(255, 255, 255));

    logOutBtn.setFont(new Font("Roboto", Font.BOLD, 14)); // NOI18N
    logOutBtn.setForeground(new Color(0, 87, 170));
    logOutBtn.setText("Log-Out");
    logOutBtn.setBackground(new Color(255, 255, 255));
    logOutBtn.setBorder(new javax.swing.border.LineBorder(new Color(0, 87, 170), 1, true));
    logOutBtn.setPreferredSize(new Dimension(80, 30));

    collegeLevelBtnLabel.setFont(new Font("Roboto", 0, 14)); // NOI18N
    collegeLevelBtnLabel.setText("Below are the Buttons to navigate your grade for each college level");

    collegeScdBtn.setFont(new Font("Roboto", Font.BOLD, 14)); // NOI18N
    collegeScdBtn.setText("Second Year");
    collegeScdBtn.setPreferredSize(new Dimension(100, 30));
    collegeScdBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 87, 170)));
    collegeScdBtn.setBackground(new Color(255, 255, 255));

    collegeFstBtn.setFont(new Font("Roboto", Font.BOLD, 14)); // NOI18N
    collegeFstBtn.setText("First Year");
    collegeFstBtn.setPreferredSize(new Dimension(100, 30));
    collegeFstBtn.setBorder(BorderFactory.createMatteBorder(0, 0, 3, 0, new Color(0, 87, 170)));
    collegeFstBtn.setBackground(new Color(255, 255, 255));

    this.addStudCourse();
    this.addFstYearGrades();
    this.addScdYearGrades();
    this.setPanelLayout();
  }
}