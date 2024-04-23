package org.example;

import org.example.service.CurrencyConverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("WHAT IS THE DOLLAR PRICE? ");
        Double dollarPrice =  sc.nextDouble();
        System.out.println("HOW MANY DOLLARS WILL BE BOUGHT? ");
        Double buyDolar = sc.nextDouble();
        System.out.println(String.format(
                "AMOUNT TO BE PAID IN REAL = %.2f", CurrencyConverter.realToDollar(dollarPrice, buyDolar)));
    }
}