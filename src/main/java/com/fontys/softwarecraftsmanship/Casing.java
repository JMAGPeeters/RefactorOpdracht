/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fontys.softwarecraftsmanship;

/**
 *
 * @author Johan
 */
public class Casing extends Part {
    
    private String subtype;

    public Casing(String type, String title, double price, String subtype) {
        super(type, title, price);
        this.subtype = subtype;
    }
    
}
