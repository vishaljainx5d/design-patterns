package dev.designpattern.observer;

import dev.designpattern.observer.observable.StocksObservable;
import dev.designpattern.observer.observable.impl.IPhoneObservableImpl;
import dev.designpattern.observer.observer.NotificationAlertObserver;
import dev.designpattern.observer.observer.impl.EmailAlertObservableImpl;
import dev.designpattern.observer.observer.impl.MobileAlertObservableImpl;

public class Store {
    public static void main(String[] args) {
        StocksObservable stocksObservable = new IPhoneObservableImpl();

        NotificationAlertObserver mobileAlert = new MobileAlertObservableImpl("John", stocksObservable);
        NotificationAlertObserver emailAlert = new EmailAlertObservableImpl("John@123", stocksObservable);
        NotificationAlertObserver emailAlert2 = new EmailAlertObservableImpl("John@456", stocksObservable);

        stocksObservable.add(mobileAlert);
        stocksObservable.add(emailAlert);
        stocksObservable.add(emailAlert2);

        stocksObservable.setStockCount(1);
        stocksObservable.setStockCount(0);
        stocksObservable.setStockCount(10);
    }
}
