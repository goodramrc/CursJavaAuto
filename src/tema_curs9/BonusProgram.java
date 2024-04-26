package tema_curs9;

import java.util.Scanner;

public class BonusProgram {

    int an;
    int valoareVanzari;
    int lunaVanzari;

    public void citesteValorile() {

        Scanner scaner = new Scanner(System.in);
        System.out.println("Introduceti anul in care a fost efectuata vanzarea: ");
        an = scaner.nextInt();
        scaner.nextLine();
        System.out.println("Introduceti valoarea vanzarilor: ");
        valoareVanzari = scaner.nextInt();
        scaner.nextLine();
        while (an==3 && lunaVanzari < 1 || lunaVanzari > 12) {
            System.out.println("Introduceti luna in care a fost efectuata vanzarea: ");
            lunaVanzari = scaner.nextInt();
        }

    }

    public void calculeazaBonus() {
        citesteValorile();
        int bonus = 0;

        switch (an) {

            case 1:
                bonus = 100;
                break;
            case 2:
                bonus = 200;
                break;
            case 3:
                if (valoareVanzari <= 5000) {
                    bonus = 600;
                } else if (valoareVanzari <= 10000) {
                    if (lunaVanzari >= 1 && lunaVanzari <= 6) {
                        bonus = 800;

                    } else if (lunaVanzari >= 7 && lunaVanzari <= 11) {
                        bonus = 1000;
                    } else if (lunaVanzari == 12) {
                        bonus = 900;
                        System.out.println("In decembrie se vand singure!");
                    }

                } else if (valoareVanzari > 10000) {
                    bonus = 1200;
                }
                break;

            default:
                System.out.println("Va rog introduceti un an de vechime valid: ");
                break;
        }

        System.out.println("Bonusul tau este: " + bonus);

    }
}

