package com.example.android.cookies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Creates the Eat Cookie button to change the text and image when clicked
     * @param view implies that it is an object of the View class
     */
    public void eatUp_button(View view) {
        //Sets up the TextView and changes to the "I;m so full"
        TextView textView = (TextView)findViewById(R.id.status_text_view);
        textView.setText("I'm so full");

        //Sets up the ImageView and changes to the after_cookie image
        ImageView imageView = (ImageView)findViewById(R.id.android_cookie_image_view);
        imageView.setImageResource(R.drawable.after_cookie);
    }
}
