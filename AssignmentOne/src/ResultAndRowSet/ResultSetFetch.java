/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultAndRowSet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


/**
 *
 * @author paula
 */
public class ResultSetFetch {

    public static void main(String[] args) throws SQLException {
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "P@ulmysql");
        String query = "SELECT itemID, itemCategoryID, description, price FROM menuitem";
        try(Statement st = con.createStatement()){
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                int itemID = rs.getInt(1);
                String itemCategoryID = rs.getString(2);
                String description = rs.getString(3);
                int price = rs.getInt(4);
                
                System.out.printf("%-10s %-10s %5s %12s\n" , itemID, itemCategoryID, description, price);
            }
        }
        
    }

}
 