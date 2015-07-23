package com.jiu9x9uij.observerpatternexample;

import android.widget.TextView;

/**
 * Created by Yilin on 2015/7/23.
 */
public class HexObserver extends Observer {
    TextView tv;

    public HexObserver(TextView tv, Subject subject) {
        this.subject = subject;
        this.subject.attach(this);
        this.tv = tv;
    }

    @Override
    public void update() {
        tv.setText("HexObserver: " + Integer.toHexString(subject.getValue()));
    }
}
