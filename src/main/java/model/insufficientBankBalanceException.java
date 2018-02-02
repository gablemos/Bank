package model;

public class insufficientBankBalanceException extends RuntimeException {

    public insufficientBankBalanceException(String message) {
        super(message);
    }
}
