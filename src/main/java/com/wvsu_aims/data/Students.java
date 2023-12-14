package com.wvsu_aims.data;

import java.io.Serializable;

import java.util.HashMap;

public class Students implements Serializable {
  private HashMap<String, Student> students = new HashMap<String, Student>();

  Students() {
    this.students.put("2022M0017", new Student("2022M0017", "123",
        new Biodata("Keane Emanuel E. Dalisay", 0).setAge(19).setDateOfBirth("January 18, 2004")
            .setEmail("keane.dalisay@email.com")));
    this.students.put("2022M0333", new Student("2022M0333", "123",
        new Biodata("John Doe", 0).setAge(20).setDateOfBirth("January 1, 1970").setEmail("john.doe@email.com")));
    this.students.put("2022M0444", new Student("2022M0444", "123",
        new Biodata("John Doe", 0).setAge(20).setDateOfBirth("January 1, 1970").setEmail("john.doe@email.com")));
    this.students.put("2022M0001", new Student("2022M0001", "123",
        new Biodata("John Doe", 0).setAge(20).setDateOfBirth("January 1, 1970").setEmail("john.doe@email.com")));
  }

  public Student getStudent(String key) {
    return this.students.get(key);
  }
}
