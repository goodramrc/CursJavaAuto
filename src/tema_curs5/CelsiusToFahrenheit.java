package tema_curs5;

import java.util.Scanner;

public class CelsiusToFahrenheit {

    double celsius;
    double fahrenheit;

    Scanner scanner = new Scanner(System.in);

    public void askNumberOfTemperatures() {
        System.out.println("Introduceti numarul de temperaturi pentru conversie: ");
        int numberOfTemperatures = scanner.nextInt();
        transformDegrees(numberOfTemperatures);
    }

    public void transformDegrees(int numberOfTemperatures) {

        for (int i=0; i < numberOfTemperatures; i++) {
            System.out.println("Introduceti temperatura in grade Celsius: ");
            celsius = scanner.nextDouble();
            if (celsius ==0) {
                fahrenheit = 32;
            }else {
                    fahrenheit = (celsius * 9 / 5) + 32;
                }

            System.out.println(celsius + " grade Celsius sunt " + fahrenheit + " grade Fahrenheit.");
            }

        }
    }



