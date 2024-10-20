package com.observer;

public class BankObserver implements IObserver{
    @Override
    public void update(double exchangeRate) {
        System.out.println("Банк получил обновление курса валют: " + exchangeRate);
    }
}
