package com.company;

public class teamWin extends Thread {

    private String team1;
    private String team2;
    private Thread t;
    public teamWin(){

    }

    public void run() {

    }

    public void start() {
        //Check if thread already exists
        if (t == null) {
            t = new Thread (this, team1);
            t.start ();
        }
    }
}
