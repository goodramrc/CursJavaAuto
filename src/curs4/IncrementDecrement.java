package curs4;

public class IncrementDecrement {


    /*
     operator  unar - exemplu: numar++ sau numar--
     operator binar : numar1 + numar2
     operator ternar

     */
    public static void main(String[] args) {

        // num + 1 --> num++
        // num++ --> POST increment
        // ++numb -->> PRE increment

        System.out.println("------------POST incrementent----------");

        int num = 10;

        System.out.println("Num inainte de increment:" + num);
        System.out.println("Num in POST increment:" + num++);
        System.out.println("Num dupa POST increment:" + num);


        System.out.println("------------PRE incrementent----------");

        int num2 = 10;

        System.out.println("Num inainte de increment:" + num2);
        System.out.println("Num in PRE increment:" + ++num2);
        System.out.println("Num dupa PRE increment:" + num2);

        int num3=0;

        System.out.println(--num3);


    }
}
