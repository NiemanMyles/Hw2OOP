/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Declare the package where the class resides
package com.mycompany.homework2oop;

/**
 * A class that represents a gun with its type, name, and count.
 * 
 * @author night
 */
public class Gun {
    
    // Public instance variables to hold the type, name, and count of the gun
    public String type;
    public String name;
    public int count;

    /**
     * Constructor that initializes the properties of the gun.
     * 
     * @param type the type of the gun
     * @param name the name of the gun
     * @param count the count of the gun
     */
    public Gun(String type, String name, int count) {
        // Initialize the properties of the Gun class
        this.type = type;
        this.name = name;
        this.count = count;
    }

}
