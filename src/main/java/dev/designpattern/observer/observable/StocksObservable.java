package dev.designpattern.observer.observable;

import dev.designpattern.observer.observer.NotificationAlertObserver;

public interface StocksObservable {

    void add(NotificationAlertObserver observer);
    void remove(NotificationAlertObserver observer);
    void notifySubscribers();
    void setStockCount(int newStockAdded);
    int getStockCount();
}
