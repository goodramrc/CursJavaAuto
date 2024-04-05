package curs11;

public class Mobile extends Product{

    private int tva;

    private int buyingPrice;

    public Mobile(int tva, int buyingPrice) {
       setBuyingPrice(buyingPrice);
       setTva(tva);
    }
    @Override
    public int calculatePrice() {
        return 0;
    }

    public int getTva() {
        return tva;
    }

    private void setTva(int tva) {
        // as fi avut logica de TVA
        this.tva = tva;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    private void setBuyingPrice(int buyingPrice) {
        //as fi avut logica de verificare pret
        this.buyingPrice = buyingPrice;
    }
}
