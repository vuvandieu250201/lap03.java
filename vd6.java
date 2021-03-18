package SessionLap04;

import java.util.Scanner;

public class vd6 {
  public static void  main(String[]args){
    String inStr;
    int inStrLen;
    Scanner in = new Scanner(System.in);

    System.out.println("Enter a String");
    inStr = in.next();
    inStrLen = inStr.length();

    System.out.print(" the revers is");
    for (int inCharIdx = inStrLen-1; inCharIdx >=0;--inCharIdx){
      System.out.print(inStr.charAt(inCharIdx));
    }
  }
}
