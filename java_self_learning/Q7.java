package com.sunbeam;

import java.util.ArrayList;
import java.util.HashMap;

class Product {
    private int id;
    private String name;
    private double price;

    public Product(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - ₹" + price;
    }
}

class ShoppingCart {

    private HashMap<Integer, Product> products;

    private ArrayList<String> orderHistory;

    public ShoppingCart() {
        products = new HashMap<>();
        orderHistory = new ArrayList<>();
    }

    public void addProduct(Product product) {
        products.put(product.getId(), product);
        System.out.println(product.getName() + " added to cart.");
    }

    public void removeProduct(int productId) {

        Product product = products.remove(productId);

        if (product != null) {
            System.out.println(product.getName() + " removed from cart.");
        } else {
            System.out.println("Product not found.");
        }
    }

    public void displayCart() {

        System.out.println("\n----- Shopping Cart -----");

        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        for (Product product : products.values()) {
            System.out.println(product);
        }
    }

    public double calculateTotal() {

        double total = 0;

        for (Product product : products.values()) {
            total += product.getPrice();
        }

        return total;
    }

    public void placeOrder() {

        if (products.isEmpty()) {
            System.out.println("Cart is empty.");
            return;
        }

        double total = calculateTotal();

        String order = "Order placed - Total: ₹" + total;

        orderHistory.add(order);

        products.clear();

        System.out.println(order);
    }

    public void displayOrderHistory() {

        System.out.println("\n----- Order History -----");

        if (orderHistory.isEmpty()) {
            System.out.println("No orders found.");
            return;
        }

        for (String order : orderHistory) {
            System.out.println(order);
        }
    }
}

public class Q7 {

    public static void main(String[] args) {

        ShoppingCart cart = new ShoppingCart();

        Product p1 = new Product(101, "Laptop", 50000);
        Product p2 = new Product(102, "Mouse", 800);
        Product p3 = new Product(103, "Keyboard", 1500);

        cart.addProduct(p1);
        cart.addProduct(p2);
        cart.addProduct(p3);

        cart.displayCart();

        System.out.println("\nTotal Amount: ₹" + cart.calculateTotal());

        cart.removeProduct(102);

        cart.displayCart();

        cart.placeOrder();

        cart.displayOrderHistory();
    }
}