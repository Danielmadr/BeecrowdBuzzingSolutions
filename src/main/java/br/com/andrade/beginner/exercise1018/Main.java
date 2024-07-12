package main.java.br.com.andrade.beginner.exercise1018;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int money = 100;
        int input = sc.nextInt();
        System.out.println(input);

        do {
            System.out.println(input / (money) + " nota(s) de R$ " + money + ",00");
            input %= money;
            money = money/2 == 25 ? 20 : money/2;
        }while (money != 0);
    }
}