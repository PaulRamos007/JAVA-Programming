/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Transactions;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.BatchUpdateException;

/**
 *
 * @author paula
 */
public class BatchExecution {
    public static void main(String[] args) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/restaurantdb", "root", "P@ulmysql")){
            con.setAutoCommit(false);
            Statement st = con.createStatement();
            
            try{
                st.addBatch("insert into MenuItemCategory values ('DRI', 'Drinks');");
                st.addBatch("insert into MenuItem values(312,'DRI','Sprite',3,true);");
                st.addBatch("insert into MenuItem values(313,'DRI','Royal',3,true);");
                st.addBatch("insert into MenuItem values(314,'DRI','Coke',3,true);");
                st.addBatch("insert into MenuItem values(315,'DRI','Freeze',3,true);");
                
                int [] er = st.executeBatch();
                con.commit();
            }catch(BatchUpdateException ex){
                System.out.println("Error in batch: " + ex.getMessage());
                con.rollback();
            }
        }
    }
}
