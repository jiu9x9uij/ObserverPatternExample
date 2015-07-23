package com.jiu9x9uij.observerpatternexample;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Yilin on 2015/7/23.
 */
public class Subject {
    private List<Observer> observers = new ArrayList<Observer>();
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyAllObservers();
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void notifyAllObservers() {
        for (Observer observer: observers) {
            observer.update();
        }
    }

}
