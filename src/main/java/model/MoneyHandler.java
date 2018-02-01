package model;


import java.util.ArrayList;
import java.util.List;
import java.util.Stack;


public class MoneyHandler {


    private List wallet;
    private final Stack<Money> tenMoneyPile;
    private final Stack<Money> twentyMoneyPile;
    private final Stack<Money> fiftyMonePile;
    private final Stack<Money> hundredMoneyPile;


    public MoneyHandler (){
        wallet  = new ArrayList<Money>();
        wallet.add(tenMoneyPile = new Stack<Money>());
        wallet.add(twentyMoneyPile = new Stack<Money>());
        wallet.add(fiftyMonePile  = new Stack<Money>());
        wallet.add(hundredMoneyPile  = new Stack<Money>());
        initializePileBill();
    }


    private boolean hasMoneyBill(final Stack<Money> moneyPile) {
        return (moneyPile.size() == 0);
    }


    /*
        pego a quantidade de notas de 100 que eu preciso

        verifico:
            se eu tenho mais do que preciso:
                pego a quantidade de notas de 100 que eu tenho
                    tiro a quantidade de notas de 100 quanto eu preciso
                        a quantidade de notas que eu precisei multiplico por 100
                            subtraio o valor do total

            se eu preciso mais do que eu tenho:
                pego a quantidade de notas de 100 que eu preciso
                    tiro a quantidade de notas de 100 quanto eu tenho
                        o resto de notas multiplico por 100
                            subitraio o valor do total
    */
    private void takeMoneyBill(final float valueCashTake){

    }


    private void restoreMoneyBill(final int valueMoneyRestore){

    }


    private int howMuchMoney(final Stack<Money> moneyPile){
        return moneyPile.size() * moneyPile.peek().getValue();
    }

    private int howManyBill(final Stack<Money> moneyPile){
        return moneyPile.size();
    }


    private int totalCashMoney(){
        return howMuchMoney(tenMoneyPile) +
                howMuchMoney(twentyMoneyPile) +
                howMuchMoney(fiftyMonePile) +
                howMuchMoney(hundredMoneyPile);
    }


    private void initializePileBill(){
        for (int i = 0; i < 21; i++){
            tenMoneyPile.push(new Money(10));
        }
        for (int i = 0; i < 12; i++){
            twentyMoneyPile.push(new Money(20));
        }
        for (int i = 0; i < 5; i++){
            fiftyMonePile.push(new Money(50));
        }
        for (int i = 0; i < 3; i++){
            hundredMoneyPile.push(new Money(100));
        }
    }

}
