// This is a Java class named TransportationPlane that extends another class named Airplane.
// It represents a type of airplane that is used for transportation purposes, and it has some specific properties and methods.
package com.mycompany.homework2oop;

/**
 * 
 * This class represents a type of airplane that is used for transportation
 * purposes.
 * 
 * It extends the Airplane class and has some specific properties and methods.
 */
public class TransportationPlane extends Airplane {

    // The name of the airline that owns the plane.
    public String airline;

    // The maximum number of first class passengers that the plane can carry.
    public final int firstCapacity;

    // The maximum number of business class passengers that the plane can carry.
    public final int businessCapacity;

    // The maximum number of economy class passengers that the plane can carry.
    public final int ecoCapacity;

    // An array of Customer objects that represent the passengers on the plane.
    public Customer passengers[];

    // The cost of a ticket for the plane.
    private int cost;

    /**
     * 
     * Constructor that takes several parameters that represent the properties of
     * the plane.
     * It calls the constructor of the parent class Airplane using the super
     * keyword.
     * 
     * @param airline          - The name of the airline that owns the plane.
     * @param firstCapacity    - The maximum number of first class passengers that
     *                         the plane can carry.
     * @param businessCapacity - The maximum number of business class passengers
     *                         that the plane can carry.
     * @param ecoCapacity      - The maximum number of economy class passengers that
     *                         the plane can carry.
     * @param passengers       - An array of Customer objects that represent the
     *                         passengers on the plane.
     * @param cost             - The cost of a ticket for the plane.
     * @param speed            - The speed of the plane.
     * @param numPassengers    - The number of passengers on the plane.
     * @param fuelCapacity     - The fuel capacity of the plane.
     */
    public TransportationPlane(String airline, int firstCapacity, int businessCapacity, int ecoCapacity,
            Customer[] passengers, int cost, int speed, int numPassengers, float fuelCapacity) {
        // Calls the constructor of the parent class Airplane using the super keyword.
        super(speed, numPassengers, fuelCapacity);
        this.airline = airline;
        this.firstCapacity = firstCapacity;
        this.businessCapacity = businessCapacity;
        this.ecoCapacity = ecoCapacity;
        this.passengers = passengers;
        this.cost = cost;
    }

    /**
     * 
     * Getter method that returns the value of cost.
     * 
     * @return - The cost of a ticket for the plane.
     */
    public int getCost() {
        return cost;
    }

    /**
     * 
     * Setter method that sets the value of cost to the provided parameter.
     * 
     * @param cost - The cost of a ticket for the plane.
     */
    public void setCost(int cost) {
        this.cost = cost;
    }

    /**
     * 
     * Overrides the toString() method of the parent class to provide a customized
     * string representation of the object.
     * 
     * @return - A customized string representation of the object.
     */
    @Override
    public String toString() {
        // Calls the toString() method of the parent class.
        super.toString();

        System.out.format("This plane can hold %d first class passengers.\n", this.firstCapacity);
        System.out.format("This plane can hold %d business class passengers.\n", this.businessCapacity);
        System.out.format("This plane can hold %d economy class passengers.\n", this.ecoCapacity);
        System.out.format("The ticket cost is %d.\n", this.getCost());

        // Loops through the passengers array and prints information about each
        // passenger.
        for (Customer passenger : passengers) {
            System.out.format("This plane has a passenger named %s with a phone number of %s. \n", passenger.name,
                    passenger.phone);
        }
        return null;
    }
}
