package model;

import org.junit.Test;

import static org.junit.Assert.*;

public class MoneyTest {

    @Test
    public void testValor(){
        int anyNumber = 10;
        Money tenBill = new Money(10);
        assertEquals(anyNumber, tenBill.getValue());

        System.out.println(tenBill.getValue() == anyNumber);
    }

}