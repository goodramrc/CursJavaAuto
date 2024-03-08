package curs3;

import java.util.Scanner;

/*
Program care verifica daca suntem intr-o zi lucratoare sau in weekend
daca suntem in zi lucratoare printam: Este zi lucratoare
daca suntem in weekend printam: Este weekend
daca nu este o zi valida, printam: Ziua nu exita!
 */
public class VerificareZiASaptamanii {

    int zi;

    public void askTheUserForADay() {
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        zi = scan.nextInt();
        scan.close();
    }

    public void checkWeekDay() {

        askTheUserForADay();

        if(zi >=1 && zi<=5 ) {
            System.out.println("It's a working day!");
        }else if(zi == 6 || zi == 7) {
            System.out.println("It's a weekend day");
        }else {
            System.out.println("The day is not valid");
        }
    }

}
