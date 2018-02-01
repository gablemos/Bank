package project;

import java.util.Scanner;

public class TestRetirarNota {
    public static void main(String[] args) {

        int stack100 = 4;
        int value100 = stack100 * 100;

        int stack50 = 1;
        int value50 = stack50 * 50;

        int valueWithdraw = 250;


        int billHandler = valueWithdraw / 100;

        if (stack100 > billHandler){
            stack100 -= billHandler;
            valueWithdraw -= billHandler*100;
        }else{
            valueWithdraw -= stack100*100;
            stack100 -= stack100;
        }
        System.out.println(valueWithdraw);
        System.out.println(stack100);

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
    }
}
