package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class toTeamCodes {
    public void toTeamCodes(ArrayList teamNames) throws FileNotFoundException {
        //Gets the location of the file
        File f = new File("Data/MTeamSpellings.csv");
        File teamCodeFile = new File(String.valueOf(f.getAbsoluteFile()));
        //String to store temp
        String storageString;
        //Opens the file in a Scanner to read the data
        Scanner teams = new Scanner(teamCodeFile, "iso-8859-1");
        while (teams.hasNextLine()) {
            storageString = teams.nextLine();
            System.out.println(storageString);

        }
    }
}
