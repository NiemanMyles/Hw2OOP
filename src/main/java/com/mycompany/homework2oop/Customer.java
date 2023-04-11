/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Declare the package where the class resides
package com.mycompany.homework2oop;

/**
 * A class that represents a customer with a name and a phone number.
 * 
 * @author night
 */
public class Customer {

    // Public instance variable to hold customer name
    public String name;

    // Public instance variable to hold customer phone number
    public String phone;

    /**
     * Constructor that initializes the name and phone number of the customer.
     * 
     * @param name  the name of the customer
     * @param phone the phone number of the customer
     */
    public Customer(String name, String phone) {
        // Use the "this" keyword to refer to the instance variables of the class
        this.name = name;
        this.phone = phone;
    }
}
