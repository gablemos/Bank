package view;

import java.util.Scanner;

public class ATMView {
    static Scanner scanner = new Scanner(System.in);
    public void requestAccountMsg(){
        System.out.println("Entre com uma conta bancária: ");
    }

    public void requestValidAccountMsg(){
        System.out.println("Entre com uma conta bancária válida: ");
    }

    public int getValueFromScreen(){
        return scanner.nextInt();
    }

    public void menuOptionHeader(){
        System.out.println("\n\nCaixa Eletrônico 1.0\n");
    }

    public void menuOptionOne(){
        System.out.println("1.     Saldo");
    }

    public void menuOptionTwo(){
        System.out.println("2.     Saque");
    }

    public void menuOptionThree(){
        System.out.println("3.     Depósito");
    }

    public void menuOptionFour(){
        System.out.println("4.     Transferência");
    }

    public void menuOptionFive(){
        System.out.println("5.     Extrato");
    }

    public void menuOptionSix(){
        System.out.println("6.     Sair");
    }

    public void menuOptionChoice(){
        System.out.println("Qual transação deseja efetuar: ");
    }

    public void bankBalanceMenu(){
        System.out.print("Seu saldo é de: R$ ");
    }

    public void requestValueMsg(){
        System.out.println("Entre com o valor da transação: ");
    }

    public void invalidOption(){
        System.out.println("Opção invalida!");
    }

    public void splitScreen(){
        System.out.println("-------------------------------------------------------------------------------");
    }

    public void sucess(){
        System.out.println("Operação realizada com sucesso.");
    }
}
