package curs2;

public class ExampleVariable {
    String prenume;

    public static void main(String[] args) {
//declare si initializare a unei variabile
        String  nume = "Ion";
//   data type; numele variabilei
        int age; //doar declarare
        age = 22; //initializare

        System.out.println(nume);

        var numar = 55; //posibila doar pentru variabilele locale

        /* var
        nu avem voie sa il folosim ca parametrii unei metoda
        nu avem sa il folosim ca variabile de instanta
        nu avem voie sa il folosim ca return type
        nu avem voie sa il folosim in lambda expression
        nu avem voie sa il folosim ca si constructor parameters
        */

        ExampleVariable obj = new ExampleVariable();
        obj.afiseazaMesaj("text");

    }

    public void afiseazaMesaj(String ceva) {
        String numeFamile = "popescu";
        System.out.println(numeFamile + prenume);
    }

    public void afiseazaAltMesaj() {
        //numeFamilie = "ionescu"
        prenume = "elena";
    }

}
