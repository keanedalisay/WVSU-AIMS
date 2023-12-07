package com.wvsu_aims.data.verify;

import javax.swing.JPasswordField;
import javax.swing.JTextField;

import java.util.Arrays;

import com.wvsu_aims.data.Student;

public class Verify {
  public static Boolean textFieldIsEmpty(JTextField textField) {
    return textField.getText().isBlank() ? true : false;
  }

  public static Boolean pswdFieldIsEmpty(JPasswordField pswdField) {
    return pswdField.getPassword().length == 0 ? true : false;
  }

  public static Boolean pswdMatches(Student student, JPasswordField pswdField) {
    return Arrays.equals(student.getPassword().toCharArray(), pswdField.getPassword()) ? false : true;
  }
}
