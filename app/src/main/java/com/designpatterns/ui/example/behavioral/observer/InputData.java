package com.designpatterns.ui.example.behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class InputData implements Subject {

    private List<Observer> observers;
    private String data;

    public InputData() {
        observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(data);
        }
    }

    public void updateData(String data) {
        this.data = data;
        notifyObservers();
    }
}
