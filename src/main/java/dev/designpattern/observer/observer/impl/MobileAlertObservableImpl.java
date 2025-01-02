package dev.designpattern.observer.observer.impl;

import dev.designpattern.observer.observable.StocksObservable;
import dev.designpattern.observer.observer.NotificationAlertObserver;

public class MobileAlertObservableImpl implements NotificationAlertObserver {

    String userName;
    StocksObservable stocksObservable;

    public MobileAlertObservableImpl(String userName, StocksObservable stocksObservable) {
        this.userName = userName;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendSMS(userName, "Stock has been added to the inventory");
    }

    private void sendSMS(String userName, String message) {
        System.out.println("SMS sent to: " + userName + " with message: " + message);
    }
}
