/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.atu.candies;

/**
 *
 * @author tyler
 */
public class Hersheys extends Candy {
    
    //Candy name is set
    public Hersheys() {
        this.candyName = "Hershey's";
    }
    
    //Candy name is displayed
    @Override
    public void candyName() {
        System.out.println(this.candyName);
    }
    
    //The clone() method isn't explictly set, as its extended from the absract class Candy!
}
