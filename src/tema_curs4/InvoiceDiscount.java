package tema_curs4;

import java.util.Scanner;

public class InvoiceDiscount {

    double invoice;

    public void askTheInvoiceValue() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Care este valoarea facturii? ");
        invoice = scan.nextDouble();
        scan.close();
    }

    public void applyDiscount() {
        askTheInvoiceValue();
        String result = (invoice <= 0) ? "Introduceti valori pozitive si diferite de 0" :
                invoice > 100 ? "A fost aplicat un discount de 10%, iar valoarea facturii este: "
                        + (invoice * 90 / 100) : (invoice < 100) ? "A fost aplicat un discount de 5%, iar valoarea facturii este: "
                + (invoice * 95 / 100) : "Nu se aplica nici un discount";
        System.out.println(result);
    }
}
