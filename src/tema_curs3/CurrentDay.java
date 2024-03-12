package tema_curs3;

import java.util.Scanner;

public class CurrentDay {

    int day;

    public void askCurrentDay() {
        System.out.println("What day is today? (Enter a number from 1 to 7)");

        Scanner scan = new Scanner(System.in);
        day = scan.nextInt();
    }

    public void checkTheCurrentDay() {
        askCurrentDay();
        String[] weekDays = {"Luni", "Marti", "Miercuri", "Joi", "Vineri", "Sambata", "Duminica"};
        if (day == 0) {
            System.out.println("Te rog sa introduci un numar mai mare ca 0");
        }else if(day >=1 && day <=7) {
            System.out.println("Astazi este: " + weekDays[day -1]);
        } else {
            System.out.println("Saptamana are doar 7 zile, te rog sa introduci un numar valid");
        }

    }
}
