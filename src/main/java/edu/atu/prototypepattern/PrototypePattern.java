/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package edu.atu.prototypepattern;

import edu.atu.candyshop.CandyShop;
        
/**
 *
 * @author tyler
 */
public class PrototypePattern {

    public static void main(String[] args) throws CloneNotSupportedException {
        CandyShop.getCandy("Hershey's").candyName();
        CandyShop.getCandy("Reese's").candyName();
        CandyShop.getCandy("KitKat").candyName();
        CandyShop.getCandy("Twix").candyName();
        CandyShop.getCandy("Snickers").candyName();
    }
}
