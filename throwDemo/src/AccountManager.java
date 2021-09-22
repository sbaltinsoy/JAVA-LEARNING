public class AccountManager {
    private double balance;

    public void deposit(double ammount){
        balance = getBalance() + ammount;
    }

    public void withdraw(double ammount) throws BalanceInsufficentException {
        if(balance>=ammount){
            balance-=ammount;
        }else{
            throw new BalanceInsufficentException("Bakiye Yetersiz !");
            //System.out.println("Hesaptan para cekilemedi.\n Bakiye Yetersiz.");
        }

    }

    public double getBalance() {
        return balance;
    }
}
