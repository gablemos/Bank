package model;

import java.util.*;

public class Cashier {
    private final Money tenMoneyBill;
    private final Money twentyMoneyBill;
    private final Money fiftyMoneyBill;
    private final Money hundredMoneyBill;

    private final Stack<Money> tenHolder;
    private final Stack<Money> twentyHolder;
    private final Stack<Money> fiftyHolder;
    private final Stack<Money> hundredHolder;


    public Cashier() {

        tenHolder = new Stack<>();
        tenMoneyBill = new Money(Bill.TEN);

        twentyHolder = new Stack<>();
        twentyMoneyBill = new Money(Bill.TWENTY);

        fiftyHolder = new Stack<>();
        fiftyMoneyBill = new Money(Bill.FIFTY);

        hundredHolder = new Stack<>();
        hundredMoneyBill = new Money(Bill.HUNDRED);

        initialize();
    }

    private void initialize(){
        replaceBill(hundredHolder, hundredMoneyBill, 3);
        replaceBill(fiftyHolder, fiftyMoneyBill, 5);
        replaceBill(tenHolder, tenMoneyBill, 21);
        replaceBill(twentyHolder, twentyMoneyBill, 12);
    }


    public Map amountMoneyBillInCashier() {
        Map<Money, Integer> bills = new HashMap<>();
        bills.put(hundredMoneyBill, hundredHolder.size());
        bills.put(fiftyMoneyBill, fiftyHolder.size());
        bills.put(tenMoneyBill, tenHolder.size());

        bills.put(twentyMoneyBill, twentyHolder.size());

        return Collections.unmodifiableMap(bills);
    }

    private int getValueTotalInCashier(){
        return getValueTotalOfBill(tenHolder)
                + getValueTotalOfBill(twentyHolder)
                + getValueTotalOfBill(fiftyHolder)
                + getValueTotalOfBill(hundredHolder);
    }

    private int getValueTotalOfBill(final Stack<Money> moneyBill) {
        return getAmountTotalOfBill(moneyBill) * moneyBill.peek().getMoneyBillValue();
    }

    private int getAmountTotalOfBill(final Stack<Money> moneyBill) {
        return moneyBill.size();
    }

    private void takeMoneyBill(final Stack<Money> moneyBill, final int quantity) {
        for (int i = 0; i < quantity; i++) {
            moneyBill.pop();
        }
    }

    private void replaceBill(final Stack<Money> moneyBill, final Money money, final int quantity) {
        for (int i = 0; i < quantity; i++) {
            moneyBill.push(money);
        }
    }

    public int depositMoneyBill(int valueDeposit){
        int holder = valueDeposit/100;
        replaceBill(hundredHolder, hundredMoneyBill, holder);
        valueDeposit -= holder*100;

        holder = valueDeposit/50;
        replaceBill(fiftyHolder, fiftyMoneyBill, holder);
        valueDeposit -= holder*50;

        holder = valueDeposit/20;
        replaceBill(twentyHolder, twentyMoneyBill, holder);
        valueDeposit -= holder*20;

        holder = valueDeposit/10;
        replaceBill(tenHolder, tenMoneyBill, holder);
        valueDeposit -= holder*10;

        if (valueDeposit > 0){
            return valueDeposit;
        }
        return 0;
    }

    private boolean hasEnoughMoney(final int valueWithdraw) {
        return (getValueTotalInCashier() >= valueWithdraw);
    }

    private boolean hasEnoughMoneyBill(final Stack<Money> moneyBill, final int moneyBillNeed) {
        return (getAmountTotalOfBill(moneyBill) >= moneyBillNeed);
    }

    /*private List takeCash(int valueWithdraw){
        List<Integer> valuesToWithdraw = new ArrayList<>();
        if(hasEnoughMoney(valueWithdraw)){
            if(hasEnoughMoneyBill(hundredHolder,(valueWithdraw/100)){
                valuesToWithdraw -= getValueTotalOfBill(hundredHolder));
            }
        }
        return Collections.emptyList();
    }*/


}
