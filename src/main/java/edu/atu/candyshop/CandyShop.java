/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.atu.candyshop;

import edu.atu.candies.Candy;
import edu.atu.candies.Hersheys;
import edu.atu.candies.KitKat;
import edu.atu.candies.Reeses;
import edu.atu.candies.Snickers;
import edu.atu.candies.Twix;

import java.util.HashMap;
/**
 *
 * @author tyler
 */
public class CandyShop {
    
    //Prototype objects are often stored in a HashMap.
    //This allows us to clone them without needing to know their base class! */
    
    private static final HashMap<String, Candy> candyMap = new HashMap<>();
    
    static {
        candyMap.put("Reese's", new Reeses());
        candyMap.put("Snickers", new Snickers());
        candyMap.put("KitKat", new KitKat());
        candyMap.put("Hershey's", new Hersheys());
        candyMap.put("Twix", new Twix());
    }
    
    public static Candy getCandy(String candyName) throws CloneNotSupportedException {
        //The .clone() is what makes us grab a clone of the object to display.
        //Otherwise, this candy shop would only have one of each candy! D:
        return (Candy) candyMap.get(candyName).clone();
    }
}
