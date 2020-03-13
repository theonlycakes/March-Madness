package com.company;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static com.company.Main.f;
import static com.company.Main.teamNames;

public class newGUI {
    public newGUI(){
        //GUI code kind of works
        f.removeAll();
        //size of the window
        f.setSize(800,400);
        //allows program to be closed
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
        //FlowLayout for stuff to work
        f.setLayout(new GridLayout(16,6));
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
        Label blank1 = new Label();
        Label blank2 = new Label();
        Label blank3 = new Label();
        Label blank4 = new Label();
        Label blank5 = new Label();
        Label blank6 = new Label();
        Label blank7 = new Label();
        Label blank8 = new Label();
        Label blank9 = new Label();
        Label blank10 = new Label();
        Label blank11 = new Label();
        Label blank12 = new Label();
        Label blank13 = new Label();
        Label blank14 = new Label();
        Label blank15 = new Label();
        Label blank16 = new Label();
        Label blank17 = new Label();
        Label blank18 = new Label();
        Label blank19 = new Label();
        Label blank20 = new Label();
        Label blank21 = new Label();
        Label blank22 = new Label();
        Label blank23 = new Label();
        Label blank24 = new Label();
        Label blank25 = new Label();
        Label blank26 = new Label();
        Label blank27 = new Label();
        Label blank28 = new Label();
        Label blank29 = new Label();
        Label blank30 = new Label();
        Label blank31 = new Label();
        Label blank32 = new Label();
        Label blank33 = new Label();
        Label blank34 = new Label();
        Label blank35 = new Label();
        Label blank36 = new Label();
        Label blank37 = new Label();
        Label blank38 = new Label();
        Label blank39 = new Label();
        Label blank40 = new Label();
        Label blank41 = new Label();
        Label blank42 = new Label();
        Label blank43 = new Label();
        Label blank44 = new Label();
        Label blank45 = new Label();
        Label blank46 = new Label();
        Label blank47 = new Label();
        Label blank48 = new Label();



        //TextFields for the team names to be input
        TextField seed1T = new TextField();
        seed1T.setText(teamNames.get(0));
        TextField seed2T = new TextField();
        seed2T.setText(teamNames.get(14));
        TextField seed3T = new TextField();
        seed3T.setText(teamNames.get(10));
        TextField seed4T = new TextField();
        seed4T.setText(teamNames.get(6));
        TextField seed5T = new TextField();
        seed5T.setText(teamNames.get(4));
        TextField seed6T = new TextField();
        seed6T.setText(teamNames.get(8));
        TextField seed7T = new TextField();
        seed7T.setText(teamNames.get(12));
        TextField seed8T = new TextField();
        seed8T.setText(teamNames.get(2));
        TextField seed9T = new TextField();
        seed9T.setText(teamNames.get(3));
        TextField seed10T = new TextField();
        seed10T.setText(teamNames.get(13));
        TextField seed11T = new TextField();
        seed11T.setText(teamNames.get(9));
        TextField seed12T = new TextField();
        seed12T.setText(teamNames.get(5));
        TextField seed13T = new TextField();
        seed13T.setText(teamNames.get(7));
        TextField seed14T = new TextField();
        seed14T.setText(teamNames.get(11));
        TextField seed15T = new TextField();
        seed15T.setText(teamNames.get(15));
        TextField seed16T = new TextField();
        seed16T.setText(teamNames.get(1));

        //TextFields for the winning teams
        //Round 1
        TextField winner1R1 = new TextField();
        winner1R1.setText(teamNames.get(16));
        TextField winner2R1 = new TextField();
        winner2R1.setText(teamNames.get(17));
        TextField winner3R1 = new TextField();
        winner3R1.setText(teamNames.get(18));
        TextField winner4R1 = new TextField();
        winner4R1.setText(teamNames.get(19));
        TextField winner5R1 = new TextField();
        winner5R1.setText(teamNames.get(20));
        TextField winner6R1 = new TextField();
        winner6R1.setText(teamNames.get(21));
        TextField winner7R1 = new TextField();
        winner7R1.setText(teamNames.get(22));
        TextField winner8R1 = new TextField();
        winner8R1.setText(teamNames.get(23));
        //Round 2
        TextField winner1R2 = new TextField();
        winner1R2.setText(teamNames.get(24));
        TextField winner2R2 = new TextField();
        winner2R2.setText(teamNames.get(25));
        TextField winner3R2 = new TextField();
        winner3R2.setText(teamNames.get(26));
        TextField winner4R2 = new TextField();
        winner4R2.setText(teamNames.get(27));
        //Round 3
        TextField winner1R3 = new TextField();
        winner1R3.setText(teamNames.get(28));
        TextField winner2R3 = new TextField();
        winner2R3.setText(teamNames.get(29));
        //Round 4
        TextField winner1R4 = new TextField();
        winner1R4.setText(teamNames.get(30));

        //Adding the stuff to the frame
        f.add(seed1L);
        f.add(seed1T);
        f.add(winner1R1);
        f.add(blank);
        f.add(blank1);
        f.add(blank2);

        f.add(seed16L);
        f.add(seed16T);
        f.add(blank3);
        f.add(winner1R2);
        f.add(blank4);
        f.add(blank5);

        f.add(seed8L);
        f.add(seed8T);
        f.add(winner2R1);
        f.add(blank6);
        f.add(blank7);
        f.add(blank8);

        f.add(seed9L);
        f.add(seed9T);
        f.add(blank9);
        f.add(blank10);
        f.add(winner1R3);
        f.add(blank11);

        f.add(seed5L);
        f.add(seed5T);
        f.add(winner3R1);
        f.add(blank12);
        f.add(blank13);
        f.add(blank14);

        f.add(seed12L);
        f.add(seed12T);
        f.add(blank15);
        f.add(winner2R2);
        f.add(blank16);
        f.add(blank17);

        f.add(seed4L);
        f.add(seed4T);
        f.add(winner4R1);
        f.add(blank18);
        f.add(blank19);
        f.add(blank20);

        f.add(seed13L);
        f.add(seed13T);
        f.add(blank21);
        f.add(blank22);
        f.add(blank23);
        f.add(winner1R4);

        f.add(seed6L);
        f.add(seed6T);
        f.add(winner5R1);
        f.add(blank24);
        f.add(blank25);
        f.add(blank26);

        f.add(seed11L);
        f.add(seed11T);
        f.add(blank27);
        f.add(winner3R2);
        f.add(blank28);
        f.add(blank29);

        f.add(seed3L);
        f.add(seed3T);
        f.add(winner6R1);
        f.add(blank30);
        f.add(blank31);
        f.add(blank32);

        f.add(seed14L);
        f.add(seed14T);
        f.add(blank33);
        f.add(blank34);
        f.add(winner2R3);
        f.add(blank35);

        f.add(seed7L);
        f.add(seed7T);
        f.add(winner7R1);
        f.add(blank36);
        f.add(blank37);
        f.add(blank38);

        f.add(seed10L);
        f.add(seed10T);
        f.add(blank39);
        f.add(winner4R2);
        f.add(blank40);
        f.add(blank41);

        f.add(seed2L);
        f.add(seed2T);
        f.add(winner8R1);
        f.add(blank42);
        f.add(blank43);
        f.add(blank44);

        f.add(seed15L);
        f.add(seed15T);
        f.add(blank45);
        f.add(blank46);
        f.add(blank47);
        f.add(blank48);

        f.setVisible(true);
    }
}
