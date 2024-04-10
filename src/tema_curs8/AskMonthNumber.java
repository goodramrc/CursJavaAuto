package tema_curs8;

import java.util.Scanner;

public class AskMonthNumber {


    int numarLuna;


    public static int askTheMonthNumber() {
        Scanner scanner = new Scanner(System.in);
        int numarLuna = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Introduceți un număr între 1 și 12: ");
            if (scanner.hasNextInt()) {
                numarLuna = scanner.nextInt();
                if (numarLuna >= 1 && numarLuna <= 12) {
                    isValid = true;
                } else {
                    System.out.println("Numărul introdus nu este valid. Introduceți un număr între 1 și 12.");
                }
            } else {
                System.out.println("Ati introdus un caracter sau un numar cu zecimale. Introduceți un număr între 1 și 12.");
                scanner.next();
            }
        }

        scanner.close();
        return numarLuna;
    }

    public void showTheMonthName() {
        numarLuna = askTheMonthNumber();
        ArrayLuniAn obj = new ArrayLuniAn();
        String numeLuna = obj.luniAn[numarLuna - 1];
        System.out.println("Luna corespunzătoare numărului " + numarLuna +
                " este: " + numeLuna);


    }
}
