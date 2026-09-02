
package com.ShopingCart;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopingCart {

    private ArrayList<Product> cartItems = new ArrayList<>();

    private int totalAmount = 0;

    Scanner sc = new Scanner(System.in);

    // Add Item
    public void addItem() {

        System.out.print("Enter Product ID: ");
        String id = sc.nextLine();

        System.out.print("Enter Product Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Product Price: ");
        int price = sc.nextInt();
        sc.nextLine();

        Product product = new Product(id, name, price);

        cartItems.add(product);

        totalAmount = totalAmount + price;

        System.out.println("Product added successfully!");
    }

    // Remove Item
    public void removeItem() {

        System.out.print("Enter Product ID to remove: ");
        String id = sc.nextLine();

        for (int i = 0; i < cartItems.size(); i++) {

            Product product = cartItems.get(i);

            if (product.getPid().equals(id)) {

                totalAmount = totalAmount - product.getPAmount();

                cartItems.remove(i);

                System.out.println("Product removed successfully!");

                return;
            }
        }

        System.out.println("Product not found!");
    }

    // Display Items
    public void displayItems() {

        if (cartItems.isEmpty()) {

            System.out.println("Cart is empty!");

            return;
        }

        System.out.println("\n===== CART ITEMS =====");

        for (Product product : cartItems) {

            System.out.println("Product ID    : " + product.getPid());
            System.out.println("Product Name  : " + product.getCartItem());
            System.out.println("Product Price : " + product.getPAmount());
            System.out.println("----------------------");
        }

        System.out.println("Total Amount  : " + totalAmount);
    }

    // Main Method
    public static void main(String[] args) {

        ShopingCart cart = new ShopingCart();

        while (true) {

            System.out.println("\n******** SHOPPING CART **********");
            System.out.println("1. Add Item");
            System.out.println("2. Remove Item");
            System.out.println("3. Display Cart"); 
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");

            int choice = cart.sc.nextInt();
            cart.sc.nextLine();

            switch (choice) {

                case 1:
                    cart.addItem();
                    break;

                case 2:
                    cart.removeItem();
                    break;

                case 3:
                    cart.displayItems();
                    break;

                case 4:
                    System.out.println("Thank you for using Shopping Cart!");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}

