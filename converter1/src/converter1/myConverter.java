package converter1;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class myConverter implements ActionListener {

    Frame f;
    JPanel p1, p2, p3;
    JLabel ltitle, lwork, choose;
    JButton exit, B1, B2, B3, B4, B5;
    String sta[] = {"         1. Currency Converter", "         2. Temperature converter", "         3. Area converter", "         4. Time converter"};
    JList jl;

    myConverter() {
        //Frame

        f = new Frame();
        f.setUndecorated(true);

        //Panel
        p1 = new JPanel();
        p1.setLayout(null);

        p2 = new JPanel();
        p2.setLayout(null);
        p3 = new JPanel();
        p3.setLayout(null);

        jl = new JList(sta);

        //Label
        ltitle = new JLabel("My Converter");
        p1.setBackground(Color.gray);
        p2.setBackground(Color.LIGHT_GRAY);
        ltitle.setFont(new Font("Tahoma", Font.BOLD, 14));
        ltitle.setForeground(Color.white);
        //ltitle.setHorizontalAlignment(SwingConstants.LEFT);

        lwork = new JLabel("Work");

        ltitle.setHorizontalAlignment(SwingConstants.CENTER);
        choose = new JLabel("CHOOSE YOUR DESIRED CONVERTER");

        jl = new JList(sta);
        // jl.setBackground(Color.GRAY);

        B1 = new JButton("About");
        // B2.setBackground(Color.red);
        B1.setBorderPainted(false);
        B1.setBackground(Color.LIGHT_GRAY);
        B1.addActionListener(this);
        B1.setActionCommand("about");

        B2 = new JButton("Rating");
        B2.setBackground(Color.LIGHT_GRAY);
        B2.setBorderPainted(false);
        B2.addActionListener(this);
        B2.setActionCommand("rating");

        B3 = new JButton("Admin");
        B3.setBackground(Color.LIGHT_GRAY);
        B3.setBorderPainted(false);
        B3.addActionListener(this);
        B3.setActionCommand("admin");

        B4 = new JButton("Apps");
        B4.setBackground(Color.LIGHT_GRAY);
        B4.setBorderPainted(false);
        B4.addActionListener(this);
        B4.setActionCommand("apps");

        B5 = new JButton("Enter");
        B5.setBounds(325, 150, 100, 25);
        B5.setBackground(Color.magenta);

        exit = new JButton("x");
        exit.setActionCommand("x");
        exit.setBackground(Color.red);

    }

    void ourframe() {
        f.setSize(500, 300);
        f.setLocation(500, 50);
        p1.setBounds(0, 0, 500, 27);
        p2.setBounds(0, 27, 500, 30);

        p3.setBounds(0, 27, 500, 473);

        p1.add(ltitle);
        p3.add(choose);

        f.add(p1);
        f.add(p2);
        f.add(p3);

        ltitle.setBounds(0, 0, 345, 27);
        choose.setBounds(120, 60, 450, 50);

        p1.add(exit);

        jl.setBounds(55, 120, 250, 90);
        p3.add(jl);

        exit.setBounds(446, 0, 43, 27);
        exit.addActionListener(this);

        B1.setBounds(20, 2, 100, 25);
        p2.add(B1);

        B2.setBounds(130, 2, 100, 25);
        p2.add(B2);

        B3.setBounds(240, 2, 100, 25);
        p2.add(B3);

        B4.setBounds(350, 2, 100, 25);
        p2.add(B4);

        p3.add(B5);
        B5.addActionListener(this);
        B5.setActionCommand("b5");

        f.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand() == "x") {
            System.exit(0);
        }
        if (e.getActionCommand() == "b5") {
            int a, b;

            int selected[] = jl.getSelectedIndices();

            for (int i = 0; i < selected.length; i++) {

                String element = (String) jl.getModel().getElementAt(selected[i]);

                if (selected[i] == 0) {

                    Currency c = new Currency();
                    c.curr();
                }
                if (selected[i] == 1) {

                    Temperature t = new Temperature();
                    t.temp();
                }
                if (selected[i] == 2) {

                    Area ar = new Area();
                    ar.area();
                }
                if (selected[i] == 3) {

                    Time tr = new Time();
                    tr.time();
                }

            }

        }
        if (e.getActionCommand() == "apps") {
            try {
                Desktop.getDesktop().browse(new URL("https://play.google.com/").toURI());
            } catch (Exception e_6) {
            }
        }

        if (e.getActionCommand() == "admin") {
            JOptionPane.showMessageDialog(null, "For any reason mail to\n\n www.moshiour4321@gmail.com\n &    www.sarowarfaruk@gmail.com", "Admin", JOptionPane.PLAIN_MESSAGE);

        }
        if (e.getActionCommand() == "rating") {
            JOptionPane.showMessageDialog(null, "Our Apps Rating\n\n                               ⋆⋆⋆⋆⋆", "Rating", JOptionPane.PLAIN_MESSAGE);

        }

        if (e.getActionCommand() == "about") {
            JOptionPane.showMessageDialog(null, "This apps was created by,\nMd. Moshiur Rahman\n & Md. Sarowar Faruk\n SYLHET ENGINEERING COLLEGE", "About", JOptionPane.PLAIN_MESSAGE);
        }

    }
}
