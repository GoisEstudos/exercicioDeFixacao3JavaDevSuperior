package org.example.service;

public class CurrencyConverter {

    public static Double realToDollar(Double dollarPrice, Double dollarBought) {
        Double result = (dollarPrice * dollarBought) * 0.06;
        return result + (dollarPrice * dollarBought);
    }
}
