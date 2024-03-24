package tema_curs5;

import java.util.Scanner;

public class TablaInmultirii {
    int number;

    public void askTheNumber() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        number = scan.nextInt();
    }

    public void printMultiplicationTable() {
        askTheNumber();
      for (int i=1; i<=10; i++ ) {
        String result = String.valueOf(number*i);
          System.out.println(number + " * " + i + " = " +result);
      }
    }

}
