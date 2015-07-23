package com.jiu9x9uij.observerpatternexample;

import android.widget.TextView;

/**
 * Created by Yilin on 2015/7/23.
 */
public class BinaryObserver extends Observer {
    TextView tv;

    public BinaryObserver(TextView tv, Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        this.tv = tv;
    }

    @Override
    public void update() {
        tv.setText("BinaryObserver: " + Integer.toBinaryString(subject.getValue()));
    }
}
