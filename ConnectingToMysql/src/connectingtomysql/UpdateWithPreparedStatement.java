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
public class UpdateWithPreparedStatement {

    public static void main(String[] args) throws SQLException {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "P@ulmysql")) {
            Scanner myScan = new Scanner(System.in);

            System.out.println("Enter name       :");
            String name = myScan.nextLine();

            System.out.println("Enter user_id       :");
            int user_id = myScan.nextInt();

            PreparedStatement ps = con.prepareStatement("update users set name = ? where user_id = ?");
            ps.setString(1, name);
            ps.setInt(2, user_id);

            int count = ps.executeUpdate();
            if (count == 1) {
                System.out.println("User updated");
            } else {
                System.out.println("ID not found");
            }

            ps.close();
        }

    }

}
