package main.java.br.com.andrade.exercises.exercise1016;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int dist = sc.nextInt();

        int temp = dist * 2;

        System.out.println(temp + " minutos");
        sc.close();
    }
}