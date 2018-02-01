package project;

import java.util.Scanner;

public class TestDivisão {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n = scanner.nextDouble();

        System.out.println(n);
        int n100 = (int)(n/100);
        n = n - n100*100;
        System.out.println(n);
        int n50 = (int)(n/50);
        n = n - n50*50;
        System.out.println(n);
        int n20 = (int)(n/20);
        n = n - n20*20;
        System.out.println(n);
        int n10 = (int)(n/10);
        n = n - n10*10;
        System.out.println(n);
        int n5 = (int)(n/5);
        n = n - n5*5;
        System.out.println(n);
        int n2 = (int)(n/2);
        n = n - n2*2;
        System.out.println(n);
    }
}
