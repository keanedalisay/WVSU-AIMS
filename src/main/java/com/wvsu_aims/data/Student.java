package com.wvsu_aims.data;

import java.io.Serializable;

public class Student implements Serializable {
  private String studentID;
  private String password;

  Student(String studentID, String password) {
    this.password = password;
    this.studentID = studentID;
  }

  public String getStudentID() {
    return this.studentID;
  }

  public String getPassword() {
    return this.password;
  }
}