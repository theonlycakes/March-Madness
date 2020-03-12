package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.company.Main.teamNames;
import static com.company.playersToTeams.*;

public class dataReader extends Thread {
    //This reads the data from the events and adds it to each player
    //just some variables
    private String year;
    private Thread t;
    //sets the year for what file to read
    public dataReader(String fileYear) {
        year = fileYear;
    }
    //Code that runs of thread start
    public void run() {
        //System.out.println(year);

        //code need to change to work just some temp stuff

        //Gets the location of the file
        File f = new File("Data/" + year +".csv");
        File teamCodeFile = new File(String.valueOf(f.getAbsoluteFile()));
        //String to store temp
        String storageString [];
        //Opens the file in a Scanner to read the data
        Scanner fileRead = null;
        try {
            fileRead = new Scanner(teamCodeFile, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        //adds the data to the player objects
        while (fileRead.hasNextLine()) {
            storageString = fileRead.nextLine().split(",");
            //runs every team
            for (String teamCode: teamNames) {
                //runs for all the players in the team
                for (String player: playerNumbers.get(teamCode)) {
                    if (player.equalsIgnoreCase(storageString[11])) {
                        switch (storageString[12]) {
                            case "miss1":
                            case "miss2":
                            case "miss3":
                                teams.get(teamCode).get(player).addMiss();
                                break;
                            case "made1":
                                teams.get(teamCode).get(player).add1Point();
                                teams.get(teamCode).get(player).addHit();
                                break;
                            case "made2":
                                teams.get(teamCode).get(player).add2Point();
                                teams.get(teamCode).get(player).addHit();
                                break;
                            case "made3":
                                teams.get(teamCode).get(player).add3Point();
                                teams.get(teamCode).get(player).addHit();
                                break;
                            default:
                                break;

                        }
                    }
                }
            }
        }
        //Check that the thread has finished running
        latch.countDown();
    }
    //Starts the thread running
    public void start() {
        //Check if thread already exists
        if (t == null) {
            t = new Thread (this, year);
            t.start ();
        }
    }
}
