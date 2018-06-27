/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package converter1;

import java.awt.Color;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Area implements ActionListener {

    Frame f;
    JPanel p1, p2;
    JLabel area;
    JButton exit;
    JLabel jLabel1, jLabel2, jLabel3, jLabel4;
    JTextField jText1, jText2;

    JList j2;

    Area() {
        f = new Frame();
        f.setUndecorated(true);

        p1 = new JPanel();
        p1.setLayout(null);
        p1.setBackground(Color.CYAN);

        p2 = new JPanel();
        p2.setLayout(null);
        p2.setBackground(Color.lightGray);

        area = new JLabel("Area Converter");

        area.setHorizontalAlignment(SwingConstants.CENTER);
        exit = new JButton("x");
        exit.setActionCommand("x");
        exit.setBackground(Color.red);

        JRadioButton rb1 = new JRadioButton();
        rb1.setBounds(250, 79, 21, 25);

        jLabel1 = new JLabel("Squ kiloMeter-Hector");
        jLabel1.setBounds(280, 80, 200, 25);
        f.add(jLabel1);

        JRadioButton rb2 = new JRadioButton();
        rb2.setBounds(250, 109, 21, 25);

        jLabel2 = new JLabel("Hector-Squ Meter");
        jLabel2.setBounds(280, 110, 200, 25);
        f.add(jLabel2);

        JRadioButton rb3 = new JRadioButton();
        rb3.setBounds(250, 139, 21, 25);

        jLabel3 = new JLabel("Squ Mile-Squ Kilometer");
        jLabel3.setBounds(280, 140, 200, 25);
        f.add(jLabel3);

        JRadioButton rb4 = new JRadioButton();
        rb4.setBounds(250, 169, 21, 25);

        jLabel4 = new JLabel("Squ Meter-Squ Foot");
        jLabel4.setBounds(280, 170, 200, 25);
        f.add(jLabel4);

        ButtonGroup group = new ButtonGroup();

        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        group.add(rb4);

        f.add(rb1);
        f.add(rb2);
        f.add(rb3);
        f.add(rb4);

        rb1.addActionListener(this);
        rb1.setActionCommand("radio1");

        rb2.addActionListener(this);
        rb2.setActionCommand("radio2");

        rb3.addActionListener(this);
        rb3.setActionCommand("radio3");

        rb4.addActionListener(this);
        rb4.setActionCommand("radio4");

        jLabel2 = new JLabel("Given data");
        jLabel2.setBounds(30, 90, 120, 30);

        f.add(jLabel2);

        jText1 = new JTextField(20);
        jText1.setBounds(120, 95, 100, 20);
        f.add(jText1);

        jLabel3 = new JLabel("result");
        jLabel3.setBounds(30, 170, 120, 30);
        f.add(jLabel3);

        jText2 = new JTextField(20);
        jText2.setBounds(120, 175, 100, 20);
        f.add(jText2);

        //reset text button
        JButton reset = new JButton("Reset");
        reset.setBounds(190, 230, 70, 25);
        f.add(reset);
        reset.addActionListener(this);
        reset.setActionCommand("reset");

        // previous page button
        JButton prev = new JButton(" < ");
        prev.setBounds(10, 30, 60, 25);
        f.add(prev);
        prev.addActionListener(this);
        prev.setActionCommand("Faruk");

    }

    void area() {
        f.setSize(500, 300);
        f.setLocation(500, 50);
        f.add(p1);
        f.add(p2);

        p1.setBounds(0, 0, 500, 27);
        p2.setBounds(0, 27, 500, 473);

        p1.add(area);
        area.setBounds(0, 0, 345, 27);
        exit.setBounds(446, 0, 43, 27);

        //exit Button
        exit.addActionListener(this);
        p1.add(exit);

        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        double a, b;
        if (e.getActionCommand() == "x") {
            System.exit(0);
        }
        if (e.getActionCommand() == "Faruk") {
            myConverter mc = new myConverter();
            mc.ourframe();
        }
        if (e.getActionCommand() == "reset") {
            jText1.setText(null);
            jText2.setText(null);
            jLabel2.setText("Given data");
            jLabel3.setText("Result");  
        }
        if (e.getActionCommand() == "radio1") {
            jLabel2.setText("Squ Kilometer");
            jLabel3.setText("Hector");
            a = Double.parseDouble(jText1.getText());
            jText2.setText("" + (float) (a * 100));
        } else if (e.getActionCommand() == "radio2") {
            jLabel2.setText("Hector");
            jLabel3.setText("Squ Meter");
            a = Double.parseDouble(jText1.getText());
            jText2.setText("" + (float) (a * 10000));
        } else if (e.getActionCommand() == "radio3") {
            jLabel2.setText("Squ Mile");
            jLabel3.setText("Squ Kilometer");
            a = Double.parseDouble(jText1.getText());
            jText2.setText("" + (float) (a * 2.58999));
        } else if (e.getActionCommand() == "radio4") {
            jLabel2.setText("Squ Meter");
            jLabel3.setText("Squ Foot");
            a = Double.parseDouble(jText1.getText());
            jText2.setText("" + (float) (a * 10.763910417));
        }

    }

}
