package org.launchcode.java.studios;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Double radius;
        Double pi = 3.14;
        Scanner rad;

        rad = new Scanner(System.in);
        System.out.println("Please enter a radius: ");
        radius = rad.nextDouble();

        /*
        TODO - Validate by using an if loop.
        If the user enters a number less than 0,
        print an error message and quit.
         */

        Double area = pi * radius * radius;
        System.out.println("The area of a circle of radius " + radius + " is: " + area);
    }
}
