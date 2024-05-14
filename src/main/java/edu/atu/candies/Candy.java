/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.atu.candies;

/**
 *
 * @author tyler
 */


//Java has a public interface for Cloneable.
public abstract class Candy implements Cloneable {
    
    protected String candyName;
    
    public abstract void candyName();
    
    //Adding this clone() method is what makes the objects of this class a prototype
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        
        Object clone;
        
        //Creates a copy of the current object and assigns the reference of the new object to the variable clone 
        clone = super.clone();  
        
        return clone;
    }
}
