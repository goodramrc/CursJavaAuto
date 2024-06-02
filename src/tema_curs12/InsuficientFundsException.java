package tema_curs12;

public class InsuficientFundsException extends Exception{

    public InsuficientFundsException() {
        super("Insufficient funds for transaction");
    }
}
