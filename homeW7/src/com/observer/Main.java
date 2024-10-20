package com.observer;

public class Main {
    public static void main(String[] args) {
        CurrencyExchange currencyExchange = new CurrencyExchange();


        BankObserver bank = new BankObserver();
        TradingObserver trader = new TradingObserver();
        MobileAppObserver app = new MobileAppObserver();


        currencyExchange.addObserver(bank);
        currencyExchange.addObserver(trader);
        currencyExchange.addObserver(app);


        currencyExchange.setExchangeRate(75.5);
        currencyExchange.setExchangeRate(76.8);
    }
}
