package com.mypc.javamavenproject1;

import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;

public class App {
 public static void main( String[] args ) {
  String fileName= new SimpleDateFormat("yyyyMMddhhmmss'.txt'").format(new Date());
     
  JOptionPane.showMessageDialog(null, "JavaMavenProject1 demo, filename with timestamp: "+ fileName);
 }
}
