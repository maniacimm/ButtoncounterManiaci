package com.example.maddiemaniaci.button_counter_maniaci;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    TextView showValue;
    int counter = 0; // initial value

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        showValue = findViewById(R.id.counterVal);
    }

    public void addCount (View view) {
        counter++;
        showValue.setText(Integer.toString(counter));
    }

    public void minusCount (View v) {
        counter--;
        showValue.setText(Integer.toString(counter));
    }

    public void resetCount (View view) {
        counter = 0;
        showValue.setText(String.valueOf(counter));
    }
}
