package testes;

import java.util.Stack;

import model.Bill;
import model.Money;

public class TestePilha {
    public static void main(String[] args) {

        Stack<Money> pilhaDez = new Stack<Money>();

        Money notaDez = new Money(Bill.TEN);

        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);
        pilhaDez.push(notaDez);

        System.out.println(pilhaDez.size());

        Money pecaRemove = pilhaDez.pop();

        if (pilhaDez.isEmpty()) {
            System.out.println("A pilhaDez está vazia");
        } else {
            System.out.println("Tem " + pilhaDez.size() + " notas de Dez, total de R$ " + 10*pilhaDez.size());
        }
    }
}
