/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbAccess;

import entity.OrderItemStatus;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author paula
 */
public class OrderStatusAccessor {

    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;

    private OrderStatusAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("SELECT * from STATUS");
        }

    }

    public static List<OrderItemStatus> getAllCategories() throws ClassNotFoundException, SQLException {
        List<OrderItemStatus> stats = new ArrayList();

        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                String stat = rs.getString("STATUS_ID");
                String desc = rs.getString("ORDERSTATUSDESCRIPTION");
                OrderItemStatus tempstat = new OrderItemStatus(stat, desc);
                stats.add(tempstat);

            }

        } catch (SQLException ex) {

            stats = new ArrayList();
        }

        return stats;

    }

}
