package com.tkdev.tumcalc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.net.URI;

public class calc extends JFrame{

    static JFrame frame;
    private JPanel mainPanel;
    private JButton aboutBut;
    private JComboBox comboBox1;
    private JButton setButton;
    private JTextField resulttext;
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
    private JButton helpButton;
    private JLabel ending;
    private JComboBox comboBox2;
    private JLabel abitext;
    private JTextField mappe;
    private JLabel inst;
    String comboBoxListe[] = {"Informatik", "TUM-BWL","Aerospace"};

    public static void main() {
        frame = new calc("TUM Calculator");
        frame.setSize(950, 550);
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
        setButton.doClick();

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
                    mappe.setEditable(false);
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
                    mappe.setEditable(true);
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
                    mappe.setEditable(false);
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
                    mappe.setEditable(false);
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
                mappe.setText("");
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
        comboBox1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setButton.doClick();
                inst.setText("");
                comboBox1.removeItem("set");
            }
        });
        helpButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Desktop desktop = java.awt.Desktop.getDesktop();
                    URI oURL = new URI("https://tbkl.dev/index.php/projects/tumcalc");
                    desktop.browse(oURL);
                } catch (Exception f) {
                    f.printStackTrace();
                }
            }
        });
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (!(abitext.getText() == "Punkte")){
                    int abinote = 10+6*Integer.parseInt(abitext.getText());
                if (comboBox1.getSelectedItem() == "Aerospace"){
                    if (mathfi.getText() == ""){mathfi.setText(String.valueOf(Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText())/5));}
                    int mathe0 = 10+6*((Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText()) + Integer.parseInt(mathfi.getText()))/5);
                    int mathe = mathe0 * 3;
                    if (englischfi.getText() == ""){englischfi.setText(String.valueOf(Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText())/5));}
                    int englisch = 10+6*((Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText()) + Integer.parseInt(englischfi.getText()))/5);
                    if (!(info1.getText() =="")){
                        if (infofi.getText() == ""){infofi.setText(String.valueOf(Integer.parseInt(info1.getText()) + Integer.parseInt(info2.getText()) + Integer.parseInt(info3.getText()) + Integer.parseInt(info4.getText())/5));}
                        int informatik01 = 10+6*((Integer.parseInt(info1.getText()) + Integer.parseInt(info2.getText()) + Integer.parseInt(info3.getText()) + Integer.parseInt(info4.getText()) + Integer.parseInt(infofi.getText()))/5);
                        int informatik02 = informatik01*2;
                        int result0 = (mathe+englisch+informatik02)/6;
                        int result = (int) (0.5*abinote+0.5*result0);
                        resulttext.setText(String.valueOf(result));
                        if (result >= Integer.parseInt(direct.getText())){
                            ending.setText("Zugelassen");
                            ending.setForeground(Color.GREEN);
                        }
                        if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                            ending.setText("Zweite Stufe");
                            ending.setForeground(Color.YELLOW);
                        }
                        if (result < Integer.parseInt(second.getText())) {
                            ending.setText("Abgelehnt");
                            ending.setForeground(Color.RED);
                        }
                    }
                    else{ if (!(bio1.getText() =="")){
                        if (biofi.getText() == ""){biofi.setText(String.valueOf(Integer.parseInt(bio1.getText()) + Integer.parseInt(bio2.getText()) + Integer.parseInt(bio3.getText()) + Integer.parseInt(bio4.getText())/5));}
                        int bio0 = 10+6*((Integer.parseInt(bio1.getText()) + Integer.parseInt(bio2.getText()) + Integer.parseInt(bio3.getText()) + Integer.parseInt(bio4.getText()) + Integer.parseInt(biofi.getText()))/5);
                        int bio = bio0*2;
                        int result0 = (mathe+englisch+bio)/6;
                        int result = (int) (0.5*abinote+0.5*result0);
                        resulttext.setText(String.valueOf(result));
                        if (result >= Integer.parseInt(direct.getText())){
                            ending.setText("Zugelassen");
                            ending.setForeground(Color.GREEN);
                        }
                        if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                            ending.setText("Zweite Stufe");
                            ending.setForeground(Color.YELLOW);
                        }
                        if (result < Integer.parseInt(second.getText())) {
                            ending.setText("Abgelehnt");
                            ending.setForeground(Color.RED);
                        }
                    }else {
                        if (!(chemie1.getText() == "")) {
                            if (chemiefi.getText() == ""){chemie1.setText(String.valueOf(Integer.parseInt(chemie1.getText()) + Integer.parseInt(chemie2.getText()) + Integer.parseInt(chemie3.getText()) + Integer.parseInt(chemie4.getText())/5));}
                            int chemie0 = 10+6*((Integer.parseInt(chemie1.getText()) + Integer.parseInt(chemie2.getText()) + Integer.parseInt(chemie3.getText()) + Integer.parseInt(chemie4.getText()) + Integer.parseInt(chemiefi.getText()))/5);
                            int chemie = chemie0 * 2;
                            int result0 = (mathe+englisch+chemie)/6;
                            int result = (int) (0.5*abinote+0.5*result0);
                            resulttext.setText(String.valueOf(result));
                            if (result >= Integer.parseInt(direct.getText())){
                                ending.setText("Zugelassen");
                                ending.setForeground(Color.GREEN);
                            }
                            if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                                ending.setText("Zweite Stufe");
                                ending.setForeground(Color.YELLOW);
                            }
                            if (result < Integer.parseInt(second.getText())) {
                                ending.setText("Abgelehnt");
                                ending.setForeground(Color.RED);
                            }
                        } else {
                            if (!(physik1.getText() == "")) {
                                if (physikfi.getText() == ""){physikfi.setText(String.valueOf(Integer.parseInt(physik1.getText()) + Integer.parseInt(physik2.getText()) + Integer.parseInt(physik3.getText()) + Integer.parseInt(physik4.getText())/5));}
                                int physik0 = 10+6*((Integer.parseInt(physik1.getText()) + Integer.parseInt(physik2.getText()) + Integer.parseInt(physik3.getText()) + Integer.parseInt(physik4.getText()) + Integer.parseInt(physikfi.getText()))/5);
                                int physik = physik0 * 2;
                                int result0 = (mathe+englisch+physik)/6;
                                int result = (int) (0.5*abinote+0.5*result0);
                                resulttext.setText(String.valueOf(result));
                                if (result >= Integer.parseInt(direct.getText())){
                                    ending.setText("Zugelassen");
                                    ending.setForeground(Color.GREEN);
                                }
                                if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                                    ending.setText("Zweite Stufe");
                                    ending.setForeground(Color.YELLOW);
                                }
                                if (result < Integer.parseInt(second.getText())) {
                                    ending.setText("Abgelehnt");
                                    ending.setForeground(Color.RED);
                                }
                            }
                        }
                    }}


                }
                if (comboBox1.getSelectedItem() == "Architektur") {
                    if (!(mappe.getText() == "")) {
                        if (mathfi.getText() == ""){mathfi.setText(String.valueOf(Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText())/5));}
                        int mathe0 = 10 + 6 * ((Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText()) + Integer.parseInt(mathfi.getText())) / 5);
                        int mathe = mathe0 * 2;
                        if (englischfi.getText() == ""){englischfi.setText(String.valueOf(Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText())/5));}
                        int englisch = 10 + 6 * ((Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText()) + Integer.parseInt(englischfi.getText())) / 5);
                        int deutsch = 10 + 6 * ((Integer.parseInt(deutsch1.getText()) + Integer.parseInt(deutsch2.getText()) + Integer.parseInt(deutsch3.getText()) + Integer.parseInt(deutschfi.getText()) + Integer.parseInt(deutsch4.getText())) / 5);
                        if (kunstfi.getText() == ""){kunstfi.setText(String.valueOf(Integer.parseInt(kunst1.getText()) + Integer.parseInt(kunst2.getText()) + Integer.parseInt(kunst3.getText()) + Integer.parseInt(kunst4.getText())/5));}
                        int kunst0 = 10 + 6 * ((Integer.parseInt(kunst1.getText()) + Integer.parseInt(kunst2.getText()) + Integer.parseInt(kunst3.getText()) + Integer.parseInt(kunst4.getText()) + Integer.parseInt(kunstfi.getText())) / 5);
                        int kunst = kunst0 * 3;
                        int result0 = (mathe + englisch + deutsch + kunst) / 7;
                        int result = (int) (0.55 * abinote + 0.25 * result0 + 0.2 * Integer.parseInt(mappe.getText()));
                        resulttext.setText(String.valueOf(result));
                        if (result >= Integer.parseInt(direct.getText())) {
                            ending.setText("Zugelassen");
                            ending.setForeground(Color.GREEN);
                        }
                        if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())) {
                            ending.setText("Zweite Stufe");
                            ending.setForeground(Color.YELLOW);
                        }
                        if (result < Integer.parseInt(second.getText())) {
                            ending.setText("Abgelehnt");
                            ending.setForeground(Color.RED);
                        }
                    }
                    else{
                        JOptionPane.showMessageDialog(frame,
                                "Bitte lege die (vorraussichtlichte) Note für die Mappe fest!",
                                "Warning",
                                JOptionPane.WARNING_MESSAGE);
                    }
                }
                    if (comboBox1.getSelectedItem() == "Informatik") {
                        if (mathfi.getText() == ""){mathfi.setText(String.valueOf(Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText())/5));}
                        int mathe0 = 10+6*((Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText()) + Integer.parseInt(mathfi.getText()))/5);
                        int mathe = mathe0 * 3;
                        if (englischfi.getText() == ""){englischfi.setText(String.valueOf(Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText())/5));}
                        int englisch = 10+6*((Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText()) + Integer.parseInt(englischfi.getText()))/5);
                        int deutsch = 10+6*((Integer.parseInt(deutsch1.getText()) + Integer.parseInt(deutsch2.getText()) + Integer.parseInt(deutsch3.getText()) + Integer.parseInt(deutschfi.getText()) + Integer.parseInt(deutsch4.getText()))/5);
                        if (infofi.getText() == ""){infofi.setText(String.valueOf(Integer.parseInt(info1.getText()) + Integer.parseInt(info2.getText()) + Integer.parseInt(info3.getText()) + Integer.parseInt(info4.getText())/5));}
                        int informatik01 = 10+6*((Integer.parseInt(info1.getText()) + Integer.parseInt(info2.getText()) + Integer.parseInt(info3.getText()) + Integer.parseInt(info4.getText()) + Integer.parseInt(infofi.getText()))/5);
                        int informatik02 = informatik01*2;
                        int result0 = (mathe+englisch+deutsch+informatik02)/7;
                        int result = (int) (0.65*abinote+0.35*result0);
                        resulttext.setText(String.valueOf(result));
                        if (result >= Integer.parseInt(direct.getText())){
                            ending.setText("Zugelassen");
                            ending.setForeground(Color.GREEN);
                        }
                        if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                            ending.setText("Zweite Stufe");
                            ending.setForeground(Color.YELLOW);
                        }
                        if (result < Integer.parseInt(second.getText())) {
                            ending.setText("Abgelehnt");
                            ending.setForeground(Color.RED);
                        }
                    }
                    if (comboBox1.getSelectedItem() == "TUM-BWL"){
                        if (mathfi.getText() == ""){mathfi.setText(String.valueOf(Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText())/5));}
                        int mathe0 = 10+6*((Integer.parseInt(mathe1.getText()) + Integer.parseInt(mathe2.getText()) + Integer.parseInt(mathe3.getText()) + Integer.parseInt(mathe4.getText()) + Integer.parseInt(mathfi.getText()))/5);
                        int mathe = mathe0 * 2;
                        if (englischfi.getText() == ""){englischfi.setText(String.valueOf(Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText())/5));}
                        int englisch = 10+6*((Integer.parseInt(eng1.getText()) + Integer.parseInt(eng2.getText()) + Integer.parseInt(eng3.getText()) + Integer.parseInt(eng4.getText()) + Integer.parseInt(englischfi.getText()))/5);
                        int deutsch = 10+6*((Integer.parseInt(deutsch1.getText()) + Integer.parseInt(deutsch2.getText()) + Integer.parseInt(deutsch3.getText()) + Integer.parseInt(deutschfi.getText()) + Integer.parseInt(deutsch4.getText()))/5);
                        if (!(info1.getText() =="")){
                            if (infofi.getText() == ""){infofi.setText(String.valueOf(Integer.parseInt(info1.getText()) + Integer.parseInt(info2.getText()) + Integer.parseInt(info3.getText()) + Integer.parseInt(info4.getText())/5));}
                            int informatik01 = 10+6*((Integer.parseInt(info1.getText()) + Integer.parseInt(info2.getText()) + Integer.parseInt(info3.getText()) + Integer.parseInt(info4.getText()) + Integer.parseInt(infofi.getText()))/5);
                            int informatik02 = informatik01*2;
                            int result0 = (mathe+englisch+deutsch+informatik02)/6;
                            int result = (int) (0.65*abinote+0.35*result0);
                            resulttext.setText(String.valueOf(result));
                            if (result >= Integer.parseInt(direct.getText())){
                                ending.setText("Zugelassen");
                                ending.setForeground(Color.GREEN);
                            }
                            if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                                ending.setText("Zweite Stufe");
                                ending.setForeground(Color.YELLOW);
                            }
                            if (result < Integer.parseInt(second.getText())) {
                                ending.setText("Abgelehnt");
                                ending.setForeground(Color.RED);
                            }
                        }
                        else{ if (!(bio1.getText() =="")){
                            if (biofi.getText() == ""){biofi.setText(String.valueOf(Integer.parseInt(bio1.getText()) + Integer.parseInt(bio2.getText()) + Integer.parseInt(bio3.getText()) + Integer.parseInt(bio4.getText())/5));}
                            int bio0 = 10+6*((Integer.parseInt(bio1.getText()) + Integer.parseInt(bio2.getText()) + Integer.parseInt(bio3.getText()) + Integer.parseInt(bio4.getText()) + Integer.parseInt(biofi.getText()))/5);
                            int bio = bio0*2;
                            int result0 = (mathe+englisch+deutsch+bio)/6;
                            int result = (int) (0.65*abinote+0.35*result0);
                            resulttext.setText(String.valueOf(result));
                            if (result >= Integer.parseInt(direct.getText())){
                                ending.setText("Zugelassen");
                                ending.setForeground(Color.GREEN);
                            }
                            if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                                ending.setText("Zweite Stufe");
                                ending.setForeground(Color.YELLOW);
                            }
                            if (result < Integer.parseInt(second.getText())) {
                                ending.setText("Abgelehnt");
                                ending.setForeground(Color.RED);
                            }
                        }else {
                            if (!(chemie1.getText() == "")) {
                                if (chemiefi.getText() == ""){chemie1.setText(String.valueOf(Integer.parseInt(chemie1.getText()) + Integer.parseInt(chemie2.getText()) + Integer.parseInt(chemie3.getText()) + Integer.parseInt(chemie4.getText())/5));}
                                int chemie0 = 10+6*((Integer.parseInt(chemie1.getText()) + Integer.parseInt(chemie2.getText()) + Integer.parseInt(chemie3.getText()) + Integer.parseInt(chemie4.getText()) + Integer.parseInt(chemiefi.getText()))/5);
                                int chemie = chemie0 * 2;
                                int result0 = (mathe+englisch+deutsch+chemie)/6;
                                int result = (int) (0.65*abinote+0.35*result0);
                                resulttext.setText(String.valueOf(result));
                                if (result >= Integer.parseInt(direct.getText())){
                                    ending.setText("Zugelassen");
                                    ending.setForeground(Color.GREEN);
                                }
                                if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                                    ending.setText("Zweite Stufe");
                                    ending.setForeground(Color.YELLOW);
                                }
                                if (result < Integer.parseInt(second.getText())) {
                                    ending.setText("Abgelehnt");
                                    ending.setForeground(Color.RED);
                                }
                            } else {
                                if (!(physik1.getText() == "")) {
                                    if (physikfi.getText() == ""){physikfi.setText(String.valueOf(Integer.parseInt(physik1.getText()) + Integer.parseInt(physik2.getText()) + Integer.parseInt(physik3.getText()) + Integer.parseInt(physik4.getText())/5));}
                                    int physik0 = 10+6*((Integer.parseInt(physik1.getText()) + Integer.parseInt(physik2.getText()) + Integer.parseInt(physik3.getText()) + Integer.parseInt(physik4.getText()) + Integer.parseInt(physikfi.getText()))/5);
                                    int physik = physik0 * 2;
                                    int result0 = (mathe+englisch+deutsch+physik)/6;
                                    int result = (int) (0.65*abinote+0.35*result0);
                                    resulttext.setText(String.valueOf(result));
                                    if (result >= Integer.parseInt(direct.getText())){
                                        ending.setText("Zugelassen");
                                        ending.setForeground(Color.GREEN);
                                    }
                                    if (Integer.parseInt(direct.getText()) > result && result >= Integer.parseInt(second.getText())){
                                        ending.setText("Zweite Stufe");
                                        ending.setForeground(Color.YELLOW);
                                    }
                                    if (result < Integer.parseInt(second.getText())) {
                                        ending.setText("Abgelehnt");
                                        ending.setForeground(Color.RED);
                                    }
                                }
                            }
                        }}

                    }
            }else{
                    JOptionPane.showMessageDialog(frame,
                            "Bitte lege die Abitur Note fest!",
                            "Warning",
                            JOptionPane.WARNING_MESSAGE);
                }
            }});


        comboBox2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox2.removeItem("set");

                if (comboBox2.getSelectedItem() == "1,0" || comboBox2.getSelectedItem() == "1,1"){
                    abitext.setText("15");
                }
                if (comboBox2.getSelectedItem() == "1,2" || comboBox2.getSelectedItem() == "1,3" || comboBox2.getSelectedItem() == "1,4" || comboBox2.getSelectedItem() == "1,5"){
                    abitext.setText("14");
                }
                if (comboBox2.getSelectedItem() == "1,6" || comboBox2.getSelectedItem() == "1,7" || comboBox2.getSelectedItem() == "1,8"){
                    abitext.setText("13");
                }
                if (comboBox2.getSelectedItem() == "1,9" || comboBox2.getSelectedItem() == "2,0" || comboBox2.getSelectedItem() == "2,1"){
                    abitext.setText("12");
                }
                if (comboBox2.getSelectedItem() == "2,2" || comboBox2.getSelectedItem() == "2,3" || comboBox2.getSelectedItem() == "2,4" || comboBox2.getSelectedItem() == "2,5"){
                    abitext.setText("11");
                }
                if (comboBox2.getSelectedItem() == "2,6" || comboBox2.getSelectedItem() == "2,7" || comboBox2.getSelectedItem() == "2,8"){
                    abitext.setText("10");
                }
                if (comboBox2.getSelectedItem() == "2,9" || comboBox2.getSelectedItem() == "3,0" || comboBox2.getSelectedItem() == "3,1"){
                    abitext.setText("9");
                }
                if (comboBox2.getSelectedItem() == "3,2" || comboBox2.getSelectedItem() == "3,3" || comboBox2.getSelectedItem() == "3,4" || comboBox2.getSelectedItem() == "3,5"){
                    abitext.setText("8");
                }
                if (comboBox2.getSelectedItem() == "3,6" || comboBox2.getSelectedItem() == "3,7" || comboBox2.getSelectedItem() == "3,8") {
                    abitext.setText("7");
                }
                if (comboBox2.getSelectedItem() == "3,9" || comboBox2.getSelectedItem() == "4,0" || comboBox2.getSelectedItem() == "4,1") {
                    abitext.setText("6");
                }
                if (comboBox2.getSelectedItem() == "4,2" || comboBox2.getSelectedItem() == "4,3" || comboBox2.getSelectedItem() == "4,4" || comboBox2.getSelectedItem() == "4,5") {
                    abitext.setText("5");
                }
                if (comboBox2.getSelectedItem() == "4,6" || comboBox2.getSelectedItem() == "4,7" || comboBox2.getSelectedItem() == "4,8") {
                    abitext.setText("4");
                }
                if (comboBox2.getSelectedItem() == "4,9" || comboBox2.getSelectedItem() == "5,0" || comboBox2.getSelectedItem() == "5,1") {
                    abitext.setText("3");
                }
                if (comboBox2.getSelectedItem() == "5,2" || comboBox2.getSelectedItem() == "5,3" || comboBox2.getSelectedItem() == "5,4" || comboBox2.getSelectedItem() == "5,5") {
                    abitext.setText("2");
                }
                if (comboBox2.getSelectedItem() == "5,6" || comboBox2.getSelectedItem() == "5,7" || comboBox2.getSelectedItem() == "5,8") {
                    abitext.setText("1");
                }
                if (comboBox2.getSelectedItem() == "5,9" || comboBox2.getSelectedItem() == "6,0") {
                    abitext.setText("0");
                }


            }
        });
    }



}
