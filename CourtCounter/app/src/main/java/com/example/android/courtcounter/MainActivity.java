package com.example.android.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int scoreForTeamA = 0;
    int scoreForTeamB = 0;

    int foulForTeamA = 0;
    int foulForTeamB = 0;

    int cornerForTeamA = 0;
    int cornerForTeamB = 0;

    int redForTeamA = 0;
    int redForTeamB = 0;

    int yellowForTeamA = 0;
    int yellowForTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);

        displayGoalForTeamA(0);
        displayGoalForTeamB(0);
        displayFoulForTeamA(0);
        displayFoulForTeamB(0);
        displayCornerForTeamA(0);
        displayCornerForTeamB(0);
        displayRedForTeamA(0);
        displayRedForTeamB(0);
        displayYellowForTeamA(0);
        displayYellowForTeamB(0);


    }

    // Method of adding Team A's goals
    public void addGoalForTeamA(View view) {
        scoreForTeamA = scoreForTeamA + 1;
        displayGoalForTeamA(scoreForTeamA);
    }

    // Method of displaying Team A's goals
    public void displayGoalForTeamA(int goal) {
        TextView textView = (TextView) findViewById(R.id.team_a_score);
        textView.setText("" + goal);
    }

    // Method of adding Team B's goals
    public void addGoalForTeamB(View view) {
        scoreForTeamB = scoreForTeamB + 1;
        displayGoalForTeamB(scoreForTeamB);
    }

    // Method of adding Team B's goals
    public void displayGoalForTeamB(int goal) {
        TextView textView = (TextView) findViewById(R.id.team_b_score);
        textView.setText("" + goal);
    }

    // Method of adding Team A's fouls
    public void addFoulToTeamA(View view) {
        foulForTeamA = foulForTeamA + 1;
        displayFoulForTeamA(foulForTeamA);
    }

    // Method of displaying Team A's fouls
    public void displayFoulForTeamA(int foul) {
        TextView textView = (TextView) findViewById(R.id.displayTeamAFoul);
        textView.setText("" + foul);
    }

    // Method of adding Team B's fouls
    public void addFoulToTeamB(View view) {
        foulForTeamB = foulForTeamB + 1;
        displayFoulForTeamB(foulForTeamB);
    }

    // Method of displaying Team B's fouls
    public void displayFoulForTeamB(int foul) {
        TextView textView = (TextView) findViewById(R.id.displayTeamBFoul);
        textView.setText("" + foul);
    }

    // Method of adding Team A's corner
    public void addCornerToTeamA(View view) {
        cornerForTeamA = cornerForTeamA + 1;
        displayCornerForTeamA(cornerForTeamA);
    }

    // Method of displaying Team A's fouls
    public void displayCornerForTeamA(int corner) {
        TextView textView = (TextView) findViewById(R.id.displayTeamACorner);
        textView.setText("" + corner);
    }

    // Method of adding Team B's corner
    public void addCornerToTeamB(View view) {
        cornerForTeamB = cornerForTeamB + 1;
        displayCornerForTeamB(cornerForTeamB);
    }

    // Method of displaying Team B's corner
    public void displayCornerForTeamB(int corner) {
        TextView textView = (TextView) findViewById(R.id.displayTeamBCorner);
        textView.setText("" + corner);
    }

    // Method of adding Team A's red
    public void addRedToTeamA(View view) {
        redForTeamA = redForTeamA + 1;
        displayRedForTeamA(redForTeamA);
    }

    // Method of displaying Team A's red
    public void displayRedForTeamA(int red) {
        TextView textView = (TextView) findViewById(R.id.displayTeamARed);
        textView.setText("" + red);
    }

    // Method of adding Team B's red
    public void addRedToTeamB(View view) {
        redForTeamB = redForTeamB + 1;
        displayRedForTeamB(redForTeamB);
    }

    // Method of displaying Team B's red
    public void displayRedForTeamB(int red) {
        TextView textView = (TextView) findViewById(R.id.displayTeamBRed);
        textView.setText("" + red);
    }

    // Method of adding Team A's yellow
    public void addYellowToTeamA(View view) {
        yellowForTeamA = yellowForTeamA + 1;
        displayYellowForTeamA(yellowForTeamA);
    }

    // Method of displaying Team A's yellow
    public void displayYellowForTeamA(int yellow) {
        TextView textView = (TextView) findViewById(R.id.displayTeamAYellow);
        textView.setText("" + yellow);
    }

    // Method of adding Team B's yellow
    public void addYellowToTeamB(View view) {
        yellowForTeamB = yellowForTeamB + 1;
        displayYellowForTeamB(yellowForTeamB);
    }

    // Method of displaying Team B's yellow
    public void displayYellowForTeamB(int yellow) {
        TextView textView = (TextView) findViewById(R.id.displayTeamBYellow);
        textView.setText("" + yellow);
    }

    public void setBothTeamsToZero(View view) {
        scoreForTeamA = 0;
        displayGoalForTeamA(scoreForTeamA);

        scoreForTeamB = 0;
        displayGoalForTeamB(scoreForTeamB);

        foulForTeamA = 0;
        displayFoulForTeamA(foulForTeamA);

        foulForTeamB = 0;
        displayFoulForTeamB(foulForTeamB);

        cornerForTeamA = 0;
        displayCornerForTeamA(cornerForTeamA);

        cornerForTeamB = 0;
        displayCornerForTeamB(cornerForTeamB);

        redForTeamA = 0;
        displayRedForTeamA(redForTeamA);

        redForTeamB = 0;
        displayRedForTeamB(redForTeamB);

        yellowForTeamA = 0;
        displayYellowForTeamA(yellowForTeamA);

        yellowForTeamB = 0;
        displayYellowForTeamB(yellowForTeamB);

        Toast.makeText(this, "Reset successful!", Toast.LENGTH_LONG).show();
    }
}