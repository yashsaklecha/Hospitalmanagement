package Hospital.Management.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;


public class Login_page extends JFrame implements ActionListener {
    JTextField textField;
    JTextField department;
    JPasswordField jPasswordField;

    JButton b1, b2;

    Login_page() {
        super();

        getContentPane().setBackground(new Color(109, 164, 170));

        JLabel namelabel = new JLabel("Username");
        namelabel.setBounds(40, 20, 100, 30);
        namelabel.setFont(new Font("Tahoma", Font.BOLD, 16));
        add(namelabel);


        namelabel.setForeground(Color.BLACK);

        JLabel password_label = new JLabel("Password");
        password_label.setBounds(40, 70, 100, 30);
        password_label.setFont(new Font("Tahoma", Font.BOLD, 16));
        password_label.setForeground(Color.BLACK);
        add(password_label);

        JLabel Department_label = new JLabel("Department ");
        Department_label.setBounds(40, 120, 120, 30);
        Department_label.setFont(new Font("Tahoma", Font.BOLD, 16));
        Department_label.setForeground(Color.BLACK);
        add(Department_label);

        textField = new JTextField();
        textField.setBounds(150, 20, 150, 30);
        textField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        textField.setBackground(new Color(255, 179, 0));
        add(textField);

        department = new JTextField();
        department.setBounds(150, 120, 150, 30);
        department.setFont(new Font("Tahoma", Font.PLAIN, 15));
        department.setBackground(new Color(255, 179, 0));
        add(department);

        jPasswordField = new JPasswordField();
        jPasswordField.setBounds(150, 70, 150, 30);
        jPasswordField.setFont(new Font("Tahoma", Font.PLAIN, 15));
        jPasswordField.setBackground(new Color(255, 179, 0));
        add(jPasswordField);


        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("Icon/Login.png"));
        Image i1 = imageIcon.getImage().getScaledInstance(300, 280, Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(i1);

        JLabel label = new JLabel(imageIcon1);
        label.setBounds(300, -10, 400, 280);
        add(label);

        b1 = new JButton("Login");
        b1.setBackground(Color.BLACK);
        b1.setFont(new Font("serif", Font.BOLD, 15));
        b1.setBounds(40, 180, 120, 30);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

        b2 = new JButton("Cancel");
        b2.setBackground(Color.BLACK);
        b2.setFont(new Font("serif", Font.BOLD, 15));
        b2.setBounds(180, 180, 120, 30);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);


        setSize(700, 300);
        setLocation(400, 270);
        setLayout(null);
        setVisible(true);


    }


    public static void main(String[] args) {
        new Login_page();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == b1) {
            try {
                conn c = new conn();
                String user = textField.getText();
                String pass = new String(jPasswordField.getPassword()); // Use getPassword() for password field
                String d = department.getText();

                // Prepare the SQL query using prepared statement
                String q = "SELECT * FROM login WHERE id = ? AND pw = ? AND dept = ?";
                PreparedStatement pstmt = c.connection.prepareStatement(q);
                pstmt.setString(1, user);  // Bind the username
                pstmt.setString(2, pass);  // Bind the password
                pstmt.setString(3, d);     // Bind the department

                ResultSet resultSet = pstmt.executeQuery();
                if (resultSet.next()) {
                    new Reception();
                    setVisible(false);
                } else {
                    JOptionPane.showMessageDialog(null, "Invalid credentials or department.");
                }
            } catch (Exception E) {
                E.printStackTrace();
            }
        } else {
            System.exit(1);
        }
    }
}