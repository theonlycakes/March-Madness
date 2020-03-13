package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.company.Main.f;
import static com.company.Main.teamNames;

public class finalsGUI {
    public finalsGUI() {
        //GUI code kind of works
        f.removeAll();
        //size of the window
        f.setSize(500,200);
        //allows program to be closed
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //FlowLayout for stuff to work
        f.setLayout(new GridLayout(3,5));

        //Blank label to add blank space
        Label blank = new Label();
        Label blank1 = new Label();
        Label blank2 = new Label();
        Label blank3 = new Label();
        Label blank4 = new Label();
        Label blank5 = new Label();
        Label blank6 = new Label();
        Label blank7 = new Label();

        //TextFields for the team names to be input
        TextField user1 = new TextField();
        user1.setText(teamNames.get(0));
        TextField user2 = new TextField();
        user2.setText(teamNames.get(1));
        TextField user3 = new TextField();
        user3.setText(teamNames.get(2));
        TextField user4 = new TextField();
        user4.setText(teamNames.get(3));

        //TextFields for the winning teams
        TextField winL = new TextField();
        winL.setText(teamNames.get(4));
        TextField winR = new TextField();
        winR.setText(teamNames.get(5));
        TextField winner = new TextField();
        winner.setText(teamNames.get(6));

        //Adding the stuff to the frame
        f.add(user1);
        f.add(blank);
        f.add(blank1);
        f.add(blank2);
        f.add(user3);

        f.add(blank3);
        f.add(winL);
        f.add(winner);
        f.add(winR);
        f.add(blank4);

        f.add(user2);
        f.add(blank5);
        f.add(blank6);
        f.add(blank7);
        f.add(user4);

        f.setVisible(true);
    }
}
