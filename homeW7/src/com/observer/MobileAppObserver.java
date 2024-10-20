package com.observer;

public class MobileAppObserver implements IObserver{
    @Override
    public void update(double exchangeRate) {
        System.out.println("Мобильное приложение получило обновление курса валют: " + exchangeRate);
    }
}
