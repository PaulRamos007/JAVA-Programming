/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package connectingtomysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author paula
 */
public class ConnectingToMysql {

    public static void main(String[] args) throws SQLException {
        
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bookstoredb", "root", "P@ulmysql");
        System.out.println("Connection to bookstoredb is successful");
        con.close();
    }
    
}
