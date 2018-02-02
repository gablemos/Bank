package model;

import com.sun.org.apache.bcel.internal.generic.BIPUSH;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testValor(){
        Money money = new Money(Bill.FIFTY);
        Money money2 = new Money(Bill.FIFTY);

        System.out.println(money.getMoneyBill());
        System.out.println(money.getMoneyBillValue());
        System.out.println(Bill.FIFTY);
        System.out.println(money.equals(money2));
    }

    @Test
    public void testSeiLa(){
        List<Money> lista = new ArrayList<>();

        Money dez = new Money(Bill.TEN);
        Money vinte = new Money(Bill.TWENTY);
        Money cinquenta = new Money(Bill.FIFTY);
        Money cem = new Money(Bill.HUNDRED);

        lista.add(dez);
        lista.add(vinte);
        lista.add(cinquenta);
        lista.add(cem);
        lista.add(dez);
        lista.add(dez);
        lista.add(dez);
        lista.add(vinte);
        lista.add(cinquenta);
        lista.add(cem);
        lista.add(cem);
        lista.add(cem);
        lista.add(cem);

        int i = 0;
        for (Money m : lista){
            i += m.getMoneyBillValue();
        }
        System.out.println(i);

        //lista.forEach(money -> i+= money.getMoneyBillValue());





    }

}