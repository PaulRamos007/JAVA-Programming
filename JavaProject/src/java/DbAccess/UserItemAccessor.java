/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbAccess;

import Entity.UserItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;

/**
 *
 * @author paula
 */
public class UserItemAccessor {

    private static Connection conn = null;
    private static PreparedStatement selectStatement = null;
    private static PreparedStatement insertStatement = null;

    private UserItemAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
    if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectStatement = conn.prepareStatement("SELECT * from USERS where USERNAME=? and PASSWORD=?");
            insertStatement = conn.prepareStatement("INSERT into USERS values(?,?,?,?,?,?)");
        }
    }
    
    public static boolean insertUser(UserItem user) throws ClassNotFoundException, SQLException{
        boolean res;
        try{
        init();
        
        insertStatement.setInt(1, user.getId());
        insertStatement.setString(2, user.getUsername());
        insertStatement.setString(3, user.getPassword());
        insertStatement.setString(4, user.getFullname());
        insertStatement.setString(5, user.getEmail());
        insertStatement.setString(6, user.getOrganization());
        
        int rowCount = insertStatement.executeUpdate();
        res = (rowCount == 1);
        
        }catch(SQLException ex){
            res = false;
        }
        return res;
    }
    
    public static boolean userLogin(String userName, String password)throws ClassNotFoundException, SQLException {
        boolean res = false;

        try{
            init();
            selectStatement.setString(1, userName);
            selectStatement.setString(2, password);
            
            ResultSet rs = selectStatement.executeQuery();
            
            res = rs.next();
            
        }catch (SQLException ex) {
            System.err.println(ex);
        }
        return res;
    }
}
