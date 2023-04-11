/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.homework2oop;

/**
 * The Airplane class represents an airplane with a given speed, number of
 * passengers, and fuel capacity.
 * It contains methods for setting and getting these values, as well as a
 * toString method that displays
 * information about the airplane.
 * 
 * @author night
 */
public class Airplane {

    // Instance variables
    private int speed;
    private int numPassengers;
    private float fuelCapacity;

    /**
     * Constructor for creating a new Airplane object with the specified speed,
     * number of passengers,
     * and fuel capacity.
     * 
     * @param speed         The speed of the airplane in miles per hour.
     * @param numPassengers The number of passengers the airplane can hold.
     * @param fuelCapacity  The maximum amount of fuel the airplane can carry in
     *                      gallons.
     */
    public Airplane(int speed, int numPassengers, float fuelCapacity) {
        this.speed = speed;
        this.numPassengers = numPassengers;
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * Sets the speed of the airplane.
     * 
     * @param speed The speed of the airplane in miles per hour.
     */
    public void setSpeed(int speed) {
        this.speed = speed;
    }

    /**
     * Sets the number of passengers the airplane can hold.
     * 
     * @param numPassengers The number of passengers the airplane can hold.
     */
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }

    /**
     * Sets the maximum amount of fuel the airplane can carry.
     * 
     * @param fuelCapacity The maximum amount of fuel the airplane can carry in
     *                     gallons.
     */
    public void setFuelCapacity(float fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    /**
     * Returns the speed of the airplane.
     * 
     * @return The speed of the airplane in miles per hour.
     */
    public int getSpeed() {
        return speed;
    }

    /**
     * Returns the number of passengers the airplane can hold.
     * 
     * @return The number of passengers the airplane can hold.
     */
    public int getNumPassengers() {
        return numPassengers;
    }

    /**
     * Returns the maximum amount of fuel the airplane can carry.
     * 
     * @return The maximum amount of fuel the airplane can carry in gallons.
     */
    public float getFuelCapacity() {
        return fuelCapacity;
    }

    /**
     * Displays information about the airplane.
     * 
     * @return null (since this method doesn't return anything)
     */
    @Override
    public String toString() {
        System.out.format("This plane can hold %d passengers.\n", this.numPassengers);
        System.out.format("This plane can hold %f gallons of fuel.\n", this.fuelCapacity);
        System.out.format("This plane has a speed of %d passengers.\n", this.speed);
        return null;
    }
}
