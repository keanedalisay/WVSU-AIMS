package com.wvsu_aims.data;

import java.io.Serializable;

public class Biodata implements Serializable {
  private String fullName;
  private Integer sex;
  private Integer age;
  private String dateOfBirth;
  private String email;

  Biodata(String fullName, Integer sex) {
    this.fullName = fullName;
    this.sex = sex;
  }

  public Biodata setAge(Integer age) {
    this.age = age;
    return this;
  }

  public Biodata setDateOfBirth(String dateOfBirth) {
    this.dateOfBirth = dateOfBirth;
    return this;
  }

  public Biodata setEmail(String email) {
    this.email = email;
    return this;
  }

  public String getFullName() {
    return this.fullName;
  }

  public String getEmail() {
    return this.email;
  }

  public String getSex() {
    if (this.sex == 0)
      return "Male";
    else if (this.sex == 1)
      return "Female";

    return "Undefined";
  }

  public Integer getAge() {
    return this.age;
  }

  public String getDateOfBirth() {
    return this.dateOfBirth;
  }
}