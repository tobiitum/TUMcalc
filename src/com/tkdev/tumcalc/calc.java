package com.tkdev.tumcalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calc extends JFrame{

    static JFrame frame;
    private JPanel mainPanel;
    private JButton aboutBut;
    private JComboBox comboBox1;
    private JButton setButton;
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JTextField textField4;
    private JTextField textField5;
    private JTextField textField6;
    private JTextField textField7;
    private JButton calculateButton;
    String comboBoxListe[] = {"Informatik", "TUM-BWL","Aerospace"};

    public static void main() {
        frame = new calc("TUM Calculator");
        frame.setSize(900, 500);
        //icon = new ImageIcon("resources/netzwerk.png");
        frame.setResizable(false);
        frame.setMinimumSize(frame.getSize());
        frame.setLocationRelativeTo(null);
        //frame.setIconImage(icon.getImage());
        frame.setVisible(true);
    }

    public calc(String title) {
        super(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        aboutBut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                About.main();
            }
        });
    }



}
