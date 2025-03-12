/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package week7;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class FruitShop {

    static List<Fruit> fruits = new ArrayList<>();
    static Hashtable<String, Order> orders = new Hashtable<>();
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\nFRUIT SHOP SYSTEM");
            System.out.println("1. Create Fruit");
            System.out.println("2. View Orders");
            System.out.println("3. Shopping (for buyer)");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    createFruit();
                    break;
                case 2:
                    viewOrders();
                    break;
                case 3:
                    shopping();
                    break;
                case 4:
                    System.out.println("Exiting program...");
                    return;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        }
    }

    public static void createFruit() {
        while (true) {
            System.out.print("Enter Fruit ID: ");
            String id = scanner.nextLine();
            System.out.print("Enter Fruit Name: ");
            String name = scanner.nextLine();
            System.out.print("Enter Fruit Origin: ");
            String origin = scanner.nextLine();
            System.out.print("Enter Fruit Price: ");
            double price = scanner.nextDouble();
            System.out.print("Enter Fruit Quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            fruits.add(new Fruit(id, name, origin, price, quantity));
            System.out.print("Do you want to continue (Y/N)? ");
            if (!scanner.nextLine().equalsIgnoreCase("Y")) {
                break;
            }
        }
        displayFruits();
    }

    public static void viewOrders() {
        if (orders.isEmpty()) {
            System.out.println("No orders yet.");
        } else {
            for (Order order : orders.values()) {
                order.displayOrder();
            }
        }
    }

    public static void shopping() {
        if (fruits.isEmpty()) {
            System.out.println("No fruits available.");
            return;
        }

        Order order = new Order("");
        while (true) {
            displayFruits();
            System.out.print("Select an item by number (or 0 to finish): ");
            int itemIndex = scanner.nextInt() - 1;
            scanner.nextLine();
            if (itemIndex < 0 || itemIndex >= fruits.size()) {
                break;
            }

            Fruit selectedFruit = fruits.get(itemIndex);
            System.out.println("You selected: " + selectedFruit.name);
            System.out.print("Please input quantity: ");
            int quantity = scanner.nextInt();
            scanner.nextLine();

            if (quantity > selectedFruit.quantity) {
                System.out.println("Not enough stock available!");
                continue;
            }

            selectedFruit.quantity -= quantity;
            order.addItem(selectedFruit, quantity);

            System.out.print("Do you want to order now (Y/N)? ");
            if (scanner.nextLine().equalsIgnoreCase("Y")) {
                System.out.print("Input your name: ");
                order.customerName = scanner.nextLine();
                orders.put(order.customerName, order);
                order.displayOrder();
                break;
            }
        }
    }

    public static void displayFruits() {
        System.out.println("\nList of Fruits:");
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for (int i = 0; i < fruits.size(); i++) {
            System.out.println((i + 1) + " " + fruits.get(i));
        }
    }
}
