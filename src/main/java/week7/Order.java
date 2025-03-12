/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ADMIN
 */
public class Order {
        String customerName;
    List<Fruit> items;
    List<Integer> quantities;

    public Order(String customerName) {
        this.customerName = customerName;
        this.items = new ArrayList<>();
        this.quantities = new ArrayList<>();
    }

    public void addItem(Fruit fruit, int quantity) {
        items.add(fruit);
        quantities.add(quantity);
    }

    public double getTotal() {
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).price * quantities.get(i);
        }
        return total;
    }

    public void displayOrder() {
        System.out.println("Customer: " + customerName);
        System.out.println("Product | Quantity | Price | Amount");
        for (int i = 0; i < items.size(); i++) {
            System.out.printf("%s %d %.2f$ %.2f$\n", 
                              items.get(i).name, 
                              quantities.get(i), 
                              items.get(i).price, 
                              items.get(i).price * quantities.get(i));
        }
        System.out.println("Total: " + getTotal() + "$\n");
    }
}
