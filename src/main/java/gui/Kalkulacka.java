package gui;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Kalkulacka {
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            e.printStackTrace();
        }

        JFrame hlavneOkno= new JFrame("Kalkulačka v1.0");
        hlavneOkno.setMinimumSize(new Dimension(400,300));
        hlavneOkno.setResizable(false);
        hlavneOkno.setLocationRelativeTo(null); // vycentrovanie okna
        hlavneOkno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel= new JPanel();
        panel.setLayout(null);
        hlavneOkno.setContentPane(panel); //pridanie panela do JFramu

        // Vytvaranie textoveho pola
        JTextField vstupneOkno= new JTextField();
        vstupneOkno.setBounds(20,40,350,20);  //rozmer textoveho poľa
        vstupneOkno.setHorizontalAlignment(JTextField.RIGHT);
        panel.add(vstupneOkno);
        // vytvorenie tlacidla 0
        JButton tlacidlo0= new JButton("0");
        tlacidlo0.setBounds(20,200,40,40);

            tlacidlo0.addActionListener(new ActionListener() {

                @Override
                public void actionPerformed(ActionEvent e) {
if (vstupneOkno.getText().length()>0) {
    if (!vstupneOkno.getText().substring(vstupneOkno.getText().length()-1).equals("+")&&!vstupneOkno.getText().substring(vstupneOkno.getText().length()-1).equals("-")) {
        vstupneOkno.setText(vstupneOkno.getText()+ "0" );
    }
}
                }

            });

        // vytvorenie tlacidla 1
        JButton tlacidlo1= new JButton("1");
        tlacidlo1.setBounds(70,200,40,40);

        tlacidlo1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText()+"1");
            }
        });
        // vytvorenie tlacidla 2
        JButton tlacidlo2= new JButton("2");
        tlacidlo2.setBounds(120,200,40,40);

        tlacidlo2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText()+"2");
            }
        });

        // vytvorenie tlacidla +
        JButton tlacidloPlus= new JButton("+");
        tlacidloPlus.setBounds(170,200,40,40);

        tlacidloPlus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                vstupneOkno.setText(vstupneOkno.getText()+"+");
            }
        });
        // vytvorenie tlacidla -
        JButton tlacidloMinus= new JButton("-");
        tlacidloMinus.setBounds(220,200,40,40);

        tlacidloMinus.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText(vstupneOkno.getText()+"-");
            }
        });
        // vytvorenie tlacidla C vymazanie
        JButton tlacidloC= new JButton("C");
        tlacidloC.setBounds(270,200,40,40);

        tlacidloC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                vstupneOkno.setText("");
            }
        });

        // vytvorenie tlacidla =
        JButton tlacidloRovnaSa= new JButton("=");
        tlacidloRovnaSa.setBounds(320,200,40,40);

        tlacidloRovnaSa.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                ScriptEngineManager factory = new ScriptEngineManager();
                ScriptEngine engine = factory.getEngineByName("nashorn");
                String vzorec = vstupneOkno.getText();
                try {
                    vstupneOkno.setText(engine.eval(vzorec).toString()); // vysledok Stringu, ktory obsahuje vzorec vypisem
                } catch (ScriptException e1) {
                    throw new RuntimeException(e1);
                }
            }
        });

        // pridavanie tlacidiel
        panel.add(tlacidlo0);
        panel.add(tlacidlo1);
        panel.add(tlacidlo2);
        panel.add(tlacidloPlus);
        panel.add(tlacidloMinus);
        panel.add(tlacidloC);
        panel.add(tlacidloRovnaSa);


    //pre korektne zobrazenie okna (JFrame)
        hlavneOkno.pack();
        hlavneOkno.setVisible(true);
    }

}

