package tema_curs12;

import java.util.Scanner;

public class TestSavings {

    public static void main(String[] args) {

        Customer customer = new Customer("Ion","adresa","ion@email.com");
        SavingsAccount savingsAccount = new SavingsAccount(1234, 5000, customer);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Hi " + customer.getName());
        System.out.println("Please enter the amount to withdraw: ");

        try {
            savingsAccount.withdraw(scanner.nextDouble());
            System.out.println("New balance: " + savingsAccount.balance);
            System.out.println("Please pick your money!");
            System.out.println("Thank you for using our ATM");

        } catch (InsuficientFundsException e) {

            System.out.println("The amount you entered is greater than the available balance: " + savingsAccount.balance);
            System.out.println("Thank you for using our ATM");
            e.printStackTrace();

        }
        scanner.close();

    }
}
