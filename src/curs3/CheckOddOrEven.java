package curs3;

import java.util.Scanner;

/*
Facem un program care verifica, daca un numar e par sau impar
Daca numarul este par printam: The number <nr> is even!
Daca numarul este imppar printam: The number <nr> is odd!
Numarul il citim de la tastatura
 */
public class CheckOddOrEven {

    int numar;

    public void askTheUserForANumber() {
        System.out.println("Please enter a number: ");
        Scanner scan = new Scanner(System.in);
        numar = scan.nextInt();
    }

    public void checkNumberIsOddOrEven() {
        askTheUserForANumber();

        if(numar % 2 ==0) {
            System.out.println("The number " + numar + " is even" );
        }else {
            System.out.println("The number " + numar + " is odd" );
        }

    }


}
