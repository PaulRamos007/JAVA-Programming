/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

/**
 *
 * @author paula
 */
public class OrderItem {
    private int id;
    private String status;
    private String name;
    private String description;
    private double quantity;
    private double price;
    private boolean delivered;
    private boolean discontinued;

    public OrderItem(int id, String status, String name, String description, double quantity, double price, boolean delivered, boolean discontinued) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.description = description;
        this.quantity = quantity;
        this.price = price;
        this.delivered = delivered;
        this.discontinued = discontinued;
    }

    public int getId() {
        return id;
    }

    public String getStatus() {
        return status;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public boolean isDelivered() {
        return delivered;
    }

    public boolean isDiscontinued() {
        return discontinued;
    }
}
