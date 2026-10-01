package com.sunbeam;

class EcommerceException extends Exception {
    public EcommerceException(String message) {
        super(message);
    }
}

class PaymentException extends EcommerceException {
    public PaymentException(String message) {
        super(message);
    }
}

class InventoryException extends EcommerceException {
    public InventoryException(String message) {
        super(message);
    }
}

class ShippingException extends EcommerceException {
    public ShippingException(String message) {
        super(message);
    }
}

class Ecommerce {

    public void makePayment(double amount) throws PaymentException {

        if (amount <= 0) {
            throw new PaymentException("Invalid payment amount");
        }

        System.out.println("Payment successful: ₹" + amount);
    }

    public void checkInventory(int quantity) throws InventoryException {

        int availableStock = 5;

        if (quantity > availableStock) {
            throw new InventoryException(
                    "Insufficient inventory. Available stock: " + availableStock);
        }

        System.out.println("Inventory available");
    }

    public void shipOrder(String address) throws ShippingException {

        if (address == null || address.isEmpty()) {
            throw new ShippingException("Invalid shipping address");
        }

        System.out.println("Order shipped to: " + address);
    }
}

public class Q6 {

    public static void main(String[] args) {

        Ecommerce ecommerce = new Ecommerce();

        try {
            ecommerce.makePayment(1000);
        } catch (PaymentException e) {
            System.out.println("Payment Error: " + e.getMessage());
        }

        try {
            ecommerce.checkInventory(10);
        } catch (InventoryException e) {
            System.out.println("Inventory Error: " + e.getMessage());
        }

        try {
            ecommerce.shipOrder("");
        } catch (ShippingException e) {
            System.out.println("Shipping Error: " + e.getMessage());
        }
    }
}