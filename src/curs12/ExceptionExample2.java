package curs12;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionExample2 {

    public static void main(String[] args) {

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce numarul 1:");
            int num1 = scanner.nextInt();
            System.out.println("Introduce numarul 2:");
            int num2 = scanner.nextInt();
            num2 = (Integer) null;
            int division = num1/num2;
            System.out.println(division);
        }catch (ArithmeticException e) {
            System.out.println("Numai impartii la zero ca nu merge!");
        }catch (InputMismatchException e) {
            System.out.println("Nu mai introdu alte cararctere in afara de numere ");
        }catch (NullPointerException e) {
            System.out.println("A iesit cu Null Pointer");
        }catch(Exception e) {
            System.out.println("A aparut o eroare");
            e.printStackTrace();
        }

        System.out.println("---------------------------------");

        try {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Introduce numarul 1:");
            int num1 = scanner.nextInt();
            System.out.println("Introduce numarul 2:");
            int num2 = scanner.nextInt();
            num2 = (Integer) null;
            int division = num1/num2;
            System.out.println(division);

        }catch(Exception e) {
            System.out.println("A aparut o eroare");
            e.printStackTrace();
        }

    }
}
