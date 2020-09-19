package com.story.designpatterns.observer.v8;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TestFrame  extends Frame {

    public static void main(String[] args) {
        new TestFrame().launch();
    }

    public void launch(){
        Button button = new Button("press me");
        button.addActionListener(new MyActionListener());
        button.addActionListener(new MyActionListener1());
        this.add(button);
        this.pack();

        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowOpened(WindowEvent e) {
                //System.exit(0);
            }
        });
        this.setLocation(400,400);
        this.setVisible(true);
    }

    private class MyActionListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            ((Button)(e.getSource())).setLabel("press me again");
            System.out.println("button pressed");
        }
    }

    private class MyActionListener1 implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            System.out.println("button pressed 2");
        }
    }
}
