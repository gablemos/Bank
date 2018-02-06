package model;

import java.util.*;

public class ATMModel {
    private final Account account;
    private final Agency agency;
    private final List<String> report;
    private final Cashier cashier;


    public ATMModel(final int accountNumber) throws invalidBankAccountException {
        agency = new Agency();
        account = agency.getAccountFromAccounts(accountNumber);
        report = new ArrayList<>();
        cashier = new Cashier();
        report.add("Acesso de: " + account.getUserAccount() +
                "\n Número de Conta: " + account.getNumberAccount() +
                "\n Saldo atual da Conta: R$ " + account.getBankBalance());
    }

    /*
        Ter saldo no caixa                        TODO
        Ter a combinação de notas para o saque    TODO
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

    public void deposit(final int depositAccountNumber, final double value) throws invalidBankAccountException {

        Account depositAccount = agency.getAccountFromAccounts(depositAccountNumber);

        if(depositAccount != null){
            depositAccount.incrementBankBalance(value);

            int restore = cashier.depositMoneyBill((int)value);
            account.incrementBankBalance(restore);

            report.add("\n*******************************************************************************\nDepósito efetuado para " +
                    depositAccount.getUserAccount() + "\nNo valor de R$ " + value +
                    "\n*******************************************************************************\n");
        }


    }

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

    public Map billInATM(){
        return cashier.amountMoneyBillInCashier();
    }

    public List bankStatement(){
        return Collections.unmodifiableList(report);
    }


}
