package main.java.br.com.andrade.beginner.exercise1021;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] values = sc.nextLine().split(" ");

        int A = Integer.parseInt(values[0]);
        int B = Integer.parseInt(values[1]);
        int C = Integer.parseInt(values[2]);
        int D = Integer.parseInt(values[3]);

        if (B > C && D > A && (C + D) > (A + B) && C > 0 && D > 0 && A % 2 == 0) {
            System.out.println("Valores aceitos");
        } else {
            System.out.println("Valores nao aceitos");
        }

    }
}