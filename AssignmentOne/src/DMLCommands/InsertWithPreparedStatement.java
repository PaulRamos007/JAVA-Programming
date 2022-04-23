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
public class InsertWithPreparedStatement {

    public static void main(String[] args) throws SQLException {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "P@ulmysql")) {
            Scanner myScan = new Scanner(System.in);

            System.out.println("Enter Category        ");
            //User will enter Category which is DES
            String itemCategory = myScan.nextLine();

            System.out.println("Enter Description     ");
            //User will enter Description which is Chocolate Brownie
            String description = myScan.nextLine();

            System.out.println("Is it Vegetarian      ");
            //User will enter true
            boolean vegetarian = myScan.nextBoolean();

            System.out.println("Enter the ID          ");
            //User will enter Item ID which is 311
            int itemID = myScan.nextInt();

            System.out.println("Enter Price           ");
            //User will enter Price which is 13
            int price = myScan.nextInt();

            PreparedStatement ps = con.prepareStatement("insert into MenuItem values(?,?,?,?,?)");
            
            ps.setString(2, itemCategory);
            ps.setString(3, description);
            ps.setBoolean(5, vegetarian);
            ps.setInt(1, itemID);
            ps.setInt(4, price);

            ps.executeUpdate();
            System.out.println("Added menu item successfuly");
            ps.close();
        }
    }
}
