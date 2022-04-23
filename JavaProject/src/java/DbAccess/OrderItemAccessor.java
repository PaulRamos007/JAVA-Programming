/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DbAccess;

import Entity.OrderItem;
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
    private static PreparedStatement selectStatement = null;
    private static PreparedStatement deleteStatement = null;
    private static PreparedStatement insertStatement = null;
    private static PreparedStatement updateStatement = null;

    private OrderItemAccessor() {
    }

    private static void init() throws ClassNotFoundException, SQLException {
        if (conn == null) {
            Class.forName(ConnectionParameters.DRIVERCLASS);
            conn = ConnectionManager.getConnection(ConnectionParameters.URL, ConnectionParameters.USERNAME, ConnectionParameters.PASSWORD);
            selectAllStatement = conn.prepareStatement("SELECT * FROM ORDERS");
            selectStatement = conn.prepareStatement("SELECT * FROM ORDERS where ID = ? ");
            deleteStatement = conn.prepareStatement("DELETE from ORDERS where ID = ? ");
            updateStatement = conn.prepareStatement("UPDATE ORDERS set STATUS=?, NAME=?, DESCRIPTION=?, QUANTITY=?, PRICE=?, DELIVERED=?, DISCONTINUED=? where ID=? ");
            insertStatement = conn.prepareStatement("INSERT into ORDERS values(?,?,?,?,?,?,?,?)");
        }
    }

    public static List<OrderItem> getAllMenuItems() throws ClassNotFoundException, SQLException {
        List<OrderItem> items = new ArrayList();
        try {
            init();
            ResultSet rs = selectAllStatement.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("ID");
                String status = rs.getString("STATUS");
                String name = rs.getString("NAME");
                String description = rs.getString("DESCRIPTION");
                double quantity = rs.getDouble("QUANTITY");
                double price = rs.getDouble("PRICE");
                boolean delivered = rs.getBoolean("DELIVERED");
                boolean discontinued = rs.getBoolean("DISCONTINUED");

                OrderItem item = new OrderItem(id, status, name, description, quantity, price, delivered, discontinued);
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
        OrderItem removeItem = new OrderItem(id, "status", "name", "description", 0.0, 0.0, false, false);
        return deleteItem(removeItem);
    }

    public static OrderItem getUpdateItems(int id) throws ClassNotFoundException, SQLException {
        OrderItem items = null;
        try {
            init();
            selectStatement.setInt(1, id);
            ResultSet rs = selectStatement.executeQuery();
            while (rs.next()) {
                int orderId = rs.getInt("ID");
                String status = rs.getString("STATUS");
                String name = rs.getString("NAME");
                String description = rs.getString("DESCRIPTION");
                double quantity = rs.getDouble("QUANTITY");
                double price = rs.getDouble("PRICE");
                boolean delivered = rs.getBoolean("DELIVERED");
                boolean discontinued = rs.getBoolean("DISCONTINUED");

                items = new OrderItem(orderId, status, name, description, quantity, price, delivered, discontinued);
            }
        } catch (SQLException ex) {
            System.err.println(ex);
        }
        return items;
    }

    public static boolean updateItem(OrderItem item) throws ClassNotFoundException, SQLException {
        boolean res;
        try {
            init();
            
            updateStatement.setString(1, item.getStatus());
            updateStatement.setString(2, item.getName());
            updateStatement.setString(3, item.getDescription());
            updateStatement.setDouble(4, item.getQuantity());
            updateStatement.setDouble(5, item.getPrice());
            updateStatement.setBoolean(6, item.isDelivered());
            updateStatement.setBoolean(7, item.isDiscontinued());
            updateStatement.setInt(8, item.getId());

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
            insertStatement.setString(4, item.getDescription());
            insertStatement.setDouble(5, item.getQuantity());
            insertStatement.setDouble(6, item.getPrice());
            insertStatement.setBoolean(7, item.isDelivered());
            insertStatement.setBoolean(8, item.isDiscontinued());

            int rowCount = insertStatement.executeUpdate();
            res = (rowCount == 1);

        } catch (SQLException ex) {

            res = false;
        }
        return res;
    }
}
