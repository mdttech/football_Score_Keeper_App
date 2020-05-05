package com.example.hp.footballscore;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Tracks the score for Team A
    int scoreTeamA = 0;

    // Tracks the score for Team B
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Increase the score for Team A by 1 point.
     */
    public void addOneForTeamA(View v) {
        scoreTeamA = scoreTeamA + 1;
        displayForTeamA(scoreTeamA);
    }

    /**
     * decrease the score for Team B by 1 point.
     */
    public void subOneForTeamA(View v) {
        if (scoreTeamB == 0) {
            Toast.makeText(this, "You Can Not Have Less Than 0 Goals", Toast.LENGTH_SHORT).show();
            return;
        } else {
            scoreTeamB = scoreTeamB - 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Increase the score for Team B by 1 point.
     */
    public void addOneForTeamB(View v) {
        scoreTeamB = scoreTeamB + 1;
        displayForTeamB(scoreTeamB);
    }

    /**
     * decrease the score for Team B by 1 point.
     */
    public void subOneForTeamB(View v) {
        if (scoreTeamB == 0) {
            Toast.makeText(this, "You Can Not Have Less Than 0 Run", Toast.LENGTH_SHORT).show();
            return;
        } else {
            scoreTeamB = scoreTeamB - 1;
            displayForTeamB(scoreTeamB);
        }
    }

    /**
     * Resets the score for both teams back to 0.
     */
    public void resetScore(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Displays the given score for Team B.
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }
}
