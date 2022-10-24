package com.gdstruc.otie2.module3;

public class Card {
    private String name;
    private int id;
    public Card(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Card drawn: '" + name + "' ";
    }
}
