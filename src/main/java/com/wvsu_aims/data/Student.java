package com.wvsu_aims.data;

import java.io.Serializable;

public class Student implements Serializable {
  private String studentID;
  private String password;
  private Biodata biodata;

  Student(String studentID, String password, Biodata biodata) {
    this.password = password;
    this.studentID = studentID;
    this.biodata = biodata;
  }

  public String getStudentID() {
    return this.studentID;
  }

  public String getPassword() {
    return this.password;
  }

  public Biodata getBiodata() {
    return this.biodata;
  }
}