package main.java.br.com.andrade.beginner.exercise1036;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        double a = Double.parseDouble(values[0]);
        double b = Double.parseDouble(values[1]);
        double c = Double.parseDouble(values[2]);

        double delta = Math.pow(b, 2) - 4 * a * c;

        if (a == 0 || delta < 0) {
            System.out.println("Impossivel calcular");
        } else {
            double R1 = ((-b + Math.sqrt(delta)) / (2 * a));
            double R2 = ((-b - Math.sqrt(delta)) / (2 * a));

            System.out.println("R1 = " + String.format("%.5f", R1));
            System.out.println("R2 = " + String.format("%.5f", R2));
        }
    }
}