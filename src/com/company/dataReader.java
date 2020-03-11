package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static com.company.Main.teamNames;

public class dataReader extends Thread {
    //This reads the data from the events and adds it to each player
    //just some variables
    private String year;
    private Thread t;
    //sets the year for what file to read
    public dataReader(String fileYear) throws FileNotFoundException {
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
        Scanner teams = null;
        try {
            teams = new Scanner(teamCodeFile, "UTF-8");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


        System.out.println(teamNames.get(0));
        while (teams.hasNextLine()) {
            storageString = teams.nextLine().split(",");
            if(storageString[10].equalsIgnoreCase(teamNames.get(0))) {

            }

        }
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
