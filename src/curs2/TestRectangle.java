package curs2;

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
        Rectangle obiect3 = new Rectangle(8, 12);
        System.out.println("Aria este: " + obiect3.calculArie());
        //Apelare metoda afiseazaCuloareDreptunghi() pe un obiect existent
        obiect3.afiseazaCuloareDreptunghi();

        //Apelare metoda afiseazaCuloareDreptunghi() pe un obiect nou
        Rectangle obiect4 = new Rectangle(8, 10 , obiect3.culoare) ;
        //de ce nu pot accesa paremetrul culoare, folosind si obiect4.culoare ? La hover peste eroare, spune ca nu e initializat, dar obiect3.culoare cum de este initializat?
        System.out.println("Latimea este:" + obiect4.latime);
        System.out.println("Lungimea este:" + obiect4.lungime);
        obiect4.afiseazaCuloareDreptunghi();




    }
}
