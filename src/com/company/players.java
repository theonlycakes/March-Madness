package com.company;

public class players {
    public int hits;
    public int total;
    public int misses;
    public int score;
    //Player object that stores their info
    public players(){
        score = 0;
        misses = 0;
        total = 0;
        hits = 0;
    }
    public void addHit(){
        hits++;
        total++;
    }
    public void addMiss(){
        misses++;
        total++;
    }
    public void add3Point(){
        score += 3;
    }
    public void add2Point(){
        score += 2;
    }
    public void add1Point(){
        score++;
    }
}
