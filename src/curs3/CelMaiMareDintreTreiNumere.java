package curs3;

/*
Facem un program care citeste 3 numere de la tastatura
verifica care dintre ele este cel mai mare si printeaza in consola
daca 2 numere sunt egale, printeaza: "Numere egala"
 */

import java.util.Scanner;

public class CelMaiMareDintreTreiNumere {

    int nr1, nr2, nr3;

    public void askTheUserForThreeNumbers() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        nr1 = scan.nextInt();
        scan.close();
        System.out.println("Please enter first number: ");
        nr2 = scan.nextInt();
        scan.close();
        System.out.println("Please enter first number: ");
        nr3 = scan.nextInt();
        scan.close();
    }

    public void findOutBigestNumber() {

        askTheUserForThreeNumbers();

        if(nr1 > nr2 && nr1 > nr3) {
            System.out.println("First number is the greatest");
        }else if(nr2 > nr3 && nr2 > nr1) {
            System.out.println("Second number is the greatest");
        }else if (nr3 > nr1 && nr3 > nr2) {
            System.out.println("Third number is the greatest");
        }else {
            System.out.println("At least two number are equal");
        }
    }

}
