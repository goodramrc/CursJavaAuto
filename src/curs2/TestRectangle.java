package curs2;

import java.util.Scanner;

public class TestRectangle {

    public static void main(String[] args) {
/*
        Rectangle obiect = new Rectangle();
        obiect.latime = 5;
        obiect.lungime = 3;
        System.out.println(obiect.calculArie(obiect.lungime, obiect.latime));


        Rectangle obiect2 = new Rectangle();
        obiect2.latime = 4;
        obiect2.lungime = 6;
        System.out.println(obiect2.calculArie(obiect2.latime, obiect2.lungime));
*/
//        Rectangle obiect3 = new Rectangle(8, 12);
//        System.out.println("Aria este: " + obiect3.calculArie());
//        //Apelare metoda afiseazaCuloareDreptunghi() pe un obiect existent
//        obiect3.afiseazaCuloareDreptunghi();

        //Apelare metoda afiseazaCuloareDreptunghi() pe un obiect nou
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti culoarea: ");
        Rectangle obiect4 = new Rectangle(8, 10 , scanner.next());
        System.out.println("Latimea este:" + obiect4.latime);
        System.out.println("Lungimea este:" + obiect4.lungime);
        System.out.println("Culoare este: " + obiect4.culoare);
//        obiect4.afiseazaCuloareDreptunghi();




    }
}
