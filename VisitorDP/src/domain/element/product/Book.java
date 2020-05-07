/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.element.product;

import visitor.ShoppingCartVisitor;
import domain.element.Product;


public class Book implements Product {
    
    private int price;
    private String ISBN;

    public Book(int price, String ISBN) {
        this.price = price;
        this.ISBN = ISBN;
    }
    
    @Override
    public int accept(ShoppingCartVisitor visitor) {
        return visitor.visit(this);
    }

    public String getISBN() {
        return ISBN;
    }
    public int getPrice() {
        return price;
    }
    
    
    
}
