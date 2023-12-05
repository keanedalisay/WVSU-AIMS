package com.wvsu_aims.data.obj_ser;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjSer {
  public static void serialize(Object obj, String filePath) {
    try {
      FileOutputStream file = new FileOutputStream(filePath);
      ObjectOutputStream out = new ObjectOutputStream(file);

      out.writeObject(obj);
      out.close();
      file.close();

    } catch (IOException ex) {
      System.out.println("IOException is caught");
    }
  }

  public static Object deserialize(String filePath) {
    try {
      FileInputStream file = new FileInputStream(filePath);
      ObjectInputStream in = new ObjectInputStream(file);

      Object obj = in.readObject();

      in.close();
      file.close();

      return obj;
    } catch (IOException ex) {
      System.out.println("IOException is caught");
      return null;
    } catch (ClassNotFoundException ex) {
      System.out.println("ClassNotFoundException is caught");
      return null;
    }
  }
}
