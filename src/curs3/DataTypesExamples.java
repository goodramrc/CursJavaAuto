package curs3;

public class DataTypesExamples {

    public static void main(String[] args) {
        //data type numeric de tip intreg
        byte byteNumber = 127; //-128 -->127
        short shortNumber = 32767; // -32768 - 32767
        int intNumber = 2147483647; // -2147483647 -> 2147483647
        long longNumber = 922334334333213L;

        //float
        double doubleNumber = 3.14159265359; //15 zecimale
        float floatNumber = 3.141592f; // 6-7 zecimale

        double calcul = 5.6 + 5.8;
        System.out.println(calcul); //rezultat imprecis daca folosim double

        char character = '#'; //un caracter Unicode

        boolean boolValue = true;
    }
}
