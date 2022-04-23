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
    private double price;
    private double quantity;
    private boolean premium;

    public OrderItem(int id, String status, String name, double price, double quantity, boolean premium) {
        this.id = id;
        this.status = status;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.premium = premium;
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

    public double getPrice() {
        return price;
    }

    public double getQuantity() {
        return quantity;
    }

    public boolean isPremium() {
        return premium;
    }
}
