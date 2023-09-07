/*Design a class Car having parameterized constructor that takes two arguments as an input i.e noOfGear and color and a printCarInfo method that prints the CarInfo i.e noOfGear and color.

Design another class RaceCar having parameterized constructor has an additional attribute maxSpeed and printRaceCarInfo method that prints the RaceCarInfo i.e noOfGear, color and maxSpeed.

Note: You have to create an object of class RaceCar and call the printRaceCarInfo method.
*/
import java.io.*;

import java.util.* ;
 

import java.util.*;

class Car {
    int noOfGear;
    String color;
    // Write your constructor and printCarInfo method here.
    Car(int noOfGear, String color)
    {   
        this.noOfGear = noOfGear;
        this.color = color;
    }

}

class RaceCar extends Car {
    int maxSpeed;
    // Write your constructor and printRaceCarInfo method here.
    RaceCar(int noOfGear,String color,int maxSpeed)
    {   super(noOfGear,color);
        this.maxSpeed = maxSpeed;
    }
    public void printInfo()
    {
        System.out.println("noOfGear: "+noOfGear);
        System.out.println("color: "+color);
        System.out.println("maxSpeed: "+maxSpeed);
    }
}

class Solution {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int noOfGear = sc.nextInt();

        // [IGNORE]: Extra "end line" in previous line.
        sc.nextLine();

        String color = sc.nextLine();
        int maxSpeed = sc.nextInt();
        RaceCar raceCar = new RaceCar(noOfGear, color, maxSpeed);
        raceCar.printInfo();
    }
}
