package model;

public class Money {

    public int value;

    public Money(int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Money)) return false;

        Money money = (Money) o;

        return getValue() == money.getValue();
    }

    @Override
    public int hashCode() {
        return getValue();
    }
}
