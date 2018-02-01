package model;

public class Account {

    private final String userAccount;
    private final int numberAccount;
    private double bankBalance;

    public Account(final String userAccount,
                   final int numberAccount,
                   final double bankBalance){

        this.userAccount = userAccount;
        this.numberAccount = numberAccount;
        this.bankBalance = bankBalance;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public double getBankBalance() {
        return bankBalance;
    }

    public boolean isAccount(final int consultNumberAccount){
        return(consultNumberAccount == getNumberAccount());
    }

    private boolean hasMoney(final double verifyMoneyInBalance){
        return(bankBalance > verifyMoneyInBalance);
    }

    public void decrementBankBalance(final double decrementMoneyValue){
        if(hasMoney(decrementMoneyValue)) {
            bankBalance -= decrementMoneyValue;
        } else {
           // throw new Exception.insufficientBankBalanceException("Não há saldo suficiente para transação");
        }
    }

    public void incrementBankBalance(final double incrementMoneyValue){
        bankBalance += incrementMoneyValue;
    }


}
