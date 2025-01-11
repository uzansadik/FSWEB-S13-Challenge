package org.example.enums;

public enum Plan {
    BASIC;


    private String name;
    private int price;

     Plan(){
        this.name = "BASIC";
        this.price = 10;
    }

    public String getName() {
         return name;
    }

    public int getPrice() {
         return price;
    }
}
