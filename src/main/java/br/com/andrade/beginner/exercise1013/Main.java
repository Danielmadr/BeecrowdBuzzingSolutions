package main.java.br.com.andrade.beginner.exercise1013;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");


        int A = Integer.parseInt(input[0]);
        int B = Integer.parseInt(input[1]);
        int C = Integer.parseInt(input[2]);

        int lagerAB = (A + B + Math.abs(A-B))/2;
        int lager = (lagerAB + C + Math.abs(lagerAB - C))/2;

        System.out.println(lager + " eh o maior");
    }
}