package main.java.br.com.andrade.exercises.exercise1017;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        int temp = sc.nextInt();//h
        int AvSp= sc.nextInt();//km/h
        int cons = 12; //km/L

        double distPerLiters = temp * AvSp;

        double liters = (double) Math.round((distPerLiters/cons)*1000)/1000;
        System.out.println(df.format(liters));
        sc.close();
    }
}