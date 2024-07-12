package main.java.br.com.andrade.beginner.exercise1015;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0000");

        String[] p1 = sc.nextLine().split(" ");
        String[] p2 = sc.nextLine().split(" ");

        double x1 = Double.parseDouble(p1[0]);
        double y1 = Double.parseDouble(p1[1]);
        double x2 = Double.parseDouble(p2[0]);
        double y2 = Double.parseDouble(p2[1]);

        double result = (double) Math.round(Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2))*10000)/10000;


        System.out.println(df.format(result));
    }
}