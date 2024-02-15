import java.util.*;
import java.util.zip.CheckedInputStream;

import javax.swing.plaf.synth.SynthSpinnerUI;

public class Myproject {
  public static void main(String args[]) {
    System.out.println("welcome you to my ATM project");
    int a = 12121;
    Scanner sc1 = new Scanner(System.in);
    Myproject o1 = new Myproject();
    o1.format();
    o1.operations();

  }

  static void format() {
    Scanner sc1 = new Scanner(System.in);
    System.out.println("enter your account number");
    String n1 = sc1.nextLine();
    System.out.println("enter your password");
    String n2 = sc1.nextLine();

    if (n1.contentEquals("1234") && n2.contentEquals("1234")) {
      System.out.println("=============================welcome to your account============================");
      System.out.println("1. WITHDRAWL MONEY");
      System.out.println("2.VIEW BALANCE");
      System.out.println("3.TRANSFER MONEY");
      System.out.println("4.EXIT");
    } else {
      System.out.println("you entered invalid account number or password ");
      System.exit(0);
    }
  }

  static void operations() {

    Scanner sc1 = new Scanner(System.in);
    System.out.println("enter number for your operation");
    int n1 = sc1.nextInt();
    if (n1 == 1) {
      System.out.println("ENTER AMOUNT");
      // Scanner sc2=new Scanner(System.in);
      int n2 = sc1.nextInt();
      System.out.println("enter your password");
      // Scanner sc3=new Scanner(System.in);
      int n3 = sc1.nextInt();

      if (n3 == 1234) {
        System.out.println("your money has been debited successfully");

        System.out.println("tap 5 to view remaining bal");
        int bal = 0;
        bal = 60000 - n2;
        int n4 = sc1.nextInt();
        if (n4 == 5) {
          System.out.println(bal);
        }

      } else {
        System.out.println("you entered wrong password");
        System.exit(0);
      }

    }

    if (n1 == 2) {
      System.out.println("your account balance is 60000");

    }
    if (n1 == 3) {

      System.out.println("enter your account number");
      Scanner sc2 = new Scanner(System.in);
      String n3 = sc2.nextLine();

      System.out.println("enter recivers account number");
      String n4 = sc2.nextLine();

      if (n3.contentEquals(n4)) {
        System.out.println("both account number should not be same");
        System.exit(0);
      }

      if (n3.contentEquals("1234") && n4.contentEquals("1234")) {
        System.out.println("acc. no cannot be same");
        System.exit(0);
      }
      System.out.println("amount you want to transfer");
      int n5 = sc2.nextInt();

      System.out.println("money debited successfully");

      if (n5 > 60000) {
        System.out.println("you have insufficient balance");
      }

      int bal = 60000 - n5;
      System.out.println("view your balance press 10");
      int n6 = sc2.nextInt();
      if (n6 == 10) {
        System.out.println("your account balancce is" + bal);
      }

    }
    if (n1 == 4) {
      System.exit(0);
    }
  }

}
