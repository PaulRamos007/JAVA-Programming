/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DMLCommands;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;

/**
 *
 * @author paula
 */
public class DeleteWithPreparedStatement {

    public static void main(String[] args) throws SQLException, IOException {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "P@ulmysql")) {
            BufferedReader stdin = new BufferedReader(new InputStreamReader(System.in));
            
            System.out.println("Enter the ID          ");
            //User will enter Item ID which is 101
            String input = stdin.readLine();
            int itemID = Integer.parseInt(input);

            PreparedStatement ps = con.prepareStatement("delete from MenuItem where itemID = ?");

            ps.setInt(1, itemID);

            int count = ps.executeUpdate();
            if (count == 1) {
                System.out.println("Menu item deleted successfuly");
            } else {
                System.out.println("ID not found");
            }

            ps.close();
        }
    }
}
