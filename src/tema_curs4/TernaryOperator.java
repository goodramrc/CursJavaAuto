package tema_curs4;

public class TernaryOperator {

    int comision;
    int vanzari = 3500;

    public void comision () {
        if (vanzari>2500) {
            comision = vanzari*5/100;
            System.out.println("Comisionul tau este: " + comision);
        }else System.out.println("Nu ai primit comision");
    }

}
