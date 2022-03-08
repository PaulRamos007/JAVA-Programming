/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectingtomysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.PreparedStatement;

/**
 *
 * @author paula
 */
public class InsertWithPreparedStatement {

    public static void main(String[] args) throws SQLException {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "P@ulmysql")) {
            Scanner myScan = new Scanner(System.in);

            System.out.println("Enter name       :");
            String name = myScan.nextLine();

            System.out.println("Enter email       :");
            String email = myScan.nextLine();

            System.out.println("Enter user_id       :");
            int user_id = myScan.nextInt();

            PreparedStatement ps = con.prepareStatement("insert into user values(?,?,?)");
            ps.setInt(1, user_id);
            ps.setString(2, name);
            ps.setString(3, email);

            ps.executeUpdate();
            System.out.println("Added user successfuly");
            ps.close();
        }

    }

}
