package tema_curs5;

import java.util.Scanner;

public class CheckPalindrom {

    String expresie;
    String expresieIntoarsa= "";


  Scanner scan = new Scanner(System.in);

  public void askForWord() {
      System.out.println("Introduceti un cuvant: " );
      expresie = scan.next();
  }

  public void checkIfPalindrome() {
      askForWord();

      //rezolvare cu for
//      for (int i=expresie.length() -1; i>=0; i--) {
//          expresieIntoarsa = expresieIntoarsa + expresie.charAt(i);
//      }
//      System.out.println("Cuvantul initial este: " + expresie);
//      System.out.println("Cuvantul intors este: " + expresieIntoarsa);
//
//      String palindrom = expresie.equals(expresieIntoarsa) ? "Este palindrom" : "Nu este palindrom";
//      System.out.println(palindrom);
//  }

      //rezolvare cu String Builder

      StringBuilder objExpresie = new StringBuilder(expresie);
      expresieIntoarsa = objExpresie.reverse().toString();

      System.out.println("Cuvantul initial este: " + expresie);
      System.out.println("Cuvantul intors este: " + expresieIntoarsa);

      String evaluateIfPalindrom = expresie.equalsIgnoreCase(expresieIntoarsa) ? "Este palindrom" : "Nu este palindrom";
      System.out.println(evaluateIfPalindrom);
  }
}
