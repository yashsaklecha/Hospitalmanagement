package Hospital.Management.System;

import javax.swing.*;
import java.awt.*;


public class Login_page extends JFrame {
    JTextField textField;
    JTextField department;
    JPasswordField jPasswordField;
    Login_page(){
        super();

        getContentPane().setBackground(new Color( 109,164,170));

        JLabel namelabel=new  JLabel("Username");
        namelabel.setBounds(40,20,100,30);
        namelabel.setFont(new Font ("Tahoma",Font.BOLD,16));
        add(namelabel);


        namelabel.setForeground(Color.BLACK);

        JLabel password_label = new JLabel("Password");
        password_label.setBounds(40,70,100,30);
        password_label.setFont(new Font ("Tahoma",Font.BOLD,16));
        password_label.setForeground(Color.BLACK);
        add(password_label);

        JLabel Department_label = new JLabel("Department ");
        Department_label.setBounds(40 ,120 , 120,30);
        Department_label.setFont(new Font("Tahoma",Font.BOLD,16));
        Department_label.setForeground(Color.BLACK);
        add(Department_label);

        textField = new JTextField() ;
        textField.setBounds(150,20,150,30);
        textField.setFont(new Font("Tahoma",Font.PLAIN,15));
        textField.setBackground(new Color(255,179,0));
        add(textField);

        jPasswordField =    new JPasswordField();
        jPasswordField.setBounds(150,70,150,30);
        jPasswordField.setFont(new Font ("Tahoma",Font.PLAIN,15));
        jPasswordField.setBackground(new Color(255,179,0));
        add(jPasswordField);

        department=new JTextField();
        department.setBounds(150,120,150,30);
        department.setFont(new Font("Tahoma",Font.PLAIN,15));
        department.setBackground(new Color(255,179,0));
        add(department);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("Icon/Login.png"));
        Image i1= imageIcon.getImage().getScaledInstance(300,280,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 =new ImageIcon(i1);

        JLabel label = new JLabel(imageIcon1);
        label.setBounds(300,-10,400,280);
        add(label);


        setSize (700,300);
        setLocation(400,270);
        setLayout(null);
        setVisible(true);



    }


    public static void main (String [] args){
        new Login_page();
    }
}
