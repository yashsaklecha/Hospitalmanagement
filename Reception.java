package Hospital.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {



        Reception(){

            JPanel Panel=new JPanel();// display panel
            Panel.setLayout(null);
            Panel.setBounds(5,160,1525,670);
            Panel.setBackground(new Color(255,255,255));
            add(Panel);

            JPanel panel=new JPanel(); // usage or tools panel
            panel.setBackground(new Color(109,164,171));
            panel.setBounds(5,5,1525,150);
            panel.setLayout(null);
            add(panel);

//            ImageIcon image2 = new ImageIcon(ClassLoader.getSystemResource("Icon/Ambulance_icon.jpeg"));
//            Image i2 =image2.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
//            ImageIcon imageIcon2 = new ImageIcon(i2);
//
//            JLabel label1 = new JLabel(imageIcon2);
//            label1.setBounds(-65,-65,400,280);
//            panel.add(label1);

            ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/dr.png"));
            Image i1 = imageIcon.getImage().getScaledInstance(150, 150, Image.SCALE_DEFAULT);
            ImageIcon imageIcon1 = new ImageIcon(i1);

            JLabel label = new JLabel(imageIcon1);
            label.setBounds(1300, -25, 200, 200);
            panel.add(label);


            JButton btn1 = new JButton("Add New Patient ");
            btn1.setBounds(30,15,200,30);
            btn1.setBackground(new Color(170,90,15));
            btn1.setForeground(new Color(255,255,255));
            add(btn1);
            btn1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            JButton btn2 = new JButton("Room ");
            btn2.setBounds(30,58,200,30);
            btn2.setBackground(new Color(170,90,15));
            btn2.setForeground(new Color(255,255,255));
            add(btn2);
            btn2.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            JButton btn3 = new JButton("Department ");
            btn3.setBounds(30,100,200,30);
            btn3.setBackground(new Color(170,90,15));
            btn3.setForeground(new Color(255,255,255));
            add(btn3);
            btn3.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            JButton btn4 = new JButton("Employee Info");
            btn4.setBounds(265,15,200,30);
            btn4.setBackground(new Color(170,90,15));
            btn4.setForeground(new Color(255,255,255));
            add(btn4);
            btn4.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });



            JButton btn5 = new JButton("Patient Info ");
            btn5.setBounds(265,58,200,30);
            btn5.setBackground(new Color(170,90,15));
            btn5.setForeground(new Color(255,255,255));
            add(btn5);
            btn5.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            JButton btn6 = new JButton("Patient Discharge ");
            btn6.setBounds(265,100,200,30);
            btn6.setBackground(new Color(170,90,15));
            btn6.setForeground(new Color(255,255,255));
            add(btn6);
            btn6.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            JButton btn7 = new JButton("Update Patient Detail");
            btn7.setBounds(510,15,200,30);
            btn7.setBackground(new Color(170,90,15));
            btn7.setForeground(new Color(255,255,255));
            add(btn7);
            btn7.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            JButton btn8 = new JButton("Hospital Ambulance");
            btn8.setBounds(510,58,200,30);
            btn8.setBackground(new Color(170,90,15));
            btn8.setForeground(new Color(255,255,255));
            add(btn8);
            btn8.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });


            JButton btn9 = new JButton("Search Room");
            btn9.setBounds(510,100,200,30);
            btn9.setBackground(new Color(170,90,15));
            btn9.setForeground(new Color(255,255,255));
            add(btn9);
            btn9.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });

            JButton btn10 = new JButton("Logout");
            btn10.setBounds(750,15,200,30);
            btn10.setBackground(new Color(170,90,15));
            btn10.setForeground(new Color(255,255,255));
            add(btn10);
            btn10.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {

                }
            });



            setSize(1950,1090);
            setLayout(null);
            getContentPane().setBackground(Color.white);
            setVisible(true);
        }

        public static void main(String [] args){
            new Reception();
        }

}

