/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.atu.candies;

/**
 *
 * @author tyler
 */
public class KitKat extends Candy {
    
    public KitKat() {
        this.candyName = "KitKat";
    }
    
    @Override
    public void candyName() {
        System.out.println(this.candyName);
    }
}
