package tema_curs4;

import java.util.Scanner;

public class TernaryOperator3 {

    int valoarePunctaj;
    String calificativ;


    public void askValoarePunctaj() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduceti valoarea punctaj: ");
        valoarePunctaj = scan.nextInt();
        scan.close();

    }

    public void calculeazaCalificativ () {
        askValoarePunctaj();
        calificativ = valoarePunctaj <=0 ? "I" : valoarePunctaj < 80 ? "S" :
        valoarePunctaj >= 80 ? "B" : valoarePunctaj >= 90 ? "FB" : "";
        String mesaj = calificativ == "FB" ? "Ai primit: Foarte Bine" : calificativ == "B" ?
                "Ai primit: Foarte Bine" : calificativ == "S" ? "Ai primit: Suficient" :calificativ == "I" ? "Punctaj invalid":"";
        System.out.println(mesaj);
    }



}
