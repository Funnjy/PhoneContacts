package com.company;

/**
 * Created by Anton Ilchenko on 09.07.2017.
 */
public class Contacts {
    private String name;
    private int number;

    public Contacts(String name, int number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "Name: " + getName() + ", phone number: " + getNumber() + "";
    }
}
