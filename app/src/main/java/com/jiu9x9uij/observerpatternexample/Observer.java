package com.jiu9x9uij.observerpatternexample;

/**
 * Created by Yilin on 2015/7/23.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
