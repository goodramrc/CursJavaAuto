package curs2;

import java.util.Scanner;

public class Rectangle {

    int lungime;
    int latime;

    int inaltime;

    String culoare;

    public int calculArie() {
        return lungime * latime;
    }

    public int calculPerimetru(int lungime, int latime) {

        return 2 * (lungime + latime);

    }
//Method afiseazaCuloareDreptunghi
    public String afiseazaCuloareDreptunghi() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduceti o culoare: ");
       this.culoare = scanner.next();
        System.out.println("Culoarea Dreptunghiului este: " + culoare);
        return null;
    }

    //constructor default
    public Rectangle() {

    }

    public Rectangle(int lungime, int latime) {
        this.lungime = lungime;
        this.latime = latime;
    }
// Constructor with 3 parameters
    public Rectangle(int lungime, int latime, String culoare) {
        this.lungime = lungime;
        this.latime = latime;
        this.culoare= culoare;
    }
}
