package tema_curs12;

public class SavingsAccount extends Account{
    public SavingsAccount(int accountNumber, double balance, Customer accountOwner) {
        super(accountNumber, balance, accountOwner);
    }

    @Override
    public void withdraw(double ammount) throws InsuficientFundsException {
        if (ammount > balance) {
            throw new InsuficientFundsException();

        }else{
            balance -= ammount;
        }

    }
}
