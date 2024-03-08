package curs3;


import java.util.Scanner;

/*
    Facem un program care verifica daca utilizatorul a introdus o litera.
    Daca a introdus o litera, printam : caracterul este o litera
    Daca a introdus altceva, printam: caracterul nu este o litera
 */
public class VerificareCaracter {

    char caracter;

    /*
    char este un datatype primitv
    String este un datatype neprimitiv

    televizor
    012345678
    televizor.charAt(5) == i

     */
    public void askTheUserForACharacter() {
        System.out.println("Please enter a character: ");
        Scanner scan = new Scanner(System.in);
        caracter = scan.next().charAt(0);
    }

    public void checkIfCharacterIsLetter() {

        askTheUserForACharacter();

        if(Character.isLetter(caracter)) {
            System.out.println("caracterul este o litera");
        }else {
            System.out.println("caracterul este o litera");
        }
    }

}
