/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor.impl;

import domain.element.product.Book;
import domain.element.product.Fruit;
import java.util.logging.Level;
import java.util.logging.Logger;
import visitor.ShoppingCartVisitor;

public class ShoppingCartVisitorImpl implements ShoppingCartVisitor {

    private int cost;

    @Override
    public int visit(Book book) {
        if (book.getPrice() > 50) {
            cost = book.getPrice() - 5;
        } else {
            cost = book.getPrice();
        }

        putInEffort();

        System.out.println("Book ISBN::" + book.getISBN() + "\ncost = " + cost + "\n\n");
        return cost;
    }

    @Override
    public int visit(Fruit fruit) {
        cost = fruit.getPricePerKg() * fruit.getWeight();
        putInEffort();
        System.out.println(fruit.getName() + "\ncost = " + cost + "\n\n");
        return cost;
    }

    @Override
    public void putInEffort() {
        try {
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(ShoppingCartVisitorImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
