/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbAccess;

/**
 *
 * @author paula
 */
public class ConnectionParameters {
    public static final String URL="jdbc:mysql://localhost:3306/onlinedeliverydb";
    public static final String USERNAME = "root";
    public static final String PASSWORD = "P@ulmysql";
    public static final String DRIVERCLASS = "com.mysql.jdbc.Driver";
    
    private ConnectionParameters(){}    
}
