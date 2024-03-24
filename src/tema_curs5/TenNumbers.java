package tema_curs5;

import java.util.Scanner;

public class TenNumbers {

    int number;
    int sum;


    public void askTheNumber() {
        Scanner scan = new Scanner(System.in);
        for (int i=1; i<=10; i++) {
            System.out.println("Please enter number " + i + ":" );
            number = scan.nextInt();
        }
        scan.close();
    }
    public void calculateTheSum() {
        askTheNumber();
        sum += number;
        System.out.println("The sum of the numbers is: " + sum);
    }


}
