package com.company;

import java.awt.*;
import java.awt.event.*;

public class Main {
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
        f.setLayout(new GridLayout(1,1));
        //Labels for where to put the teams
        Label seed1L = new Label();
        seed1L.setText("Seed 1");
        Label seed2L = new Label();
        seed2L.setText("Seed 1");



        //Adding the stuff to the frame
        f.add(seed1L);
        f.add(seed2L);

        f.show();
    }
}
