/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.BatchUpdateException;

/**
 *
 * @author paula
 */
public class Transaction {

    public static void main(String[] args) throws SQLException {
        try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "P@ulmysql")) {
            con.setAutoCommit(false);
            Statement st = con.createStatement();
            
            try{
                st.addBatch("UPDATE book SET price = price + 2 WHERE book_id = 2;");
                st.addBatch("UPDATE users SET order_total = order_total + 2 WHERE user_id = 2;");
                
                int[] er = st.executeBatch();
                con.commit();
            }catch(BatchUpdateException ex){
                System.out.println("Error in batch: " + ex.getMessage());
                con.rollback();
            }
        }
    }
}
