package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static com.company.playersToTeams.*;

public class teamWin2 extends Thread {
    //This exists because it works and I don't feel like finding another solution currently

    private String team1;
    private String team2;
    public String winner;
    private double team1Rate;
    private double team2Rate;
    private Thread t;
    public teamWin2(String t1, String t2){
        team1 = t1;
        team2 = t2;
    }

    public void run() {
        //ArrayList to hold the player pShot in one spot
        ArrayList<Double> t1 = new ArrayList<Double>();
        ArrayList<Double> t2 = new ArrayList<Double>();
        //Adds the pShot to the ArrayLists
        for (String player: playerNumbers.get(team1)) {
            t1.add(teams.get(team1).get(player).pShot());
        }
        for (String player: playerNumbers.get(team2)) {
            t2.add(teams.get(team2).get(player).pShot());
        }
        //Sorts the lists
        Collections.sort(t1);
        Collections.sort(t2);
        //Some variables to store data temporarily
        double team1Score = 0;
        double team2Score = 0;
        //Calculates for the best 5 players on the team
        for (int i = 1; i < 6;i++) {
            team1Score += 20 * (t1.get(t1.size()-i));
        }
        for (int i = 1; i < 6;i++) {
            team2Score += 20 * t2.get(t2.size()-i);
        }
        //Adds the value of the win to the team who won
        if (team1Score > team2Score) {
            team1Rate = .2;
            team2Rate = 0;
        } else if (team2Score > team1Score) {
            team1Rate = 0;
            team2Rate = .2;
        } else {
            team1Rate = .1;
            team2Rate = .1;
        }
        //Calculates with random players
        Random ran = new Random();
        for (int t = 0; t < 8000; t++) {
            //Resets the score
            team1Score = 0;
            team2Score = 0;
            //Does the score for the random players
            for (int i = 1; i < 6;i++) {
                team1Score += 20 * t1.get(ran.nextInt(t1.size()));
            }
            for (int i = 1; i < 6;i++) {
                team2Score += 20 * t2.get(ran.nextInt(t2.size()));
            }
            //Sees which team won
            if (team1Score > team2Score) {
                team1Rate += .0001;
                team2Rate += 0;
            } else if (team2Score > team1Score) {
                team1Rate += 0;
                team2Rate += .0001;
            } else {
                team1Rate += .00005;
                team2Rate += .00005;
            }
        }
        //Gets who won overall and assigns to the winner variable
        if (team1Rate > team2Rate) {
            winner = team1;
        } else {
            winner = team2;
        }
        //Allows the program to continue
        latchRound3.countDown();
    }

    public void start() {
        //Check if thread already exists
        if (t == null) {
            t = new Thread (this, team1);
            t.start ();
        }
    }
}
