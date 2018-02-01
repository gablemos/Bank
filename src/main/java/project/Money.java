package project;

public class Money {

    public int value;

    public Money(final int value){
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    private void setValue(int value) {
        this.value = value;
    }
}
