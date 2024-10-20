package com.observer;

import java.util.ArrayList;
import java.util.List;

public class CurrencyExchange implements ISubject{
    private List<IObserver> observers;
    private double exchangeRate;

    public CurrencyExchange() {
        observers = new ArrayList<>();
    }

    public void setExchangeRate(double exchangeRate) {
        this.exchangeRate = exchangeRate;
        notifyObservers();
    }

    @Override
    public void addObserver(IObserver observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(IObserver observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (IObserver observer : observers) {
            observer.update(exchangeRate);
        }
    }
}
