package model;

public class ATMModel {
    private Account account;
    private final Agency agency;


    public ATMModel(final int accountNumber) throws invalidBankAccountException {
        agency = new Agency();
        account = agency.getAccountFromAccounts(accountNumber);
    }

    /*
        Tem saldo suficiente na conta origem      OK
        Ter saldo no caixa                        TODO
        Ter a combinação de notas para o saque    TODO
        Remover saldo da conta origem             OK
        Remover as notas sacadas do caixa         TODO
    */

    public double bankBalance(){
       return account.getBankBalance();
    }

    public void withdraw(final double value){
        account.decrementBankBalance(value);
    }

    /*
    Existe a conta destino    OK
    Adicionar saldo a conta   OK
    Adicionar notas ao caixa  TODO
    */
    public void deposit(final int depositAccountNumber, final double value) throws invalidBankAccountException {

        Account depositAccount = agency.getAccountFromAccounts(depositAccountNumber);

        if(depositAccount != null){
            depositAccount.incrementBankBalance(value);
        }
    }

    /*
    Existe conta destino                    OK
    Tem saldo suficiente na conta origem    OK
    Remover saldo da conta origem           OK
    Adicionar saldo na conta destino        OK
    */
    public void transfer(final int transferAccountNumber, final double value) throws invalidBankAccountException {

        Account transferAccount = agency.getAccountFromAccounts(transferAccountNumber);

        if(transferAccount != null){
            account.decrementBankBalance(value);
            transferAccount.incrementBankBalance(value);
        }
    }

    //todas as transações efetuadas na execução TODO
    public void bankStatement(){

    }


}
