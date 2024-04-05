package curs11;

public abstract class Product {

   // public abstract String nume; -  nu exista conceptul de abstract
    //la nivelul variabilelor
    public abstract int calculatePrice();

    public void productRating() {
        System.out.println("Best Product");
    }

}
