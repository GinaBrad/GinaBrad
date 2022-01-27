package org.example;

/**
 * Hello world!
 *
 */
public class App

{
    public static void main(String[] args) {
        Cars car1 = new Cars();
        car1.name = "Mercedes";
        car1.color = "Black";
        car1.damaged = true;
        car1.doorCount = 4;
        car1.fuelLevel = 56.7;
        car1.maxSpeed =77.9;
        car1.totalTravelDistance = 200;

        Engine engine1 = new Engine();
        engine1.capacity = 3.0;
        engine1.manufacture = "Mercedes";

        Engine engine2 = new Engine();
        engine2.capacity = 2.2;
        engine2.manufacture = "Opel";



        Cars car2 = new Cars();
        car2.name = "Opel";
        car2.color = "Red";
        car2.damaged = true;
        car2.doorCount = 4;
        car2.fuelLevel = 60.2;
        car2.maxSpeed = 80;
        car2.totalTravelDistance = 220;

        System.out.println("The name of the first car " +  car1.name);
        System.out.println("The name of the second car " + car2.name);
        System.out.println("The color of the car " + car1.color);
        System.out.println("The color of the car " + car2.color);
        System.out.println("Status damage of the car " + car1.damaged);
        System.out.println("Status damage of the car " + car2.damaged);
        System.out.println("The number of the car doors " + car1.doorCount);
        System.out.println("The number of the car doors " + car2.doorCount);
        System.out.println("The fuel level of the car " + car1.fuelLevel );
        System.out.println("The fuel level of the car " + car2.fuelLevel);
        System.out.println("The max speed of the car " + car1.maxSpeed);
        System.out.println("The max speed of the car " + car2.maxSpeed);
        System.out.println("The total travel of the distance " + car1.totalTravelDistance);
        System.out.println("The total travel of the distance " + car2.totalTravelDistance);
        System.out.println("Engine1 capacity " + engine1.capacity);
        System.out.println("Engine2 capacity " + engine2.capacity);
        System.out.println("The manufacture of the car " + engine1.manufacture);
        System.out.println("The manufacture of the car " + engine2.manufacture);

    }


}
