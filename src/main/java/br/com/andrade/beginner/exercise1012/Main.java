package main.java.br.com.andrade.beginner.exercise1012;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");
        final double PI = 3.14159;

        String[] input = sc.nextLine().split(" ");

        double A = Double.parseDouble(input[0]);
        double B = Double.parseDouble(input[1]);
        double C = Double.parseDouble(input[2]);

        double triangleA = (double) Math.round(((A*C)/2)*1000)/1000;
        double circleA = (double) Math.round((PI * Math.pow(C,2))*1000)/1000;
        double trapezeA =(double)  Math.round((((A+B)*C)/2)*1000)/1000;
        double squareA = (double) Math.round((B*B)*1000)/1000;
        double rectangleA = (double) Math.round((A*B)*1000)/1000;

        System.out.println("TRIANGULO = " + df.format(triangleA));
        System.out.println("CIRCULO = " + df.format(circleA));
        System.out.println("TRAPEZIO = " + df.format(trapezeA));
        System.out.println("QUADRADO = " + df.format(squareA));
        System.out.println("RETANGULO = " + df.format(rectangleA));
    }

}