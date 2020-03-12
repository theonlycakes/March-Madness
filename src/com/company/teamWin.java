package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

import static com.company.playersToTeams.playerNumbers;

public class teamWin extends Thread {

    private String team1;
    private String team2;
    private Thread t;
    public teamWin(String t1, String t2){
        team1 = t1;
        team2 = t2;
    }

    public void run() {
        double t1 [] = new double[5];
        double t2 [] = new double[5];
        for (String player: playerNumbers.get(team1)) {
            
        }

    }

    public void start() {
        //Check if thread already exists
        if (t == null) {
            t = new Thread (this, team1);
            t.start ();
        }
    }
}
