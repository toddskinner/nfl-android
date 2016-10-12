package com.example.android.nflscores;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int scoreEagles = 0;
    int scorePats = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /**
     * Adds a touchdown (6 points) for the Eagles.
     */

    public void addTDForEagles(View view)
    {
        scoreEagles = scoreEagles + 6;
        displayForEagles(scoreEagles);
    }

    /**
     * Adds a touchdown (6 points) for the Patriots.
     */

    public void addTDForPats(View view)
    {
        scorePats = scorePats + 6;
        displayForPats(scorePats);
    }

    /**
     * Adds a extra point (1 point) for the Eagles.
     */

    public void addXPForEagles(View view)
    {
        scoreEagles = scoreEagles + 1;
        displayForEagles(scoreEagles);
    }

    /**
     * Adds a extra point (1 point) for the Patriots.
     */

    public void addXPForPats(View view)
    {
        scorePats = scorePats + 1;
        displayForPats(scorePats);
    }

    /**
     * Adds a field goal (3 points) for the Eagles.
     */

    public void addFGForEagles(View view)
    {
        scoreEagles = scoreEagles + 3;
        displayForEagles(scoreEagles);
    }

    /**
     * Adds a field goal (3 points) for the Patriots.
     */

    public void addFGForPats(View view)
    {
        scorePats = scorePats + 3;
        displayForPats(scorePats);
    }

    /**
     * Adds a safety (2 points) for the Eagles.
     */

    public void addSafetyForEagles(View view)
    {
        scoreEagles = scoreEagles + 2;
        displayForEagles(scoreEagles);
    }

    /**
     * Adds a safety (2 point) for the Patriots.
     */

    public void addSafetyForPats(View view)
    {
        scorePats = scorePats + 2;
        displayForPats(scorePats);
    }

    /**
     * Displays the given score for the Eagles.
     */
    public void displayForEagles(int scoreEagles) {
        TextView scoreView = (TextView) findViewById(R.id.eagles_score);
        scoreView.setText(String.valueOf(scoreEagles));
    }

    /**
     * Displays the given score for the Patriots.
     */

    public void displayForPats(int scorePats)
    {
        TextView scoreView = (TextView) findViewById(R.id.pats_score);
        scoreView.setText(String.valueOf(scorePats));
    }

    public void resetScores(View view)
    {
        scoreEagles = 0;
        scorePats = 0;
        displayForEagles(scoreEagles);
        displayForPats(scorePats);
    }

}
