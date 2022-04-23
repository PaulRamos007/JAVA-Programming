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
import java.sql.Statement;

/**
 *
 * @author paula
 */
public class InsertWithConcat {

    public static void main(String[] args) throws SQLException {

        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "P@ulmysql")) {
            Scanner myScan = new Scanner(System.in);

            System.out.println("Enter Category        ");
            //User will enter Category which is APP
            String itemCategory = myScan.nextLine();

            System.out.println("Enter Description     ");
            //User will enter Description which is Chicken momos
            String description = myScan.nextLine();
            
            System.out.println("Is it Vegetarian      ");
            //User will enter false
            boolean vegetarian = myScan.nextBoolean();

            System.out.println("Enter the ID          ");
            //User will enter Item ID which is 115
            int itemID = myScan.nextInt();

            System.out.println("Enter Price           ");
            //User will enter Price which is 12
            int price = myScan.nextInt();

            String cmd = "insert into MenuItem value( " + itemID + ", '" + itemCategory + "', '" + description + "', " + price + ", " + vegetarian + ")";
            System.out.println("Executing this command " + cmd);

            Statement st = con.createStatement();
            st.executeUpdate(cmd);
            System.out.println("Added menu item successfully");
            st.close();
        }

    }
}
