package controller;

import model.ATMModel;
import model.invalidBankAccountException;
import view.ATMView;

import java.util.List;

public class ATMController {

    private final ATMModel atmModel;
    private final ATMView atmView;

    public ATMController(ATMModel atmModel, ATMView atmView){
        this.atmModel = atmModel;
        this.atmView = atmView;
    }

    public void header(){
        atmView.menuOptionHeader();
        atmView.menuOptionOne();
        atmView.menuOptionTwo();
        atmView.menuOptionThree();
        atmView.menuOptionFour();
        atmView.menuOptionFive();
        atmView.menuOptionSix();
        atmView.menuOptionChoice();
    }

    public void optionOne(){
        atmView.splitScreen();

        atmView.bankBalanceMenu();
        System.out.println(atmModel.bankBalance());

        atmView.splitScreen();
    }

    public void optionTwo(){
        atmView.splitScreen();

        atmView.requestValueMsg();
        try {
            atmModel.withdraw(atmView.getValueFromScreen());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }

        atmView.splitScreen();
    }

    public void optionThree(){
        atmView.splitScreen();

        atmView.requestAccountMsg();
        int accountHolder = atmView.getValueFromScreen();
        atmView.requestValueMsg();
        try {
            atmModel.deposit(accountHolder, atmView.getValueFromScreen());
        } catch (invalidBankAccountException e) {
            System.out.println(e.getMessage());
        }

        atmView.splitScreen();
    }

    public void optionFour(){
        atmView.splitScreen();

        atmView.requestAccountMsg();
        int accountHolder = atmView.getValueFromScreen();
        atmView.requestValueMsg();

        try {
            atmModel.transfer(accountHolder, atmView.getValueFromScreen());
        } catch (invalidBankAccountException | RuntimeException e) {
            System.out.println(e.getMessage());
        }

        atmView.splitScreen();
    }

    public void optionFive(){
        atmView.splitScreen();

        final List bankStatement = atmModel.bankStatement();
        for (Object o : bankStatement) {
            System.out.println(o);
        }

        atmView.splitScreen();
    }

    public void optionSix(){
        System.exit(0);
    }

    public void invalidOption(){
        atmView.splitScreen();

        atmView.invalidOption();

        atmView.splitScreen();
    }
}
