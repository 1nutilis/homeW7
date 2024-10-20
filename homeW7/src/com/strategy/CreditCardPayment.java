package com.strategy;

public class CreditCardPayment implements IPaymentStrategy{
    @Override
    public void pay(double amount) {
        System.out.println("Оплата банковской картой: $" + amount);
    }
}
