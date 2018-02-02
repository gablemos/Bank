package model;

import java.util.ArrayList;
import java.util.List;

public class Cashier {

    private final List<Money> moneyHandler;
    private final Money tenMoneyBill;
    private final Money twentyMoneyBill;
    private final Money fiftyMoneyBill;
    private final Money hundredMoneyBill;


    public Cashier(){
        moneyHandler = new ArrayList<>();

        tenMoneyBill = new Money(Bill.TEN);
        twentyMoneyBill = new Money(Bill.TWENTY);
        fiftyMoneyBill = new Money(Bill.FIFTY);
        hundredMoneyBill = new Money(Bill.HUNDRED);
    }

    public int getValueTotalInCashier(){
        return 0;
    }


}
