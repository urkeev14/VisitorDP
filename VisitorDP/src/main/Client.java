/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.element.product.Book;
import domain.element.product.Fruit;
import visitor.ShoppingCartVisitor;
import visitor.impl.ShoppingCartVisitorImpl;
import domain.element.Product;

/**
 *
 * @author urosv
 */
public class Client {

    public static void main(String[] args) {
        Product[] products = new Product[]{
            new Book(50, "14324"),
            new Fruit(10, 2, "Banana"),
            new Fruit(14, 4, "Avocado")
        };
        
        calculatePrice(products);
    }

    private static void calculatePrice(Product[] products) {
        ShoppingCartVisitor visitor = new ShoppingCartVisitorImpl();
        int total = 0;
        
        for (Product product : products) {
            total = total + product.accept(visitor);
        }
        
        System.out.println("Total cost = " + total);
    }

}
