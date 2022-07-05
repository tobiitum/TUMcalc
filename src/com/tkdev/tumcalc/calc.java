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
    private JLabel result;
    private JComboBox comboBox2;
    private JLabel abitext;
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
                abitext.setText("Punkte");
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
                    int abinote = Integer.parseInt(abitext.getText());
                if (comboBox1.getSelectedItem() == "Aerospace"){
                    int mathe0 = (Integer.parseInt(mathe1.getText() + mathe2.getText() + mathe3.getText() + mathe4.getText() + mathfi.getText())/5);
                    int mathe = mathe0*3;
                    int englisch = (Integer.parseInt(eng1.getText() + eng2.getText() + eng3.getText() + eng4.getText() + englischfi.getText())/5);
                    if (!(infofi.getText() =="")){
                        int informatik01 = (Integer.parseInt(info1.getText() + info2.getText() + info3.getText() + info4.getText() + infofi.getText())/5);
                        int informatik02 = informatik01*2;
                        int result = (abinote+(mathe+englisch+informatik02)/6)/2;
                        resulttext.setText(String.valueOf(result));
                    }
                    else{ if (!(biofi.getText() =="")){
                        int bio0 = (Integer.parseInt(bio1.getText() + bio2.getText() + bio3.getText() + bio4.getText() + biofi.getText())/5);
                        int bio = bio0*2;
                        int result = (abinote+(mathe+englisch+bio)/6)/2;
                        resulttext.setText(String.valueOf(result));
                    }else {
                        if (!(chemiefi.getText() == "")) {
                            int chemie0 = (Integer.parseInt(chemie1.getText() + chemie2.getText() + chemie3.getText() + chemie4.getText() + chemiefi.getText())/5);
                            int chemie = chemie0 * 2;
                            int result = (abinote+(mathe+englisch+chemie)/6)/2;
                            resulttext.setText(String.valueOf(result));
                        } else {
                            if (!(physikfi.getText() == "")) {
                                int physik0 = (Integer.parseInt(physik1.getText() + physik2.getText() + physik3.getText() + physik4.getText() + physikfi.getText())/5);
                                int physik = physik0 * 2;
                                int result = (abinote+(mathe+englisch+physik)/6)/2;
                                resulttext.setText(String.valueOf(result));
                            }
                        }
                    }}

                }
                if (comboBox1.getSelectedItem() == "Architektur") {
                    int mathe0 = (Integer.parseInt(mathe1.getText() + mathe2.getText() + mathe3.getText() + mathe4.getText() + mathfi.getText())/5);
                    int mathe = mathe0 * 2;
                    int englisch = (Integer.parseInt(eng1.getText() + eng2.getText() + eng3.getText() + eng4.getText() + englischfi.getText())/5);
                    int deutsch = (Integer.parseInt(deutsch1.getText() + deutsch2.getText() + deutsch3.getText() + deutschfi.getText() + deutsch4.getText())/5);
                    int kunst0 = (Integer.parseInt(kunst1.getText() + kunst2.getText() + kunst3.getText() + kunst4.getText() + kunstfi.getText())/5);
                    int kunst = kunst0*3;
                    int result = (abinote+(mathe+englisch+deutsch+kunst)/6)/2;
                    resulttext.setText(String.valueOf(result));
                }
                    if (comboBox1.getSelectedItem() == "Informatik") {
                        int mathe0 = 100*(Integer.parseInt(mathe1.getText() + mathe2.getText() + mathe3.getText() + mathe4.getText() + mathfi.getText())/5);
                        int mathe = mathe0 * 3;
                        int englisch = (Integer.parseInt(eng1.getText() + eng2.getText() + eng3.getText() + eng4.getText() + englischfi.getText())/5);
                        int deutsch = (Integer.parseInt(deutsch1.getText() + deutsch2.getText() + deutsch3.getText() + deutschfi.getText() + deutsch4.getText())/5);
                        int informatik01 = (Integer.parseInt(info1.getText() + info2.getText() + info3.getText() + info4.getText() + infofi.getText())/5);
                        int informatik02 = informatik01*2;
                        int result = (abinote+(mathe+englisch+deutsch+informatik02)/7)/2;
                        resulttext.setText(String.valueOf(mathe0));
                    }
                    if (comboBox1.getSelectedItem() == "TUM-BWL"){
                        int mathe0 = Integer.parseInt(mathe1.getText() + mathe2.getText() + mathe3.getText() + mathe4.getText() + mathfi.getText());
                        int mathe = mathe0*2;
                        int englisch = Integer.parseInt(eng1.getText() + eng2.getText() + eng3.getText() + eng4.getText() + englischfi.getText());
                        int deutsch = Integer.parseInt(deutsch1.getText() + deutsch2.getText() + deutsch3.getText() + deutschfi.getText() + deutsch4.getText());
                        if (!(infofi.getText() =="")){
                            int informatik01 = Integer.parseInt(info1.getText() + info2.getText() + info3.getText() + info4.getText() + infofi.getText());
                            int informatik02 = informatik01*2;
                            int result = (abinote+(mathe+englisch+deutsch+informatik02)/6)/2;
                            resulttext.setText(String.valueOf(result));
                        }
                        else{ if (!(biofi.getText() =="")){
                            int bio0 = Integer.parseInt(bio1.getText() + bio2.getText() + bio3.getText() + bio4.getText() + biofi.getText());
                            int bio = bio0*2;
                            int result = (abinote+(mathe+englisch+deutsch+bio)/6)/2;
                            resulttext.setText(String.valueOf(result));
                        }else {
                            if (!(chemiefi.getText() == "")) {
                                int chemie0 = Integer.parseInt(chemie1.getText() + chemie2.getText() + chemie3.getText() + chemie4.getText() + chemiefi.getText());
                                int chemie = chemie0 * 2;
                                int result = (abinote+(mathe+englisch+deutsch+chemie)/6)/2;
                                resulttext.setText(String.valueOf(result));
                            } else {
                                if (!(physikfi.getText() == "")) {
                                    int physik0 = Integer.parseInt(physik1.getText() + physik2.getText() + physik3.getText() + physik4.getText() + physikfi.getText());
                                    int physik = physik0 * 2;
                                    int result = (abinote+(mathe+englisch+deutsch+physik)/6)/2;
                                    resulttext.setText(String.valueOf(result));
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
