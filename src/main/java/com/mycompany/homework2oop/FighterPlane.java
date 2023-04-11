/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Declare the package where the class resides
package com.mycompany.homework2oop;

/**
 * A class that represents a fighter plane and extends the Airplane class.
 * It has additional properties such as generation, number of guns and guns
 * array.
 * It also overrides the toString() method to display its properties.
 * 
 * @author night
 */
public class FighterPlane extends Airplane {

    // Public instance variables to hold the generation, number of guns, and guns
    // array
    public int generation;
    public int numGuns;
    public Gun guns[];

    /**
     * Constructor that initializes the properties of the fighter plane.
     * 
     * @param speed         the speed of the fighter plane
     * @param numPassengers the number of passengers the fighter plane can carry
     * @param fuelCapacity  the fuel capacity of the fighter plane
     * @param generation    the generation of the fighter plane
     * @param numGuns       the number of guns on the fighter plane
     * @param guns          an array of guns on the fighter plane
     */
    public FighterPlane(int speed, int numPassengers, float fuelCapacity, int generation, int numGuns, Gun guns[]) {
        // Call the constructor of the Airplane class to initialize its properties
        super(speed, numPassengers, fuelCapacity);

        // Initialize the properties of the FighterPlane class
        this.generation = generation;
        this.numGuns = numGuns;
        this.guns = guns;
    }

    /**
     * Overrides the toString() method to display the properties of the fighter
     * plane.
     * 
     * @return a string representation of the fighter plane
     */
    @Override
    public String toString() {
        // Call the toString() method of the Airplane class to display its properties
        super.toString();

        // Display the additional properties of the FighterPlane class
        System.out.format("This Fighter plane is a generation %d. \n", this.generation);
        System.out.format("This Fighter plane has %d guns. \n", this.numGuns);

        // Display the guns array with its properties
        for (Gun gun : guns) {
            System.out.format("This Fighter plane has a %s %s. \n It has %d of this type. \n", gun.type, gun.name,
                    gun.count);
        }

        return null;
    }

}
