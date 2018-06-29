package com.example.android.practiceset2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String firstName = "Lyla";
        String lastName = "Fujiwara";
        String contactInfo = firstName + " " + lastName;
        contactInfo = "<" + lastName + "." + firstName + "@justjava.com>";
        display(contactInfo);
    }

    /**
     * Display methods that allow the text to appear on the screen. Don't worry if you don't know
     * how these work yet. We'll be covering them in lesson 3.
     * @param i
     */

    public void display (String i) {
        TextView t = (TextView) findViewById(R.id.display_text_view);
        t.setText(""+i);
    }

    public void display2 (String i) {
        TextView t = (TextView) findViewById(R.id.display_text_view_2);
        t.setText(""+i);
    }

    public void display3 (String i) {
        TextView t = (TextView) findViewById(R.id.display_text_view_3);
        t.setText(""+i);
    }
}
