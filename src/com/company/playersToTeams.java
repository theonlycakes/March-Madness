package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.CountDownLatch;

import static com.company.Main.teamNames;

public class playersToTeams {
    //Stores a map for each team which contains objects for each player
    public static Map<String, Map<String, players>> teams = new HashMap<String, Map<String, players>>();
    //Allows for easy access of the players
    public static Map<String, ArrayList<String>> playerNumbers = new HashMap<String, ArrayList<String>>();
    //Check for threads finished
    public static CountDownLatch latch = new CountDownLatch(4);
    public playersToTeams() throws FileNotFoundException, InterruptedException {
        //Gets the location of the file
        File f = new File("Data/MPlayers.csv");
        File teamCodeFile = new File(String.valueOf(f.getAbsoluteFile()));
        //String to store temp
        String storageString [];
        //Opens the file in a Scanner to read the data
        Scanner playerReader = new Scanner(teamCodeFile, "UTF-8");

        //Loops through the whole file
        while (playerReader.hasNextLine()) {
            //adds the next line to the string array
            storageString = playerReader.nextLine().split(",");
            //allows to check if in any of the teams
            for (String teamCheck: teamNames) {
                if(storageString[3].equalsIgnoreCase(teamCheck)) {
                    //Makes a player object with the players number and adds to team HashMap
                    teams.get(teamCheck).put(storageString[0],new players());
                    playerNumbers.get(teamCheck).add(storageString[0]);
                    //System.out.println(storageString[0]);
                }
            }

        }
        //Multiple Threads to try to run faster
        //Adds the data to the player values
        dataReader y2016 = new dataReader("MEvents2016");
        y2016.start();

        dataReader y2017 = new dataReader("MEvents2017");
        y2017.start();

        dataReader y2018 = new dataReader("MEvents2018");
        y2018.start();

        dataReader y2019 = new dataReader("MEvents2019");
        y2019.start();

        //waits for threads to finish
        latch.await();

        //Calculate the score per shot for each player
        for (String teamCode: teamNames) {
            //runs for all the players in the team
            for (String player : playerNumbers.get(teamCode)) {
                teams.get(teamCode).get(player).calculate();
            }
        }


    }
}
