/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

/**
 *
 * @author ADMIN
 */
public class Fruit {
      String id, name, origin;
    double price;
    int quantity;

    public Fruit(String id, String name, String origin, double price, int quantity) {
        this.id = id;
        this.name = name;
        this.origin = origin;
        this.price = price;
        this.quantity = quantity;
    }

    public String toString() {
        return String.format("%s | %s | %s | %.2f$", id, name, origin, price);
    }
}
