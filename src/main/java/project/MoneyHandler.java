package project;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MoneyHandler {

    private List wallet;
    private Stack<Money> tenMoneyPile;
    private Stack<Money> twentyMoneyPile;
    private Stack<Money> fiftyMoneyPile;
    private Stack<Money> hundredMoneyPile;

    public MoneyHandler(){
        wallet = new ArrayList();
        tenMoneyPile = new Stack<Money>();
        twentyMoneyPile = new Stack<Money>();
        fiftyMoneyPile = new Stack<Money>();
        hundredMoneyPile = new Stack<Money>();
        initialize();
    }

    private void initialize(){
        for(int i = 0; i<21; i++){
            tenMoneyPile.push(new Money(10));
        }
        for(int i = 0; i<12; i++){
            twentyMoneyPile.push(new Money(20));
        }
        for(int i = 0; i<5; i++){
            fiftyMoneyPile.push(new Money(50));
        }
        for(int i = 0; i<3; i++){
            hundredMoneyPile.push(new Money(100));
        }
    }

    private boolean hasMoney(final Stack<Money> moneyPile){
        return (moneyPile.size() > 0);
    }

    private int amountMoneyInPile(final Stack<Money> moneyPile){
        return moneyPile.size();
    }

    private int amountValueInPile(final Stack<Money> moneyPile){
        return moneyPile.peek().getValue();
    }

    private int totalCashValue(){
        return amountValueInPile(tenMoneyPile) +
                amountValueInPile(twentyMoneyPile) +
                amountValueInPile(fiftyMoneyPile) +
                amountValueInPile(hundredMoneyPile);
    }

    private void withdraw(final int value){
        if(totalCashValue() > value){
            if ((hasMoney(hundredMoneyPile)) && (amountValueInPile(hundredMoneyPile) > value)){

            }
        }
    }

}
