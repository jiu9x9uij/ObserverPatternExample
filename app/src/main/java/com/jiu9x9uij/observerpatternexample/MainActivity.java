package com.jiu9x9uij.observerpatternexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends Activity {
    boolean clicked = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tvBinaryObserver = (TextView) findViewById(R.id.tvBinaryObserver);
        TextView tvHexObserver = (TextView) findViewById(R.id.tvHexObserver);
        TextView tvNameObserver = (TextView) findViewById(R.id.tvNameObserver);
        final Subject subject = new Subject();
        new BinaryObserver(tvBinaryObserver, subject);
        new HexObserver(tvHexObserver, subject);
        new NameObserver(tvNameObserver, subject);

        final Button btnFire = (Button) findViewById(R.id.btnFire);

        btnFire.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (clicked == false) {
                    subject.setValue(99);
                    clicked = true;
                    btnFire.setText("What's 9?");
                } else {
                    subject.setValue(9);
                    clicked = false;
                    btnFire.setText("What's 99?");
                }
            }
        });
    }

}
