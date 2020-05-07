/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

import domain.element.product.Book;
import domain.element.product.Fruit;

/**
 *
 * @author urosv
 */
public interface ShoppingCartVisitor {
    
    int visit(Book book);
    int visit(Fruit fruit);
    
    //Just a method that slows down console printing
    public void putInEffort();
}
