package tema_curs7;

import java.util.Scanner;

public class ValidatePin {

    int enteredPin;

    int correctPin = 2244;

    int attemptsLeft = 3;

    Scanner scan = new Scanner(System.in);


    public void readPin() {
        System.out.println("Please enter PIN number: ");
        enteredPin = scan.nextInt();
    }
    public void validatePin() {

        do {
            readPin();
            if (enteredPin==correctPin) {
                System.out.println("Access Granted");
                break;
            }else {
                attemptsLeft--;
                System.out.println("Wrong PIN");
                if (attemptsLeft == 0) {
                    System.out.println("Maximum attempts reached. Card blocked");
                    break;
                } else {
                    System.out.println("Attempts left: " + attemptsLeft);
                }
            }

        } while (attemptsLeft > 0) ;



    }
}
