package com.observer;

public class TradingObserver implements IObserver {
    @Override
    public void update(double exchangeRate) {
        System.out.println("Трейдер получил обновление курса валют: " + exchangeRate);
    }
}
