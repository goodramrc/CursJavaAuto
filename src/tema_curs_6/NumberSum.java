package tema_curs_6;

import java.util.Scanner;

public class NumberSum {

    int number;
    int sum;

    Scanner scan = new Scanner(System.in);

    public void askTheNumber() {
        System.out.println("Please enter a number: ");

        number = scan.nextInt();

        calculateSum(number);

        scan.close();
    }

    public void calculateSum (int number) {

        sum =0;

        while (number !=0) {
            sum += number % 10;

            number /=10;
        }

        System.out.println("Suma cifrelor numarului " + this.number + " este: " + sum);


    }

}
