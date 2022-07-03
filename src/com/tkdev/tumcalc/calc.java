package com.tkdev.tumcalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class calc extends JFrame{

    static JFrame frame;
    private JPanel mainPanel;
    private JButton aboutBut;
    private JComboBox comboBox1;
    private JButton setButton;
    private JTextField textField1;
    private JTextField mathe1;
    private JTextField mathe2;
    private JTextField mathe4;
    private JTextField mathfi;
    private JTextField mathe3;
    private JTextField abi;
    private JButton calculateButton;
    private JLabel direct;
    private JLabel second;
    private JLabel mathe;
    private JLabel deutsch;
    private JLabel englisch;
    private JLabel info;
    private JLabel bio;
    private JLabel physik;
    private JLabel chemie;
    private JLabel mathca;
    private JLabel deutschca;
    private JLabel englischca;
    private JLabel infoca;
    private JLabel bioca;
    private JLabel physikca;
    private JLabel chemieca;
    private JLabel kunstca;
    private JTextField deutschfi;
    private JTextField englischfi;
    private JTextField infofi;
    private JTextField biofi;
    private JTextField physikfi;
    private JTextField chemiefi;
    private JTextField kunstfi;
    private JTextField deutsch1;
    private JTextField eng1;
    private JTextField info1;
    private JTextField bio1;
    private JTextField physik1;
    private JTextField chemie1;
    private JTextField kunst1;
    private JButton clearButton;
    private JTextField deutsch2;
    private JTextField deutsch3;
    private JTextField deutsch4;
    private JTextField eng2;
    private JTextField eng3;
    private JTextField eng4;
    private JTextField info2;
    private JTextField info3;
    private JTextField info4;
    private JTextField bio2;
    private JTextField bio3;
    private JTextField bio4;
    private JTextField physik2;
    private JTextField physik3;
    private JTextField physik4;
    private JTextField chemie2;
    private JTextField chemie3;
    private JTextField chemie4;
    private JTextField kunst2;
    private JTextField kunst3;
    private JTextField kunst4;
    String comboBoxListe[] = {"Informatik", "TUM-BWL","Aerospace"};

    public static void main() {
        frame = new calc("TUM Calculator");
        frame.setSize(950, 500);
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
        //Action Listener for the Set Button
        setButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (comboBox1.getSelectedItem() == "Aerospace"){
                    direct.setText("78");
                    second.setText("70");
                    mathca.setText("3x");
                    mathfi.setEnabled(true);
                    deutschca.setText("-");
                    deutsch1.setEnabled(false);
                    deutsch2.setEnabled(false);
                    deutsch3.setEnabled(false);
                    deutsch4.setEnabled(false);
                    deutschfi.setEnabled(false);
                    englischca.setText("1x");
                    englischfi.setEnabled(true);
                    infoca.setText("2x");
                    info1.setEnabled(true);
                    info2.setEnabled(true);
                    info3.setEnabled(true);
                    info4.setEnabled(true);
                    infofi.setEnabled(true);
                    bioca.setText("or 2x");
                    bio1.setEnabled(true);
                    bio2.setEnabled(true);
                    bio3.setEnabled(true);
                    bio4.setEnabled(true);
                    biofi.setEnabled(true);
                    physikca.setText("or 2x");
                    physik1.setEnabled(true);
                    physik2.setEnabled(true);
                    physik3.setEnabled(true);
                    physik4.setEnabled(true);
                    physikfi.setEnabled(true);
                    chemieca.setText("or 2x");
                    chemie1.setEnabled(true);
                    chemie2.setEnabled(true);
                    chemie3.setEnabled(true);
                    chemie4.setEnabled(true);
                    chemieca.setEnabled(true);
                    kunstca.setText("-");
                    kunst1.setEnabled(false);
                    kunst2.setEnabled(false);
                    kunst3.setEnabled(false);
                    kunst4.setEnabled(false);
                    kunstfi.setEnabled(false);
                }
                if (comboBox1.getSelectedItem() == "Architektur"){
                    direct.setText("75");
                    second.setText("59");
                    mathca.setText("2x");
                    mathfi.setEnabled(true);
                    deutschca.setText("1x");
                    deutsch1.setEnabled(true);
                    deutsch2.setEnabled(true);
                    deutsch3.setEnabled(true);
                    deutsch4.setEnabled(true);
                    deutschfi.setEnabled(true);
                    englischca.setText("1x");
                    englischfi.setEnabled(true);
                    infoca.setText("-");
                    info1.setEnabled(false);
                    info2.setEnabled(false);
                    info3.setEnabled(false);
                    info4.setEnabled(false);
                    infofi.setEnabled(false);
                    bioca.setText("-");
                    bio1.setEnabled(false);
                    bio2.setEnabled(false);
                    bio3.setEnabled(false);
                    bio4.setEnabled(false);
                    biofi.setEnabled(false);
                    physikca.setText("-");
                    physik1.setEnabled(false);
                    physik2.setEnabled(false);
                    physik3.setEnabled(false);
                    physik4.setEnabled(false);
                    physikfi.setEnabled(false);
                    chemieca.setText("-");
                    chemie1.setEnabled(false);
                    chemie2.setEnabled(false);
                    chemie3.setEnabled(false);
                    chemie4.setEnabled(false);
                    chemiefi.setEnabled(false);
                    kunstca.setText("3x");
                    kunst1.setEnabled(true);
                    kunst2.setEnabled(true);
                    kunst3.setEnabled(true);
                    kunst4.setEnabled(true);
                    kunstfi.setEnabled(true);
                }
                if (comboBox1.getSelectedItem() == "Informatik"){
                    direct.setText("78");
                    second.setText("72");
                    mathca.setText("3x");
                    mathfi.setEnabled(true);
                    deutschca.setText("1x");
                    deutsch1.setEnabled(true);
                    deutsch2.setEnabled(true);
                    deutsch3.setEnabled(true);
                    deutsch4.setEnabled(true);
                    deutschfi.setEnabled(true);
                    englischca.setText("1x");
                    englischfi.setEnabled(true);
                    infoca.setText("2x");
                    info1.setEnabled(true);
                    info2.setEnabled(true);
                    info3.setEnabled(true);
                    info4.setEnabled(true);
                    infofi.setEnabled(true);
                    bioca.setText("-");
                    bio1.setEnabled(false);
                    bio2.setEnabled(false);
                    bio3.setEnabled(false);
                    bio4.setEnabled(false);
                    biofi.setEnabled(false);
                    physikca.setText("-");
                    physik1.setEnabled(false);
                    physik2.setEnabled(false);
                    physik3.setEnabled(false);
                    physik4.setEnabled(false);
                    physikfi.setEnabled(false);
                    chemieca.setText("-");
                    chemie1.setEnabled(false);
                    chemie2.setEnabled(false);
                    chemie3.setEnabled(false);
                    chemie4.setEnabled(false);
                    chemiefi.setEnabled(false);
                    kunstca.setText("-");
                    kunst1.setEnabled(false);
                    kunst2.setEnabled(false);
                    kunst3.setEnabled(false);
                    kunst4.setEnabled(false);
                    kunstfi.setEnabled(true);
                }
                if (comboBox1.getSelectedItem() == "TUM-BWL"){
                    direct.setText("88");
                    second.setText("70");
                    mathca.setText("2x");
                    mathfi.setEnabled(true);
                    deutschca.setText("1x");
                    deutsch1.setEnabled(true);
                    deutsch2.setEnabled(true);
                    deutsch3.setEnabled(true);
                    deutsch4.setEnabled(true);
                    deutschfi.setEnabled(true);
                    englischca.setText("1x");
                    englischfi.setEnabled(true);
                    infoca.setText("2x");
                    info1.setEnabled(true);
                    info2.setEnabled(true);
                    info3.setEnabled(true);
                    info4.setEnabled(true);
                    infofi.setEnabled(true);
                    bioca.setText("or 2x");
                    bio1.setEnabled(true);
                    bio2.setEnabled(true);
                    bio3.setEnabled(true);
                    bio4.setEnabled(true);
                    biofi.setEnabled(true);
                    physikca.setText("or 2x");
                    physik1.setEnabled(true);
                    physik2.setEnabled(true);
                    physik3.setEnabled(true);
                    physik4.setEnabled(true);
                    physikfi.setEnabled(true);
                    chemieca.setText("or 2x");
                    chemie1.setEnabled(true);
                    chemie2.setEnabled(true);
                    chemie3.setEnabled(true);
                    chemie4.setEnabled(true);
                    chemiefi.setEnabled(true);
                    kunstca.setText("-");
                    kunst1.setEnabled(false);
                    kunst2.setEnabled(false);
                    kunst3.setEnabled(false);
                    kunst4.setEnabled(false);
                    kunstfi.setEnabled(true);
                }
                clearButton.doClick();
            }
        });

        abi.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (abi.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        mathe1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (mathe1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }            }
        });
        deutsch1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (deutsch1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        eng1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (eng1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        info1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (info1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        bio1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (bio1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        chemie1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (chemie1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        kunst1.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                char c = e.getKeyChar();
                if (((c < '0') || (c > '9')) && (c != KeyEvent.VK_BACK_SPACE)) {
                    e.consume();

                }
                if (kunst1.getText().trim().length() == 2 || e.getKeyChar() == java.awt.event.KeyEvent.VK_BACK_SPACE) {
                    e.consume();
                }
            }
        });
        clearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                abi.setText("");
                mathe1.setText("");
                mathe2.setText("");
                mathe3.setText("");
                mathe4.setText("");
                mathfi.setText("");
                deutsch1.setText("");
                deutsch2.setText("");
                deutsch3.setText("");
                deutsch4.setText("");
                deutschfi.setText("");
                eng1.setText("");
                eng2.setText("");
                eng3.setText("");
                eng4.setText("");
                englischfi.setText("");
                info1.setText("");
                info2.setText("");
                info3.setText("");
                info4.setText("");
                infofi.setText("");
                bio1.setText("");
                bio2.setText("");
                bio3.setText("");
                bio4.setText("");
                biofi.setText("");
                physik1.setText("");
                physik2.setText("");
                physik3.setText("");
                physik4.setText("");
                physikfi.setText("");
                chemie1.setText("");
                chemie2.setText("");
                chemie3.setText("");
                chemie4.setText("");
                chemiefi.setText("");
                kunst1.setText("");
                kunst2.setText("");
                kunst3.setText("");
                kunst4.setText("");
                kunstfi.setText("");
            }
        });
    }



}
