package main.java.br.com.andrade.exercises.exercise1019;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();
        int segundos = input % 60;
        int minutos = (input / 60) % 60;
        int horas = input / 60 / 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
    }
}