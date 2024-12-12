package Hospital.Management.System;
import java.sql.*;
public class conn {
    Connection connection;
    Statement statement;

    public conn() {
        try {


            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital_management_system", "root", "root");

            statement = connection.createStatement();

        } catch (Exception e) {

            e.printStackTrace();

        }
    }
}
