package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ATMModel {
    private final Account account;
    private final Agency agency;
    private final List<String> report = new ArrayList<>();


    public ATMModel(final int accountNumber) throws invalidBankAccountException {
        agency = new Agency();
        account = agency.getAccountFromAccounts(accountNumber);
        report.add("Acesso de: " + account.getUserAccount() +
                "\n Número de Conta: " + account.getNumberAccount() +
                "\n Saldo atual da Conta: R$ " + account.getBankBalance());
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

        report.add("\n*******************************************************************************\nSaque efetuado no valor de R$ " +
                value + "\n*******************************************************************************\n");
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

            report.add("\n*******************************************************************************\nDepósito efetuado para " +
                    depositAccount.getUserAccount() + "\nNo valor de R$ " + value +
                    "\n*******************************************************************************\n");
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

        report.add("\n*******************************************************************************\nTransferência efetuada para " +
                transferAccount.getUserAccount() + "\nNo valor de R$ " + value +
                "\n*******************************************************************************\n");
    }

    //todas as transações efetuadas na execução OK
    public List bankStatement(){
        return Collections.unmodifiableList(report);
    }


}
