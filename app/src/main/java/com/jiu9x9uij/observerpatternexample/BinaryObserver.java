package com.jiu9x9uij.observerpatternexample;

import android.widget.TextView;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by Yilin on 2015/7/23.
 */
public class BinaryObserver implements Observer {
    Subject subject;
    TextView tv;

    public BinaryObserver(TextView tv, Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
        this.tv = tv;
    }

    @Override
    public void update(Observable observable, Object data) {
        tv.setText("BinaryObserver: " + Integer.toBinaryString(subject.getValue()));
    }
}
