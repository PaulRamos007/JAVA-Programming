/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbAccess;

import entity.OrderItem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

/**
 *
 * @author paula
 */
public class OrderItemAccessor {

    private static Connection conn = null;
    private static PreparedStatement selectAllStatement = null;
    private static PreparedStatement deleteStatement = null;
    private static PreparedStatement insertStatement = null;
    private static PreparedStatement updateStatement = null;

    private OrderItemAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("SELECT * FROM FOODORDERS");
            deleteStatement = conn.prepareStatement("delete from FOODORDERS where ORDER_ID = ? ");
            updateStatement = conn.prepareStatement("update FOODORDERS set STATUS_ID=?, NAME=?, PRICE=?, QUANTITY=?, PREMIUM=? where ORDER_ID = ? ");
            insertStatement = conn.prepareStatement("insert into FOODORDERS values(?,?,?,?,?,?)");
        }
    }

    public static List<OrderItem> getAllMenuItems() throws ClassNotFoundException, SQLException {
        List<OrderItem> items = new ArrayList();
        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ORDER_ID");
                String status = rs.getString("STATUS_ID");
                String name = rs.getString("NAME");
                double price = rs.getDouble("PRICE");
                double quantity = rs.getInt("QUANTITY");
                boolean premium = rs.getBoolean("PREMIUM");

                OrderItem item = new OrderItem(id, status, name, price, quantity, premium);
                items.add(item);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
            items = new ArrayList();
        }
        return items;
    }

    public static boolean deleteItem(OrderItem item) throws ClassNotFoundException, SQLException {
        boolean res;
        try {
            init();
            deleteStatement.setInt(1, item.getId());

            int rowCount = deleteStatement.executeUpdate();
            res = (rowCount == 1);

        } catch (SQLException ex) {
            res = false;

        }
        return res;
    }

    public static boolean deleteItemById(int id) throws ClassNotFoundException, SQLException {
        OrderItem removeItem = new OrderItem(id, "status", "name", 0.0, 0.0, false);
        return deleteItem(removeItem);

    }

    public static boolean updateItem(OrderItem item) throws ClassNotFoundException, SQLException {
        boolean res;

        try {
            init();

            updateStatement.setString(1, item.getStatus());
            updateStatement.setString(2, item.getName());
            updateStatement.setDouble(3, item.getPrice());
            updateStatement.setDouble(4, item.getQuantity());
            updateStatement.setBoolean(5, item.isPremium());
            updateStatement.setInt(6, item.getId());

            int rowCount = updateStatement.executeUpdate();
            res = (rowCount == 1);

        } catch (SQLException ex) {

            res = false;
        }
        return res;
    }

    public static boolean insertItem(OrderItem item) throws ClassNotFoundException, SQLException {
        boolean res;

        try {
            init();

            insertStatement.setInt(1, item.getId());
            insertStatement.setString(2, item.getStatus());
            insertStatement.setString(3, item.getName());
            insertStatement.setDouble(4, item.getPrice());
            insertStatement.setDouble(5, item.getQuantity());
            insertStatement.setBoolean(6, item.isPremium());

            int rowCount = insertStatement.executeUpdate();
            res = (rowCount == 1);

        } catch (SQLException ex) {

            res = false;
        }
        return res;
    }
}
