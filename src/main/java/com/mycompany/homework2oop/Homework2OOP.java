package com.mycompany.homework2oop;

public class Homework2OOP {

    public static void main(String[] args) {
        // create an array of Airplane objects
        Airplane planeList[] = new Airplane[4];

        // create an array of Customer objects
        Customer passengerlist[] = new Customer[3];

        // add customers to the passenger list
        passengerlist[0] = new Customer("John Doe", "7657657289");
        passengerlist[1] = new Customer("Jane Doe", "2452384028");
        passengerlist[2] = new Customer("Myles Nieman", "7656678371");

        // create an array of Gun objects
        Gun gunlist[] = new Gun[2];

        // add guns to the gun list
        gunlist[0] = new Gun("Long Range", "Cannon", 1);
        gunlist[1] = new Gun("Close Range", "Missile", 1);

        // create a TransportationPlane object and add it to the airplane list
        planeList[0] = new TransportationPlane("Delta", 10, 20, 30, passengerlist, 895, 100, 3, (float) 30.5);

        // create another TransportationPlane object and add it to the airplane list
        planeList[1] = new TransportationPlane("American Airlines", 10, 20, 30, passengerlist, 235, 100, 3,
                (float) 10.58);

        // create a FighterPlane object and add it to the airplane list
        planeList[2] = new FighterPlane(300, 2, (float) 30.6, 5, 2, gunlist);

        // create another FighterPlane object and add it to the airplane list
        planeList[3] = new FighterPlane(400, 2, (float) 40.6, 6, 2, gunlist);

        // loop through the airplane list and update the cost of the TransportationPlane
        // objects and the number of guns of the FighterPlane objects
        for (Airplane plane : planeList) {
            if (plane instanceof TransportationPlane transportationPlane) {
                int tempCost = transportationPlane.getCost();
                transportationPlane.setCost(tempCost + 100);
            }
            if (plane instanceof FighterPlane fighterPlane) {
                fighterPlane.guns[0].count += 5;
            }
        }

        // loop through the airplane list and print out each airplane's information
        for (Airplane plane : planeList) {
            plane.toString();
            System.out.println();
        }
    }

}
