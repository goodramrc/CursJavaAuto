package curs12;

import java.util.Scanner;

public class TestAgeVerifier {

    public static void main(String[] args) {
        AgeVerifier obj = new AgeVerifier();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter your age:");
        int age = scanner.nextInt();

        try {
            obj.checkAgeLimit(age);
        } catch (InvalidAgeException e) {
            e.printStackTrace();
            System.out.println("Invalid age to vote!");
        }
    }
}
