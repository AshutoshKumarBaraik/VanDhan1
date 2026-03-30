package com.vandhan.main;

import com.vandhan.models.Product;
import com.vandhan.services.ProductService;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ProductService ps = new ProductService();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("1. List Products\n2. Add Product\n3. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    List<Product> products = ps.getAllProducts();
                    for (Product p : products) {
                        System.out.println(p.getId() + " | " + p.getName() + " | " + p.getPrice() + " | " + p.getStock());
                    }
                    break;
                case 2:
                    System.out.print("Product Name: ");
                    String name = sc.nextLine();
                    System.out.print("Price: ");
                    double price = sc.nextDouble();
                    System.out.print("Stock: ");
                    int stock = sc.nextInt();
                    ps.addProduct(new Product(0, name, price, stock));
                    System.out.println("Product added!");
                    break;
                case 3:
                    System.exit(0);
            }
        }
    }
}
