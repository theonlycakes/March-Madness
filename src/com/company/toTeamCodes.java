package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

import static com.company.Main.teamNames;
import static com.company.playersToTeams.playerNumbers;
import static com.company.playersToTeams.teams;

public class toTeamCodes {
    public toTeamCodes() throws FileNotFoundException, InterruptedException {
        //Gets the location of the file
        File f = new File("Data/MTeamSpellings.csv");
        File teamCodeFile = new File(String.valueOf(f.getAbsoluteFile()));
        //String to store temp
        String storageString [];
        int indexLoc;
        //Opens the file in a Scanner to read the data
        Scanner teamsSearch = new Scanner(teamCodeFile, "iso-8859-1");
        while (teamsSearch.hasNextLine()) {
            storageString = teamsSearch.nextLine().split(",");
            //Checks if makes any name and converts to the number
            indexLoc = 0;
            for (String team: teamNames) {
                if (team.equalsIgnoreCase(storageString[0])) {
                    teamNames.set(indexLoc,storageString[1]);
                }
                indexLoc++;
            }


        }
        //Small start to performance increase
        teamsSearch.close();
        //Makes a HashMap for each team
        for (String teamAddHash: teamNames){
            teams.put(teamAddHash, new HashMap<>());
            playerNumbers.put(teamAddHash, new ArrayList<>());
        }
        //Executes code to add the players to the teams
        playersToTeams sendTeamCodes = new playersToTeams();
    }
}
