package com.wvsu_aims;

import java.util.concurrent.CountDownLatch;

import com.wvsu_aims.account_login.LogInAccount;
import com.wvsu_aims.account_stud.StudentAccount;

public class WVSU_AIMS {
  public static void main(String args[]) {
    try {
      CountDownLatch loginSignal = new CountDownLatch(1);
      LogInAccount logIn = new LogInAccount(loginSignal);
      logIn.setVisible(true);
      loginSignal.await();

      StudentAccount studAcc = new StudentAccount(logIn.getUser());
      studAcc.setVisible(true);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
}
