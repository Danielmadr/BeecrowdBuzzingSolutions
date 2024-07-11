package main.java.br.com.andrade.exercises.exercise1020;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        int anos = input/365;
        int mes = input%365/30;
        int dia = input%365%30;

        System.out.printf("""
                %d ano (s)
                %d mes (es)
                %d dia (s)""",anos,mes,dia);
    }
}