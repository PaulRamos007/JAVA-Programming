/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DMLCommands;

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

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "P@ulmysql")) {
            Scanner myScan = new Scanner(System.in);

            System.out.println("Enter Description     ");
            //User will enter Description which is Cheese momos
            String description = myScan.nextLine();

            System.out.println("Is it Vegetarian      ");
            //User will enter true
            boolean vegetarian = myScan.nextBoolean();

            System.out.println("Enter the ID          ");
            //User will enter Item ID which is 115
            int itemID = myScan.nextInt();

            System.out.println("Enter Price           ");
            //User will enter Price which is 10
            int price = myScan.nextInt();

            PreparedStatement ps = con.prepareStatement("update MenuItem set description = ?, vegetarian = ?, price = ? where itemID = ?");
            
            ps.setString(1, description);
            ps.setBoolean(2, vegetarian);
            ps.setInt(4, itemID);
            ps.setInt(3, price);

            int count = ps.executeUpdate();
            if (count == 1) {
                System.out.println("Menu item updated successfuly");
            } else {
                System.out.println("ID not found");
            }

            ps.close();
        }
    }
}
