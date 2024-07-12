package main.java.br.com.andrade.beginner.exercise1038;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    static double[] prices = {0.00, 4.00, 4.50, 5.00, 2.00, 1.50};

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String[] values = scanner.nextLine().split(" ");

        int code = Integer.parseInt(values[0]);
        int quantity = Integer.parseInt(values[1]);

        calculateTotalPrice(code, quantity);
    }

    private static void calculateTotalPrice(int code, int quantity) {
        double totalPrice = prices[code] * quantity;
        System.out.println("Total: R$ " + String.format("%.2f", totalPrice));
    }
}