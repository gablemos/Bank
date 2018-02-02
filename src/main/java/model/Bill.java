package model;

public enum Bill {

    TEN(10), TWENTY(20), FIFTY(50), HUNDRED(100);

    private final int billValue;

    Bill(final int value){
        billValue = value;
    }

    public int getBillValue(){
        return billValue;
    }
}
