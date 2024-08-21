package com.driver;

public class Main {
    public static void main(String[] args) {

        RWOnly obj = new RWOnly();

        // Trying to set and access private variable directly
        //obj.name = "John"; // This line will cause an error
        //System.out.println(obj.name); // This line will also cause an error

        // Errors:
        // 'name' has private access in 'com.driver.RWOnly'

        obj.setName("Shree");

        System.out.println(obj.getName());
    }
}