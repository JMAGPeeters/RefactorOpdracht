package com.fontys.softwarecraftsmanship;

public class Part {
    
    private final String type;
    private final String title;
    private final double price;
    
    public Part(String type, String title, double price) {
        this.type = type;
        this.title = title;
        this.price = price;
    }
    
    public String GetType() {
        return type;
    }
    
    public double GetPrice() {
        return price;
    }
}
