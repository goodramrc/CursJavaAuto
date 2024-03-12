package tema_curs3;

import java.util.Scanner;

public class VarstaUtilizator {

    int varsta;

    public void intrebaVarsta() {

        System.out.println("Ce varsta aveti?");
        Scanner scan = new Scanner(System.in);
        varsta = scan.nextInt();
        scan.close();
    }

    public void verificaVarsta() {
        intrebaVarsta();
        if(varsta ==0 || varsta <18) {
            System.out.println("Esti minor");
        }else if(varsta >=18 && varsta <=65) {
            System.out.println("Esti adult");
        }else {
            System.out.println("Esti batran");
        }
    }
}
