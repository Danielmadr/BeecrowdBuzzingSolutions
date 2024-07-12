package main.java.br.com.andrade.beginner.exercise1040;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");

        double N1 = Double.parseDouble(input[0]);
        double N2 = Double.parseDouble(input[1]);
        double N3 = Double.parseDouble(input[2]);
        double N4 = Double.parseDouble(input[3]);

        double average = ((N1 * 2) + (N2 * 3) + (N3 * 4) + N4) / 10;
        System.out.println("Media: " + String.format("%.1f", average));
        if (average >= 7.0) {
            System.out.println("Aluno aprovado.");
        } else if (average < 5.0) {
            System.out.println("Aluno reprovado.");
        } else {
            System.out.println("Aluno em exame.");
            double examScore = Double.parseDouble(sc.nextLine());
            System.out.println("Nota do exame: " + String.format("%.1f", examScore));
            double finalAverage = (average + examScore) / 2;
            if (finalAverage >= 5.0) {
                System.out.println("Aluno aprovado.");
            } else {
                System.out.println("Aluno reprovado.");
            }
            System.out.println("Media final: " + String.format("%.1f", finalAverage));
        }
    }
}