package tema_curs3;

import java.util.Scanner;

public class ProgramPunctaj {

    int valoarePunctaj;

    public void punctajTest() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti valoarea punctajului: ");
        valoarePunctaj = scanner.nextInt();
        if (valoarePunctaj == 0 || valoarePunctaj <=65) {
            System.out.printf("Valoarea punctajului este: %s%s%n", valoarePunctaj, " Ai picat");
        }else {
            System.out.printf("Valoarea punctajului este: %s%s%n", valoarePunctaj, " Felicitari, Ai trecut!");
        }
        scanner.close();

    }


}
