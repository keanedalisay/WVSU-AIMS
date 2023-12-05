package com.wvsu_aims.data;

import java.io.Serializable;

import java.util.HashMap;

public class Students implements Serializable {
  private HashMap<String, Student> students = new HashMap<String, Student>();

  Students() {
    this.students.put("2022M0017", new Student("2022M0017", "123"));
    this.students.put("2022M0333", new Student("2022M0333", "123"));
    this.students.put("2022M0444", new Student("2022M0444", "123"));
    this.students.put("2022M0001", new Student("2022M0001", "123"));
  }

  public Student getStudent(String key) {
    return this.students.get(key);
  }
}
