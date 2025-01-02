package dev.designpattern.observer.observable.impl;

import dev.designpattern.observer.observable.StocksObservable;
import dev.designpattern.observer.observer.NotificationAlertObserver;

import java.util.ArrayList;
import java.util.List;

public class IPhoneObservableImpl implements StocksObservable {
    private int stockCount;
    private List<NotificationAlertObserver> observerList = new ArrayList<>();

    @Override
    public void add(NotificationAlertObserver observer) {
        this.observerList.add(observer);
    }

    @Override
    public void remove(NotificationAlertObserver observer) {
        this.observerList.remove(observer);
    }

    @Override
    public void notifySubscribers() {
        for (NotificationAlertObserver observer : observerList) {
            observer.update();
        }
    }

    @Override
    public void setStockCount(int newStockAdded) {
        if (this.stockCount == 0 && newStockAdded > 0) {
            notifySubscribers();
        } else if (newStockAdded == 0) {
            this.stockCount = newStockAdded;
        }
        this.stockCount = this.stockCount + newStockAdded;
    }

    @Override
    public int getStockCount() {
        return this.stockCount;
    }
}
