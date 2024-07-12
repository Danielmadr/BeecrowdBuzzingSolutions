package main.java.br.com.andrade.beginner.exercise1011;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        double pi = 3.14159;
        int radius = sc.nextInt();
        double volume = (double) Math.round((((double) 4 / 3) * pi * Math.pow(radius, 3)) * 1000) / 1000;
        String output = df.format(volume);

        System.out.println("VOLUME = " + output);
    }
}