package com.example.android.userprofile;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView nameTextView = (TextView)findViewById(R.id.name);
        TextView birthdayTextView = (TextView)findViewById(R.id.birthday);
        TextView countryTextView = (TextView)findViewById(R.id.country);

        nameTextView.setText("Samuel Gracious Etsiakoh");
        nameTextView.setTextSize(30);
        nameTextView.setTextColor(Color.BLUE);
        birthdayTextView.setText("20th April 1994");
        countryTextView.setText("Ghana");

        ImageView profilePicture = (ImageView)findViewById(R.id.profile_picture);
        profilePicture.setImageResource(R.drawable.sam);
    }
}
