package main.java.br.com.andrade.exercises.exercise1014;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        int X = sc.nextInt();
        double Y = sc.nextDouble();

        double result = (double) Math.round((X/Y) * 1000) / 1000;

        System.out.println(df.format(result) + " km/l");
    }
}