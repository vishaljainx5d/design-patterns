package dev.designpattern.observer.observer.impl;

import dev.designpattern.observer.observable.StocksObservable;
import dev.designpattern.observer.observer.NotificationAlertObserver;

public class EmailAlertObservableImpl implements NotificationAlertObserver {

    String emailId;
    StocksObservable stocksObservable;

    public EmailAlertObservableImpl(String emailId, StocksObservable stocksObservable) {
        this.emailId = emailId;
        this.stocksObservable = stocksObservable;
    }

    @Override
    public void update() {
        sendMail(emailId, "Stock has been added to the inventory");
    }

    private void sendMail(String emailId, String message) {
        System.out.println("Email sent to: " + emailId + " with message: " + message);
    }
}
