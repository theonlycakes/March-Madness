package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import static com.company.Main.teamNames;

public class toTeamCodes {
    public void toTeamCodes() throws FileNotFoundException {
        //Gets the location of the file
        File f = new File("Data/MTeamSpellings.csv");
        File teamCodeFile = new File(String.valueOf(f.getAbsoluteFile()));
        //String to store temp
        String storageString [];
        //Opens the file in a Scanner to read the data
        Scanner teams = new Scanner(teamCodeFile, "iso-8859-1");
        while (teams.hasNextLine()) {
            storageString = teams.nextLine().split(",");
            //Checks if makes any name and converts to the number
            if(storageString[0].equalsIgnoreCase(teamNames.get(0))) {
                teamNames.remove(0);
                teamNames.add(0,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(1))) {
                teamNames.remove(1);
                teamNames.add(1,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(2))) {
                teamNames.remove(2);
                teamNames.add(2,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(3))) {
                teamNames.remove(3);
                teamNames.add(3,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(4))) {
                teamNames.remove(4);
                teamNames.add(4,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(5))) {
                teamNames.remove(5);
                teamNames.add(5,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(6))) {
                teamNames.remove(6);
                teamNames.add(6,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(7))) {
                teamNames.remove(7);
                teamNames.add(7,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(8))) {
                teamNames.remove(8);
                teamNames.add(8,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(9))) {
                teamNames.remove(9);
                teamNames.add(9,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(10))) {
                teamNames.remove(10);
                teamNames.add(10,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(11))) {
                teamNames.remove(11);
                teamNames.add(11,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(12))) {
                teamNames.remove(12);
                teamNames.add(12,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(13))) {
                teamNames.remove(13);
                teamNames.add(13,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(14))) {
                teamNames.remove(14);
                teamNames.add(14,storageString[1]);
            } else if(storageString[0].equalsIgnoreCase(teamNames.get(15))) {
                teamNames.remove(15);
                teamNames.add(15,storageString[1]);
            }
        }
    }
}
