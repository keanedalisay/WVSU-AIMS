package com.wvsu_aims;

import java.util.concurrent.CountDownLatch;

import com.wvsu_aims.account_login.LogInAccount;
import com.wvsu_aims.account_stud.StudentAccount;

public class WVSU_AIMS {
  public static void main(String args[]) {
    try {
      CountDownLatch logInSignal = new CountDownLatch(1);

      LogInAccount logIn = new LogInAccount(logInSignal);
      logIn.setVisible(true);

      logInSignal.await();

      StudentAccount studentAccount = new StudentAccount(logIn.getUser());
      studentAccount.setVisible(true);

    } catch (InterruptedException e) {
      e.printStackTrace();
    }
  }
}
