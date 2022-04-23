/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ResultAndRowSet;

import java.sql.SQLException;
import javax.sql.RowSet;
import javax.sql.rowset.CachedRowSet;
import javax.sql.rowset.RowSetFactory;
import javax.sql.rowset.RowSetProvider;

/**
 *
 * @author paula
 */
public class CachedRowSetItemId {
    public static void main(String[] args) throws SQLException{
        try(CachedRowSet row = RowSetProvider.newFactory().createCachedRowSet()){
            row.setUrl("jdbc:mysql://localhost:3306/restaurantdb"); 
            row.setUsername("root");
            row.setPassword("P@ulmysql");
            
            row.setCommand("SELECT itemCategoryDescription, mi.itemCategoryID, description, price from MenuItem mi JOIN MenuItemCategory mic ON mi.itemCategoryID = mic.itemCategoryID where itemID = 102;");
            row.execute();
            
            while(row.next()){
                String itemCategoryDescription = row.getString("itemCategoryDescription");
                String itemCategoryID = row.getString("itemCategoryID");
                String description = row.getString("description");
                int price = row.getInt("price");
                
                System.out.printf("%-10s %-10s %5s %12s\n" , itemCategoryDescription, itemCategoryID, description, price);
            }
        }
    }
}
