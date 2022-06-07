package com.tkdev.tumcalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class About extends JFrame{
    static JFrame frame;
    static int time = 5;
    private JPanel aboutPanel;
    private JButton closeButton;
    public About(String title){
        super(title);
        this.setContentPane(aboutPanel);
        this.setAlwaysOnTop(true);
        this.setUndecorated(true);
        this.pack();


        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }

    public static void main() {

        frame = new About("About");
        frame.setSize(150,200);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setMinimumSize(frame.getSize());
        frame.setVisible(true);

        }

        public static void close(JFrame About){
            About.dispose();
        }
}
