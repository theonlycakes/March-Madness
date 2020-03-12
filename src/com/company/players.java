package com.company;

public class players {
    private double hits;
    private double total;
    private double misses;
    private double score;
    private double hits3;
    private double hits2;
    private double hits1;
    private double hitRate;
    private double averageScore;
    private double scorePerShot;
    //Player object that stores their info
    public players(){
        score = 0;
        misses = 0;
        total = 0;
        hits = 0;
        hits3 = 0;
        hits2 = 0;
        hits1 = 0;
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
        hits3++;
    }
    public void add2Point(){
        score += 2;
        hits2++;
    }
    public void add1Point(){
        score++;
        hits1++;
    }
    public void calculate(){
        //calculate the hit rate
        hitRate = hits / misses;
        //Calculate average score of hits
        averageScore = total / hits;
        //Gets the score of each shot
        scorePerShot = averageScore * hitRate;
    }
}
