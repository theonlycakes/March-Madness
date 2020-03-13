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
    public static CountDownLatch latchRound1 = new CountDownLatch(8);
    public static CountDownLatch latchRound2 = new CountDownLatch(4);
    public static CountDownLatch latchRound3 = new CountDownLatch(2);
    public static CountDownLatch latchRound4 = new CountDownLatch(1);
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
        if (teamNames.size() == 4) {
            teamWin2 g12 = new teamWin2(teamNames.get(0),teamNames.get(1));
            g12.start();
            teamWin2 g22 = new teamWin2(teamNames.get(2),teamNames.get(3));
            g22.start();
            latchRound3.await();
            teamNames.add(g12.winner);
            teamNames.add(g22.winner);
            teamWin3 g13 = new teamWin3(teamNames.get(4),teamNames.get(5));
            g13.start();
            latchRound4.await();
            teamNames.add(g13.winner);

            //Gets the location of the file
            File f1 = new File("Data/MTeamSpellings.csv");
            File teamCodeFile1 = new File(String.valueOf(f1.getAbsoluteFile()));
            //String to store temp
            String storageString1 [];
            int indexLoc;
            //Opens the file in a Scanner to read the data
            Scanner teamsSearch = new Scanner(teamCodeFile1, "iso-8859-1");
            while (teamsSearch.hasNextLine()) {
                storageString1 = teamsSearch.nextLine().split(",");
                //Checks if makes any name and converts to the number
                indexLoc = 0;
                for (String team: teamNames) {
                    if (team.equalsIgnoreCase(storageString1[1])) {
                        teamNames.set(indexLoc,storageString1[0]);
                    }
                    indexLoc++;
                }
            }

            finalsGUI finals = new finalsGUI();
        } else {
            //Run the calculations on who would win
            teamWin g1 = new teamWin(teamNames.get(0),teamNames.get(1));
            g1.start();
            teamWin g2 = new teamWin(teamNames.get(2),teamNames.get(3));
            g2.start();
            teamWin g3 = new teamWin(teamNames.get(4),teamNames.get(5));
            g3.start();
            teamWin g4 = new teamWin(teamNames.get(6),teamNames.get(7));
            g4.start();
            teamWin g5 = new teamWin(teamNames.get(8),teamNames.get(9));
            g5.start();
            teamWin g6 = new teamWin(teamNames.get(10),teamNames.get(11));
            g6.start();
            teamWin g7 = new teamWin(teamNames.get(12),teamNames.get(13));
            g7.start();
            teamWin g8 = new teamWin(teamNames.get(14),teamNames.get(15));
            g8.start();
            latchRound1.await();
            teamNames.add(g1.winner);
            teamNames.add(g2.winner);
            teamNames.add(g3.winner);
            teamNames.add(g4.winner);
            teamNames.add(g5.winner);
            teamNames.add(g6.winner);
            teamNames.add(g7.winner);
            teamNames.add(g8.winner);
            teamWin1 g11 = new teamWin1(teamNames.get(16),teamNames.get(17));
            g11.start();
            teamWin1 g21 = new teamWin1(teamNames.get(18),teamNames.get(19));
            g21.start();
            teamWin1 g31 = new teamWin1(teamNames.get(20),teamNames.get(21));
            g31.start();
            teamWin1 g41 = new teamWin1(teamNames.get(22),teamNames.get(23));
            g41.start();
            latchRound2.await();
            teamNames.add(g11.winner);
            teamNames.add(g21.winner);
            teamNames.add(g31.winner);
            teamNames.add(g41.winner);
            teamWin2 g12 = new teamWin2(teamNames.get(24),teamNames.get(25));
            g12.start();
            teamWin2 g22 = new teamWin2(teamNames.get(26),teamNames.get(27));
            g22.start();
            latchRound3.await();
            teamNames.add(g12.winner);
            teamNames.add(g22.winner);
            teamWin3 g13 = new teamWin3(teamNames.get(28),teamNames.get(29));
            g13.start();
            latchRound4.await();
            teamNames.add(g13.winner);

            //Gets the location of the file
            File f1 = new File("Data/MTeamSpellings.csv");
            File teamCodeFile1 = new File(String.valueOf(f1.getAbsoluteFile()));
            //String to store temp
            String storageString1 [];
            int indexLoc;
            //Opens the file in a Scanner to read the data
            Scanner teamsSearch = new Scanner(teamCodeFile1, "iso-8859-1");
            while (teamsSearch.hasNextLine()) {
                storageString1 = teamsSearch.nextLine().split(",");
                //Checks if makes any name and converts to the number
                indexLoc = 0;
                for (String team: teamNames) {
                    if (team.equalsIgnoreCase(storageString1[1])) {
                        teamNames.set(indexLoc,storageString1[0]);
                    }
                    indexLoc++;
                }
            }
            newGUI gui = new newGUI();
        }

    }
}
