package com.jiu9x9uij.observerpatternexample;

import java.util.Observable;

/**
 * Created by Yilin on 2015/7/23.
 */
public class Subject extends Observable {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers(this);
    }
}
