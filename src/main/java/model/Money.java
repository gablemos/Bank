package model;

public class Money {

    private final Bill moneyBill;

    public Money(Bill bill){
        this.moneyBill = bill;
    }

    public Bill getMoneyBill() {
        return moneyBill;
    }

    public int getMoneyBillValue(){
        return moneyBill.getBillValue();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        return getMoneyBill() == money.getMoneyBill();
    }

    @Override
    public int hashCode() {
        return getMoneyBill().hashCode();
    }
}
