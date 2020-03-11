package com.company;

import java.awt.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class Main {
    //Makes arraylist to store the names
    public static ArrayList <String> teamNames = new ArrayList();
    public static void main(String[] args)  {

        //GUI code kind of works
        Frame f = new Frame();
        //size of the window
        f.setSize(400,400);
        //allows program to be closed
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //FlowLayout for stuff to work
        f.setLayout(new GridLayout(17,2));
        //Labels for where to put the teams
        Label seed1L = new Label();
        seed1L.setText("Seed 1");
        Label seed2L = new Label();
        seed2L.setText("Seed 2");
        Label seed3L = new Label();
        seed3L.setText("Seed 3");
        Label seed4L = new Label();
        seed4L.setText("Seed 4");
        Label seed5L = new Label();
        seed5L.setText("Seed 5");
        Label seed6L = new Label();
        seed6L.setText("Seed 6");
        Label seed7L = new Label();
        seed7L.setText("Seed 7");
        Label seed8L = new Label();
        seed8L.setText("Seed 8");
        Label seed9L = new Label();
        seed9L.setText("Seed 9");
        Label seed10L = new Label();
        seed10L.setText("Seed 10");
        Label seed11L = new Label();
        seed11L.setText("Seed 11");
        Label seed12L = new Label();
        seed12L.setText("Seed 12");
        Label seed13L = new Label();
        seed13L.setText("Seed 13");
        Label seed14L = new Label();
        seed14L.setText("Seed 14");
        Label seed15L = new Label();
        seed15L.setText("Seed 15");
        Label seed16L = new Label();
        seed16L.setText("Seed 16");
        //Blank label to add blank space
        Label blank = new Label();

        //TextFields for the team names to be input
        TextField seed1T = new TextField();
        TextField seed2T = new TextField();
        TextField seed3T = new TextField();
        TextField seed4T = new TextField();
        TextField seed5T = new TextField();
        TextField seed6T = new TextField();
        TextField seed7T = new TextField();
        TextField seed8T = new TextField();
        TextField seed9T = new TextField();
        TextField seed10T = new TextField();
        TextField seed11T = new TextField();
        TextField seed12T = new TextField();
        TextField seed13T = new TextField();
        TextField seed14T = new TextField();
        TextField seed15T = new TextField();
        TextField seed16T = new TextField();

        //Button to submit the Data
        Button submit = new Button();
        submit.setLabel("Submit");

        //Adding the stuff to the frame
        f.add(seed1L);
        f.add(seed1T);

        f.add(seed2L);
        f.add(seed2T);

        f.add(seed3L);
        f.add(seed3T);

        f.add(seed4L);
        f.add(seed4T);

        f.add(seed5L);
        f.add(seed5T);

        f.add(seed6L);
        f.add(seed6T);

        f.add(seed7L);
        f.add(seed7T);

        f.add(seed8L);
        f.add(seed8T);

        f.add(seed9L);
        f.add(seed9T);

        f.add(seed10L);
        f.add(seed10T);

        f.add(seed11L);
        f.add(seed11T);

        f.add(seed12L);
        f.add(seed12T);

        f.add(seed13L);
        f.add(seed13T);

        f.add(seed14L);
        f.add(seed14T);

        f.add(seed15L);
        f.add(seed15T);

        f.add(seed16L);
        f.add(seed16T);

        f.add(blank);
        f.add(submit);

        f.setVisible(true);
        //End of GUI elements for input



        //Get the submit button to record the team names
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                //gets the text from the Textfields and adds to array
                teamNames.add(0,seed1T.getText());
                teamNames.add(1,seed2T.getText());
                teamNames.add(2,seed3T.getText());
                teamNames.add(3,seed4T.getText());
                teamNames.add(4,seed5T.getText());
                teamNames.add(5,seed6T.getText());
                teamNames.add(6,seed7T.getText());
                teamNames.add(7,seed8T.getText());
                teamNames.add(8,seed9T.getText());
                teamNames.add(9,seed10T.getText());
                teamNames.add(10,seed11T.getText());
                teamNames.add(11,seed12T.getText());
                teamNames.add(12,seed13T.getText());
                teamNames.add(13,seed14T.getText());
                teamNames.add(14,seed15T.getText());
                teamNames.add(15,seed16T.getText());

                //Send the team names to become the codes
                toTeamCodes send = new toTeamCodes();
                try {
                    send.toTeamCodes();
                } catch (FileNotFoundException ex) {
                    ex.printStackTrace();
                }

            }
        });

    }
}
