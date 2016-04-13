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
public class Memory extends Part  {
    
    private String subtype = null;
    private int size = -1;

    public Memory(String type, String title, double price, String subtype, int size) {
        super(type, title, price);
        this.subtype = subtype;
        this.size = size;
    }
}
