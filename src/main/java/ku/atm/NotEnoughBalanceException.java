package ku.atm;

public class NotEnoughBalanceException extends Exception {

    public NotEnoughBalanceException(String reason) {
        super(reason);
    }
}
